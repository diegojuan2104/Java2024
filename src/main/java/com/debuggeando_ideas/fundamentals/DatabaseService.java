package com.debuggeando_ideas.fundamentals;

import java.util.List;

public interface DatabaseService<T> {

    // It is assumed that the methods from an interface are public until java 8,
    // after java 9 it is possible to implement private methods
    T getById(Long id);
    List<T> getAllRecords();

    // Método default (proporciona una implementación por defecto que puede ser utilizada o sobrescrita)
    default int restar(int a, int b) {
        return a - b;
    }

    // Método static (puede ser llamado directamente desde la interfaz, no depende de una instancia)
    static int multiplicar(int a, int b) {
        return a * b;
    }
}
