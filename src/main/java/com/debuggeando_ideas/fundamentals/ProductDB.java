package com.debuggeando_ideas.fundamentals;

import java.util.List;

public class ProductDB implements DatabaseService<Product>{
    @Override
    public Product getById(Long id) {
        Product p1 = new Product();
        p1.setId(id);
        return p1;
    }

    @Override
    public List<Product> getAllRecords() {
        Product p1 = new Product();
        p1.setId(1L);
        Product p2 = new Product();
        p1.setId(2L);
        return List.of(p1, p2);
    }
}
