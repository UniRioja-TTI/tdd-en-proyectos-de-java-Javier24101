package com.tt1.test.mocks;
import com.tt1.test.IRepositorio;
import com.tt1.test.ToDo;

public class RepositorioMock implements IRepositorio {
    public boolean almacenarTareaLlamado = false;
    public boolean almacenarEmailLlamado = false;

    @Override public void almacenarToDo(ToDo tarea) { this.almacenarTareaLlamado = true; }
    @Override public void almacenarEmail(String email) { this.almacenarEmailLlamado = true; }
    @Override public ToDo encontrarToDo(String nombre) { return null; }
    @Override public void marcarComoCompletado(String nombre) {}
}