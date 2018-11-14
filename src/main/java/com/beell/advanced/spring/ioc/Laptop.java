package com.beell.advanced.spring.ioc;

public class Laptop {

    String laptop;
    double cost;


    public Laptop(String laptop, double cost) {
        this.laptop = laptop;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptop='" + laptop + '\'' +
                ", cost=" + cost +
                '}';
    }
}
