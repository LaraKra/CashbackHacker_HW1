package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CachbackServiceTest {

    @Test
    public void shouldRemain1000Amount0() {
        CachbackService service = new CachbackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain0Amount1000() {
        CachbackService service = new CachbackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain300Amount1700() {
        CachbackService service = new CachbackService();

        int amount = 1700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain999Amount1() {
        CachbackService service = new CachbackService();

        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain999Amount1001() {
        CachbackService service = new CachbackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldRemain1Amount999() {
        CachbackService service = new CachbackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }
}