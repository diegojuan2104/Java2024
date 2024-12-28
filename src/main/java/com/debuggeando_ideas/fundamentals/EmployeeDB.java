package com.debuggeando_ideas.fundamentals;

import java.util.List;
import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee> {

    @Override
    public Employee getById(Long id) {
        Employee e1 = new Employee();
        e1.setId(id);
        e1.setName("pepe");
        e1.setSalary(100000.0);
        return e1;
    }

    @Override
    public List<Employee> getAllRecords() {
        return List.of();
    }
}
