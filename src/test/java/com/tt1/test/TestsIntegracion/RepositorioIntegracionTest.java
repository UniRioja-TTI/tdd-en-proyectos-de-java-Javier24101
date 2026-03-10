package com.tt1.test.TestsIntegracion;
import com.tt1.test.DBStub;
import com.tt1.test.IDB;
import com.tt1.test.Repositorio;
import com.tt1.test.ToDo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepositorioIntegracionTest {
    private Repositorio repositorio;
    private IDB db;

    @BeforeEach
    void setUp() {
        db = new DBStub();
        repositorio = new Repositorio(db);
    }

    @Test
    void testAlmacenarYRecuperarTarea() {
        ToDo tarea = new ToDo();
        tarea.setNombre("Tarea Integración");
        repositorio.almacenarToDo(tarea);
        ToDo recuperada = repositorio.encontrarToDo("Tarea Integración");
        assertNotNull(recuperada);
        assertEquals("Tarea Integración", recuperada.getNombre());
    }

    @Test
    void testMarcarComoCompletadoPersisteEnDB() {
        ToDo tarea = new ToDo();
        tarea.setNombre("Pendiente");
        tarea.setCompletado(false);
        db.crearTarea(tarea);
        repositorio.marcarComoCompletado("Pendiente");
        assertTrue(db.leerTarea("Pendiente").isCompletado());
    }
}