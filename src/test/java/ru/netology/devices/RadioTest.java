package ru.netology.devices;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "-1,0",
            "1,1",
            "5,5",
            "8,8",
            "9,9",
            "10,0"
    })
    void setCurrentChannel(int numberChanel, int expected) {
        Radio radio = new Radio();
        radio.setCurrentChannel(numberChanel);
        assertEquals(expected, radio.getCurrentChannel());
    }

    @ParameterizedTest
    @CsvSource({
            "25,75",
            "50,100",
            "51,100",
            "49,99"
    })
    void increaseVolume(int countRepeats, int expected) {
        Radio radio = new Radio();
        for (int i = 0; i < countRepeats; i++) {
            radio.increaseVolume();
        }
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "25,25",
            "50,0",
            "51,0",
            "49,1"
    })
    void reduceVolume(int countRepeats, int expected) {
        Radio radio = new Radio();
        for (int i = 0; i < countRepeats; i++) {
            radio.reduceVolume();
        }
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "10,0",
            "9,9",
            "8,8",
            "3,3"
    })
    void increaseChannel(int countRepeats, int expected) {
        Radio radio = new Radio();
        for (int i = 0; i < countRepeats; i++) {
            radio.increaseChannel();
        }
        assertEquals(expected, radio.getCurrentChannel());
    }

    @ParameterizedTest
    @CsvSource({
            "10,0",
            "1,9",
            "9,1",
            "3,7"
    })
    void reduceChannel(int countRepeats, int expected) {
        Radio radio = new Radio();
        for (int i = 0; i < countRepeats; i++) {
            radio.reduceChannel();
        }
        assertEquals(expected, radio.getCurrentChannel());
    }
}