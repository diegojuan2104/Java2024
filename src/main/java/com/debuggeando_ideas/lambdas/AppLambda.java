package com.debuggeando_ideas.lambdas;

import java.util.List;

public class AppLambda {

    public static void main(String[] args) {

        List<String> counties = List.of("Colombia","Mexico","Argentina","Chile");

        for(String country:counties){
            System.out.println(country);
        }

        counties.forEach(c -> System.out.println(c.toUpperCase()));
    }
}
