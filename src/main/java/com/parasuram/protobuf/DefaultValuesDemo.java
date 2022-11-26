package com.parasuram.protobuf;

import com.parasuram.models.Person;

public class DefaultValuesDemo {
    public static void main(String[] args) {
        Person person=Person.newBuilder().build();

        System.out.println("City is"+ person.getAddress().getCity());

        //has method will be generated for composite object
        System.out.println(person.hasAddress());
    }
}
