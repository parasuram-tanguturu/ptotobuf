package com.parasuram;

import com.parasuram.models.Address;
import com.parasuram.models.Car;
import com.parasuram.models.Person;

public class ComposistionDemo {
    public static void main(String[] args) {
        Address address=Address.newBuilder()
                .setPostbox(123)
                .setCity("BLR")
                .setStreet("ECITY")
                .build();
        Car car= Car.newBuilder()
                .setMake("honda")
                .setModel("accord")
                .setYear(2020)
                .build();
        Person person=Person.newBuilder()
                .setName("ram")
                .setAge(31)
                .setAddress(address)
                .setCar(car)
                .build();

        System.out.println(person);
    }
}
