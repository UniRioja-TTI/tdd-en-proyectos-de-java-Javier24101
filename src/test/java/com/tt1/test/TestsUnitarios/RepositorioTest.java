package com.tt1.test.TestsUnitarios;
import com.tt1.test.Repositorio;
import com.tt1.test.ToDo;
import com.tt1.test.mocks.DBMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepositorioTest {
    private Repositorio repo;
    private DBMock dbMock;

    @BeforeEach
    void setUp() {
        dbMock = new DBMock();
        repo = new Repositorio(dbMock);
    }

    @Test
    void testAlmacenarLlamaADatabase() {
        repo.almacenarToDo(new ToDo());
        assertTrue(dbMock.crearLlamado);
    }
}