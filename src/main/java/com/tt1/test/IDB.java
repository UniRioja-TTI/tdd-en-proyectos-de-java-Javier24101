package com.tt1.test;
import java.util.List;
/**
 * Interfaz que define las operaciones de persistencia (Base de Datos) para las tareas y correos.
 */
public interface IDB {
    /**
     * Almacena una nueva tarea en la base de datos.
     * @param tarea La tarea ToDo a guardar.
     */
    void crearTarea(ToDo tarea);
    /**
     * Busca y recupera una tarea de la base de datos usando su nombre.
     * @param nombre El nombre exacto de la tarea a buscar.
     * @return El objeto ToDo si se encuentra, o null si no existe.
     */
    ToDo leerTarea(String nombre);
    /**
     * Actualiza los datos de una tarea existente en la base de datos.
     * @param tarea La tarea ToDo con los datos actualizados.
     */
    void actualizarTarea(ToDo tarea);
    /**
     * Elimina una tarea de la base de datos.
     * @param nombre El nombre de la tarea que se desea borrar.
     */
    void borrarTarea(String nombre);
    /**
     * Añade una dirección de correo electrónico a la base de datos de contactos.
     * @param email La dirección de correo a guardar.
     */
    void agregarEmail(String email);
    /**
     * Recupera una lista con todas las tareas almacenadas.
     * @return Una lista de objetos ToDo.
     */
    List<ToDo> getTodasLasTareas();
    /**
     * Recupera una lista con todos los correos electrónicos almacenados.
     * @return Una lista de cadenas de texto con los emails.
     */
    List<String> getTodosLosEmails();
}