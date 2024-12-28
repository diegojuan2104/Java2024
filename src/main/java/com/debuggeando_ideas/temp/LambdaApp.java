package com.debuggeando_ideas.temp;

public class LambdaApp {
    public static void main(String[] args) {

        Math substract = new Math() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        Math multiply = (a,b) -> a*b;

        Math divide = (a,b) -> {
            System.out.println("start");
            return a/b;
        };

        System.out.println(substract.execute(5.0,5.0));
        System.out.println(multiply.execute(10.0,10.0));
        System.out.println(divide.execute(2.2,3.9));
    }
}
