package com.tt1.test.TestsUnitarios;
import com.tt1.test.ToDo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {
    @Test
    void testGettersYSetters() {
        ToDo todo = new ToDo();
        todo.setNombre("Test");
        todo.setCompletado(true);
        assertEquals("Test", todo.getNombre());
        assertTrue(todo.isCompletado());
    }
}