package com.parasuram.protobuf;

import com.parasuram.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo{

    public static void main(String[] args) throws IOException {

        Person ram1 = Person.newBuilder()
                .setName("ram")
                .setAge(32)
                .build();
        System.out.println(ram1.toString());

        Path path=Paths.get("ram.serFile");
        Files.write(path,ram1.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Person  ramDeserilzed = Person.parseFrom(bytes);
        System.out.println(ramDeserilzed.toString());

    }
}
