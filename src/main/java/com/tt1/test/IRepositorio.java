package com.tt1.test;

/**
 * Interfaz que define la capa de enlace de datos (Repositorio).
 * Actúa como intermediario entre la lógica de negocio y la base de datos.
 */
public interface IRepositorio {

    /**
     * Busca una tarea en el repositorio por su nombre.
     * @param nombre El nombre de la tarea.
     * @return La tarea ToDo correspondiente.
     */
    ToDo encontrarToDo(String nombre);

    /**
     * Marca una tarea específica como completada y guarda el cambio.
     * @param nombre El nombre de la tarea a completar.
     */
    void marcarComoCompletado(String nombre);

    /**
     * Almacena una nueva tarea en el repositorio.
     * @param tarea La tarea a guardar.
     */
    void almacenarToDo(ToDo tarea);

    /**
     * Guarda un correo electrónico en la agenda del repositorio.
     * @param email La dirección de correo a almacenar.
     */
    void almacenarEmail(String email);
}