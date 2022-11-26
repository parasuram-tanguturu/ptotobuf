package com.parasuram;

import com.parasuram.models.Car;
import com.parasuram.models.Dealer;

public class MapDemo {
    public static void main(String[] args) {
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

        Dealer dealer = Dealer.newBuilder()
                .putModel(2020, car1)
                .putModel(2005, car2)
                .build();

        System.out.println(dealer);

        System.out.println("dealer  "+dealer.getModelOrThrow(2020));
        System.out.println("dealer  "+dealer.getModelOrDefault(2002,car2));
    }
}
