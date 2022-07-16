package ru.netology.homework9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void NextNumber() {
        Radio radio = new Radio();
        radio.setNextCurrentNumber(5);

        int expected = 6;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousNumber() {
        Radio radio = new Radio();
        radio.setPreviousCurrentNumber(5);

        int expected = 4;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreThanMaxNumber() {
        Radio radio = new Radio();
        radio.setNextCurrentNumber(10);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinNumber() {
        Radio radio = new Radio();
        radio.setPreviousCurrentNumber(-1);

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NextVolume() {
        Radio radio = new Radio();
        radio.setNextCurrentVolume(7);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PreviousVolume() {
        Radio radio = new Radio();
        radio.setPreviousCurrentVolume(7);

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreThanMaxVolume() {
        Radio radio = new Radio();
        radio.setNextCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanMinVolume() {
        Radio radio = new Radio();
        radio.setPreviousCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
