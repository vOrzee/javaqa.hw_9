package ru.netology.devices;

public class Radio {

    private int currentVolume = 50;
    private int currentChannel = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private final int minNumberStation = 0;
    private int maxNumberStation = 9;

    public Radio() {}
    public Radio(int countStations) {
        if (countStations > 0) {
            maxNumberStation = countStations - 1;
        }
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= minNumberStation && currentChannel <= maxNumberStation) {
            this.currentChannel = currentChannel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void nextButtonPressed() {
        if (currentChannel < maxNumberStation) {
            currentChannel++;
        } else {
            currentChannel = minNumberStation;
        }
    }

    public void prevButtonPressed() {
        if (currentChannel > minNumberStation) {
            currentChannel--;
        } else {
            currentChannel = maxNumberStation;
        }
    }
}
