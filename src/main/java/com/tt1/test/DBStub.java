package com.tt1.test;

import java.util.ArrayList;
import java.util.List;

public class DBStub implements IDB {

    private List<ToDo> tareas;
    private List<String> emails;

    public DBStub() {
        this.tareas = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    @Override
    public void crearTarea(ToDo tarea) {
        tareas.add(tarea);
    }

    @Override
    public ToDo leerTarea(String nombre) {
        for (ToDo t : tareas) {
            if (t.getNombre() != null && t.getNombre().equals(nombre)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void actualizarTarea(ToDo tarea) {
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getNombre() != null && tareas.get(i).getNombre().equals(tarea.getNombre())) {
                tareas.set(i, tarea);
                return;
            }
        }
    }

    @Override
    public void borrarTarea(String nombre) {
        tareas.removeIf(t -> t.getNombre() != null && t.getNombre().equals(nombre));
    }

    @Override
    public void agregarEmail(String email) {
        emails.add(email);
    }

    @Override
    public List<ToDo> getTodasLasTareas() {
        return new ArrayList<>(tareas);
    }

    @Override
    public List<String> getTodosLosEmails() {
        return new ArrayList<>(emails);
    }
}