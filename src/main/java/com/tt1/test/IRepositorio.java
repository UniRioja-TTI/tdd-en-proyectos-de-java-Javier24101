package com.tt1.test;

public interface IRepositorio {
    ToDo encontrarToDo(String nombre);
    void marcarComoCompletado(String nombre);
    void almacenarToDo(ToDo tarea);
    void almacenarEmail(String email);
}