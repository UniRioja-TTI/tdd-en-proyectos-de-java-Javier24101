package com.tt1.test.TestsUnitarios;
import com.tt1.test.Servicio;
import com.tt1.test.mocks.MailerMock;
import com.tt1.test.mocks.RepositorioMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ServicioTest {
    private Servicio servicio;
    private RepositorioMock repoMock;
    private MailerMock mailerMock;

    @BeforeEach
    void setUp() {
        repoMock = new RepositorioMock();
        mailerMock = new MailerMock();
        servicio = new Servicio(repoMock, mailerMock);
    }

    @Test
    void testCrearTareaPersisteEnRepositorio() {
        servicio.crearToDo("Nueva Tarea", LocalDate.now());
        assertTrue(repoMock.almacenarTareaLlamado);
    }

    @Test
    void testAgregarEmailPersisteEnRepositorio() {
        servicio.agregarEmailAgenda("test@test.com");
        assertTrue(repoMock.almacenarEmailLlamado);
    }
}