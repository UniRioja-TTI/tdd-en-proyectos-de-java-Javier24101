package com.tt1.test.TestsUnitarios;
import com.tt1.test.DBStub;
import com.tt1.test.ToDo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DBStubTest {
    private DBStub db;

    @BeforeEach
    void setUp() { db = new DBStub(); }

    @Test
    void testCrearYLeerTarea() {
        ToDo t = new ToDo();
        t.setNombre("Tarea1");
        db.crearTarea(t);
        assertEquals(t, db.leerTarea("Tarea1"));
    }
}