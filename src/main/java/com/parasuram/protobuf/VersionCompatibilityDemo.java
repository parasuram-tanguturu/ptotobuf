package com.parasuram.protobuf;

import com.parasuram.models.Television;
//import com.parasuram.models.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class VersionCompatibilityDemo {

    public static void main(String[] args) throws IOException {
        final Path pathV1 = Paths.get("tv-v1");
        final Path pathV2 = Paths.get("tv-v2");

       /* Television television=Television.newBuilder()
                .setBrand("sony")
                .setType(Type.UHD)
                .setModel(2019)
                        .build();

           Files.write(pathV1,television.toByteArray());*/
        System.out.println(Television.parseFrom(Files.readAllBytes(pathV1)));

       /* Television television=Television.newBuilder()
                .setBrand("sony")
                .setYear(2021)
                .build();
        Files.write(Paths.get("tv-v1"),television.toByteArray());

        byte[] bytes = Files.readAllBytes(Paths.get("tv-v1"));
        System.out.println(Television.parseFrom(bytes));*/

//        byte[] bytes = Files.readAllBytes(Paths.get("tv-v1"));
//        System.out.println(Television.parseFrom(bytes));
//        System.out.println(Television.parseFrom(bytes).getType());
    }
}
