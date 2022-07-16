package ru.netology.homework9;

public class Radio {
    public int currentNumber;
    public int minNumber = 0;
    public int maxNumber = 9;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) {
        if (newCurrentNumber > maxNumber) {
            newCurrentNumber = minNumber;
        }
        if (newCurrentNumber < minNumber) {
            newCurrentNumber = maxNumber;
        }
        currentNumber = newCurrentNumber;
    }

    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 10;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }
}
