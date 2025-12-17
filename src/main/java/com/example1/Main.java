package com.example1;

import java.util.Scanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        try {
            CircleShape circle = context.getBean("circle", CircleShape.class);
            SquareShape square = context.getBean("square", SquareShape.class);

            circle.setRadius(value);
            square.setSide(value);

            System.out.println("the area of the circle = " + circle.getArea());
            System.out.println("the area of the Square = " + square.getArea());
        } finally {
            context.close();
            scanner.close();
        }
    }
}
