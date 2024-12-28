package com.debuggeando_ideas.fundamentals;

import java.util.List;

public class App {
    public static void main(String[] args) {

        //Interface DatabaseService<T> with the methods getById and getAllRecords-> ProductDB DatabaseService<Product>
//        ProductDB productDB = new ProductDB();
//        EmployeeDB employeeDB = new EmployeeDB();
//
//        System.out.println(productDB.getById(2L));
//        System.out.println(employeeDB.getById(1L));


        System.out.println(Product.class.getName());
        System.out.println(Employee.class.getName());
        System.out.println(String.class.getName());

        DatabaseService<String> dbAnonimo = new DatabaseService<String>() {
            @Override
            public String getById(Long id) {
                return "";
            }

            @Override
            public List<String> getAllRecords() {
                return List.of();
            }
        };

        System.out.println(dbAnonimo.getClass());
    }
}
