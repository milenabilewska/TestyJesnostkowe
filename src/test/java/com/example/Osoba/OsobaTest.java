package com.example.Osoba;

import com.example.Osoba.Osoba;
import org.junit.Assert;
import org.junit.Test;

public class OsobaTest {

    @Test
    public void testGetName  () {
    Osoba osoba = new Osoba("Anna", 25);
    String name = osoba.getName();
        Assert.assertEquals("Anna", name);
    }

    @Test
    public void testGetAge  () {
        Osoba osoba = new Osoba("Anna", 25);
        int age =osoba.getAge();
        Assert.assertEquals(25, age);

    }

}
