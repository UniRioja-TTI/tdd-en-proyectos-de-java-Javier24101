package com.tt1.test;

/**
 * Implementación de la capa de enlace de datos (Repositorio).
 * Gestiona las operaciones de persistencia de tareas y correos utilizando
 * una base de datos inyectada.
 */
public class Repositorio implements IRepositorio {

    private IDB db;

    /**
     * Constructor del repositorio que inyecta la dependencia de la base de datos.
     * @param db La base de datos (instancia de IDB) que se utilizará para almacenar y recuperar la información.
     */
    public Repositorio(IDB db) {
        this.db = db;
    }

    /**
     * Busca y recupera una tarea específica del repositorio utilizando su nombre.
     * @param nombre El nombre exacto de la tarea a buscar.
     * @return El objeto ToDo correspondiente, o null si la tarea no existe en la base de datos.
     */
    @Override
    public ToDo encontrarToDo(String nombre) {
        return db.leerTarea(nombre);
    }

    /**
     * Busca una tarea por su nombre y cambia su estado a completado.
     * Si la tarea existe, actualiza su información persistiendo el cambio en la base de datos.
     * @param nombre El nombre de la tarea que se desea marcar como completada.
     */
    @Override
    public void marcarComoCompletado(String nombre) {
        ToDo tarea = db.leerTarea(nombre);
        if (tarea != null) {
            tarea.setCompletado(true);
            db.actualizarTarea(tarea);
        }
    }

    /**
     * Almacena una nueva tarea en la base de datos del repositorio.
     * @param tarea El objeto ToDo que se va a guardar.
     */
    @Override
    public void almacenarToDo(ToDo tarea) {
        db.crearTarea(tarea);
    }

    /**
     * Guarda una nueva dirección de correo electrónico en la agenda de la base de datos.
     * @param email La dirección de correo a almacenar.
     */
    @Override
    public void almacenarEmail(String email) {
        db.agregarEmail(email);
    }
}