package com.parasuram;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.parasuram.json.JPerson;
import com.parasuram.models.Person;

import java.io.IOException;

public class PerformanceTest {

    public static void main(String[] args) {
        //jsom
        JPerson person=new JPerson();
        person.setName("ram");
        person.setAge(32);
        ObjectMapper mapper=new ObjectMapper();

        Runnable json=()->{
            try {
                byte[] bytes = mapper.writeValueAsBytes(person);
                JPerson person1 = mapper.readValue(bytes, JPerson.class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };


        //protobuf
        Person ram = Person.newBuilder()
                .setName("ram")
                .setAge(32)
                .build();

        Runnable proto=()->{
            try {
                byte[] bytes = ram.toByteArray();
                Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        for (int i=0;i<=5;i++){
            runPeformaceTest(json,"JSON");
            runPeformaceTest(proto,"PROTO");
        }

    }
    
    private static void runPeformaceTest(Runnable runnable,String method){
            long time1=System.currentTimeMillis();
            for (int i=1;i<5_000_000;i++){
                runnable.run();
            }
            long time2=System.currentTimeMillis();
            System.out.println(method+" : "+(time2-time1)+"ms");
    }
}