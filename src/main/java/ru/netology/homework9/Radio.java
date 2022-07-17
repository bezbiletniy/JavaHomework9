package ru.netology.homework9;

public class Radio {

    // Входные данные для каналов
    private int currentNumber;
    private int minNumber = 0;
    private int maxNumber = 9;

    // Входные данные для громкости
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    // Геттер для номера канала
    public int getCurrentNumber() {
        return currentNumber;
    }

    // Геттер для громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // Сеттер для переключения каналов
    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < minNumber) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    // Сеттер для изменения громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    // Следующий канал
    public void nextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber;
        }
    }

    public void previousNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber;
        }
    }

    public void nextVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void previousVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}