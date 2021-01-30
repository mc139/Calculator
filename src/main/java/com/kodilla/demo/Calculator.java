package com.kodilla.demo;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class Calculator {


    private double a;
    private double b;

    public void addNumbers(double a, double b) {
         double sum =  a+b;
        System.out.println("sum is: " + sum);

    }

    public void substractNumbers(double a, double b){
        double difference = a-b;
        System.out.println("difference is: " + difference);
    }


    public static void main(String[] args) {

        Calculator test1 = new Calculator();
        test1.addNumbers(1.5,1.8);
        test1.substractNumbers(16,29);

    }
}
