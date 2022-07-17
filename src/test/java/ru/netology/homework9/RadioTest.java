package ru.netology.homework9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);

        int expected = 5;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(21);

        int expected = 21;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(5);
        radio.nextNumber();

        int expected = 6;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(21);
        radio.nextNumber();

        int expected = 22;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(7);
        radio.previousNumber();

        int expected = 6;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(21);
        radio.previousNumber();

        int expected = 20;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);
        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextMaxNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(29);
        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(0);
        radio.previousNumber();

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousMinNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(0);
        radio.previousNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(30);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinNumber() {
        Radio radio = new Radio();
        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinNumberNewMaxAmount() {
        Radio radio = new Radio(30);
        radio.setCurrentNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.nextVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.previousVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeNextMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangePreviousMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.previousVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

