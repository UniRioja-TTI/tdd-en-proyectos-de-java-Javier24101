package com.tt1.test.mocks;
import com.tt1.test.IDB;
import com.tt1.test.ToDo;
import java.util.ArrayList;
import java.util.List;

public class DBMock implements IDB {
    public boolean crearLlamado = false;

    @Override
    public void crearTarea(ToDo tarea) { this.crearLlamado = true; }
    @Override public ToDo leerTarea(String nombre) { return null; }
    @Override public void actualizarTarea(ToDo tarea) {}
    @Override public void borrarTarea(String nombre) {}
    @Override public void agregarEmail(String email) {}
    @Override public List<ToDo> getTodasLasTareas() { return new ArrayList<>(); }
    @Override public List<String> getTodosLosEmails() { return new ArrayList<>(); }
}