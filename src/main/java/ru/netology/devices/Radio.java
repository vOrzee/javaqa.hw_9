package ru.netology.devices;

public class Radio {

    private int currentVolume = 50;
    private int currentChannel;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= 0 && currentChannel <= 9) {
            this.currentChannel = currentChannel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void increaseChannel() {
        if (currentChannel < 9) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void reduceChannel() {
        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = 9;
        }
    }
}
