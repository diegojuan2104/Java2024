package com.debuggeando_ideas.fundamentals;

import java.util.List;

public class PostgresDB implements DatabaseService{
    @Override
    public String getById(Long id) {
        return "Getting data from Postgres with id: " + id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("Hello World postgres");
    }
}
