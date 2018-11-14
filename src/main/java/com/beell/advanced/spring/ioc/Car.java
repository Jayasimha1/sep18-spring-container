package com.beell.advanced.spring.ioc;

public class Car {
    String model;
    double cost;

    public Car(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
