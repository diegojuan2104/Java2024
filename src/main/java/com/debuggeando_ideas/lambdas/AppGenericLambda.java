package com.debuggeando_ideas.lambdas;

import com.debuggeando_ideas.fundamentals.Product;

public class AppGenericLambda {

    public static void main(String[] args) {
        Printer<String> printString = val -> System.out.println(val);

        printString.print("Hello World");

        Printer<Product> printProduct = product -> System.out.println(product);

        Product myProduct = new Product();

        myProduct.setId(1L);

        printProduct.print(myProduct);
    }
}
