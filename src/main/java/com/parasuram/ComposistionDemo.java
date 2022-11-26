package com.parasuram;

import com.parasuram.models.Address;
import com.parasuram.models.Car;
import com.parasuram.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComposistionDemo {
    public static void main(String[] args) {
        Address address=Address.newBuilder()
                .setPostbox(123)
                .setCity("BLR")
                .setStreet("ECITY")
                .build();
        Car car1= Car.newBuilder()
                .setMake("honda")
                .setModel("accord")
                .setYear(2020)
                .build();
        Car car2= Car.newBuilder()
                .setMake("honda")
                .setModel("civic")
                .setYear(2005)
                .build();
        Person person=Person.newBuilder()
                .setName("ram")
                .setAge(31)
                .setAddress(address)
                .addCar(car1)
                .addCar(car2)
                .build();

        System.out.println(person);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        Person person2=Person.newBuilder()
                .setName("ram")
                .setAge(31)
                .setAddress(address)
                .addAllCar(cars)
                .build();
        System.out.println(person2);
    }
}
