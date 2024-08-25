package ru.netology.devices;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
public class Radio {

    private int currentVolume = 50;
    private int currentChannel = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;
    private final int minNumberStation = 0;
    private int maxNumberStation = 9;

    public Radio(int countStations) {
        if (countStations > 0) {
            maxNumberStation = countStations - 1;
        }
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
