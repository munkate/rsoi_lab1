package ru.rsoi.lab1;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

import ru.rsoi.lab1.controllers.IndexController;

public class IndexControllerTest {
    @Test
    public void testhello()
    {
        IndexController controller = new IndexController();
        assertEquals("Hello world!", controller.hello(null,null));
    }
}
