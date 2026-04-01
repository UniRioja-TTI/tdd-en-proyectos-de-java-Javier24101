package com.tt1.test;

/**
 * Interfaz que define el servicio de envío de correos electrónicos.
 */
public interface IMailer {

    /**
     * Envía un mensaje de correo electrónico a un destinatario.
     * @param direccion La dirección de correo del destinatario.
     * @param mensaje El contenido del mensaje a enviar.
     * @return true si el envío fue exitoso, false en caso de error.
     */
    boolean enviarCorreo(String direccion, String mensaje);
}