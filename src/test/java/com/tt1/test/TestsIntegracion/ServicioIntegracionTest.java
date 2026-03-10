package com.tt1.test.TestsIntegracion;
import com.tt1.test.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ServicioIntegracionTest {
    private Servicio servicio;
    private IDB db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
        IRepositorio repositorio = new Repositorio(db);
        IMailer mailer = new MailerStub();
        servicio = new Servicio(repositorio, mailer);
    }

    @Test
    void testCrearTareaApareceEnBaseDeDatos() {
        String nombre = "Tarea desde Servicio";
        LocalDate fecha = LocalDate.now().plusDays(1);
        servicio.crearToDo(nombre, fecha);
        ToDo tareaEnDB = db.leerTarea(nombre);
        assertNotNull(tareaEnDB);
        assertEquals(nombre, tareaEnDB.getNombre());
        assertFalse(tareaEnDB.isCompletado());
    }

    @Test
    void testFinalizarTareaDesdeServicio() {
        servicio.crearToDo("Tarea a finalizar", LocalDate.now());
        servicio.finalizarTarea("Tarea a finalizar");
        assertTrue(db.leerTarea("Tarea a finalizar").isCompletado());
    }
}