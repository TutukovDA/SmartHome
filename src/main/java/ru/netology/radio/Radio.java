package ru.netology.radio;

public class Radio {

    private int currentVolume;
    private int currentRadioChannel;
    private int maxCountRadioStation = 9;
    private int minCountRadioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else currentVolume = maxVolume;
        return currentVolume;
    }

    public int turnDownVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else currentVolume = minVolume;
        return currentVolume;
    }

    public int getCurrentRadioChannel() {
        return currentRadioChannel;
    }

    public void setCurrentRadioChannel(int newCurrentRadioChanel) {
        if (newCurrentRadioChanel > maxCountRadioStation) {
            return;
        }
        if (newCurrentRadioChanel < minCountRadioStation) {
            return;
        }
        currentRadioChannel = newCurrentRadioChanel;
    }


    public int nextRadioChannel() {
        if (currentRadioChannel != maxCountRadioStation) {
            currentRadioChannel++;
        } else
            currentRadioChannel = minCountRadioStation;
        return currentRadioChannel;
    }

    public int prevRadioChannel() {
        if (currentRadioChannel != minCountRadioStation) {
            currentRadioChannel--;
        } else {
            currentRadioChannel = maxCountRadioStation;
        }
        return currentRadioChannel;
    }

}
