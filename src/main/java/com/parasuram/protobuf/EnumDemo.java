package com.parasuram.protobuf;

import com.parasuram.models.Bodystyle;
import com.parasuram.models.Car;
import com.parasuram.models.Dealer;

public class EnumDemo {
    public static void main(String[] args) {
        Car car1= Car.newBuilder()
                .setMake("honda")
                .setModel("accord")
                .setYear(2020)
                .setBodyStyle(Bodystyle.COUPE)
                .build();
        Car car2= Car.newBuilder()
                .setMake("honda")
                .setModel("civic")
                .setYear(2005)
                .setBodyStyle(Bodystyle.SUV)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2020, car1)
                .putModel(2005, car2)
                .build();

        System.out.println(dealer.getModelMap());
        System.out.println(dealer.getModelOrThrow(2005).getBodyStyle());
    }
}

