package com.tt1.test.TestsUnitarios;

import com.tt1.test.MailerStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MailerStubTest {

    @Test
    void testEnviarCorreoDevuelveConfirmacion() {
        MailerStub mailer = new MailerStub();
        String destino = "alumno@unirioja.es";
        String mensaje = "Tarea próxima a vencer";
        boolean resultado = mailer.enviarCorreo(destino, mensaje);
        assertTrue(resultado, "El método enviarCorreo debe devolver true tras la operación");
    }
}