package com.tt1.test;

import java.time.LocalDate;
/**
 * Clase JavaBean que representa una tarea pendiente (ToDo) en el sistema.
 * Almacena la información de la tarea como su nombre, descripción, fecha límite y estado.
 */
public class ToDo {
    private String nombre;
    private String descripcion;
    private LocalDate fechaLimite;
    private boolean completado;
    /**
     * Constructor por defecto de la tarea.
     */
    public ToDo() {
    }
    /**
     * Obtiene el nombre de la tarea.
     * @return El nombre actual de la tarea.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Establece el nombre de la tarea.
     * @param nombre El nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene la descripción de la tarea.
     * @return La descripción actual.
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Establece la descripción de la tarea.
     * @param descripcion La descripción a asignar.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * Obtiene la fecha límite de la tarea.
     * @return La fecha límite como objeto LocalDate.
     */
    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    /**
     * Establece la fecha límite de la tarea.
     * @param fechaLimite La fecha límite a asignar.
     */
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    /**
     * Comprueba si la tarea está completada.
     * @return true si está completada, false en caso contrario.
     */
    public boolean isCompletado() {
        return completado;
    }
    /**
     * Establece el estado de completado de la tarea.
     * @param completado true para marcar como completada, false para pendiente.
     */
    public void setCompletado(boolean completado) {
        this.completado = completado;
    }
}