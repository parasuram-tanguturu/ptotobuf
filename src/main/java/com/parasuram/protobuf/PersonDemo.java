package com.parasuram.protobuf;

import com.parasuram.models.Person;

public class PersonDemo{

    public static void main(String[] args) {

        Person ram1 = Person.newBuilder()
                .setName("ram")
                .setAge(32)
                .build();
        Person ram2 = Person.newBuilder()
                .setName("ram")
                .setAge(32)
                .build();
        System.out.println(ram1.toString());
        System.out.println(ram1.equals(ram2));
        //content comparision happens by default
    }
}
