package com.tt1.test;

import java.time.LocalDate;
/**
 * Clase que gestiona la lógica principal de la aplicación.
 * Permite crear tareas, finalizarlas y administrar la agenda de correos electrónicos.
 */
public class Servicio {

    private IRepositorio repositorio;
    private IMailer mailer;
    /**
     * Constructor del servicio.
     * @param repositorio El repositorio de datos a utilizar.
     * @param mailer El servicio de envío de correos.
     */
    public Servicio(IRepositorio repositorio, IMailer mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }
    /**
     * Crea una nueva tarea pendiente y la almacena en el sistema.
     * @param nombre El título de la nueva tarea.
     * @param fechaLimite La fecha tope para realizar la tarea.
     */
    public void crearToDo(String nombre, LocalDate fechaLimite) {
        ToDo nuevaTarea = new ToDo();
        nuevaTarea.setNombre(nombre);
        nuevaTarea.setFechaLimite(fechaLimite);
        nuevaTarea.setCompletado(false);

        repositorio.almacenarToDo(nuevaTarea);
    }
    /**
     * Marca una tarea existente como completada.
     * @param nombre El nombre exacto de la tarea que se quiere finalizar.
     */
    public void finalizarTarea(String nombre) {
        repositorio.marcarComoCompletado(nombre);
    }
    /**
     * Añade una nueva dirección de correo a la agenda del sistema.
     * @param email La dirección de correo electrónico a guardar.
     */
    public void agregarEmailAgenda(String email) {
        repositorio.almacenarEmail(email);
    }
}