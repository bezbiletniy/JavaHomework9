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

    // Следующий канал
    public void setNextCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > maxNumber) {
            newCurrentNumber = minNumber;
        } else {
            newCurrentNumber = newCurrentNumber + 1;
        }
        currentNumber = newCurrentNumber;
    }

    // Предыдущий канал
    public void setPreviousCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber < minNumber) {
            newCurrentNumber = maxNumber;
        } else {
            newCurrentNumber = newCurrentNumber - 1;
        }
        currentNumber = newCurrentNumber;
    }

    // Увеличение громкости
    public void setNextCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        } else {
            newCurrentVolume = newCurrentVolume + 1;
        }
        currentVolume = newCurrentVolume;
    }

    // Уменьшение громкости
    public void setPreviousCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        } else {
            newCurrentVolume = newCurrentVolume - 1;
        }
        currentVolume = newCurrentVolume;
    }


}
