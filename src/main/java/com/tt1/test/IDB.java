package com.tt1.test;
import java.util.List;

public interface IDB {
    void crearTarea(ToDo tarea);
    ToDo leerTarea(String nombre);
    void actualizarTarea(ToDo tarea);
    void borrarTarea(String nombre);
    void agregarEmail(String email);
    List<ToDo> getTodasLasTareas();
    List<String> getTodosLosEmails();
}