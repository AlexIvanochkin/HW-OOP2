package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldGetRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldGetSoundLevel() {
        Radio radio = new Radio();
        radio.setSoundLevel(13);

        int expected = 13;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxRadioStationNumber() {
        Radio radio = new Radio();
        radio.setToMaxRadioStationNumber();
        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinRadioStationNumber() {
        Radio radio = new Radio();
        radio.setToMinRadioStationNumber();
        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxSoundLevel() {
        Radio radio = new Radio();

        radio.setToMaxSoundLevel();

        int expected = 100;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinSoundLevel() {
        Radio radio = new Radio();

        radio.setToMinSoundLevel();

        int expected = 0;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperBorderRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerBorderRadioStationNum() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperBorderSoundLevel() {
        Radio radio = new Radio();

        radio.setSoundLevel(101);

        int expected = 100;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerBorderSoundLevel() {
        Radio radio = new Radio();

        radio.setSoundLevel(-1);

        int expected = 0;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnNextRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(2);

        radio.nextRadioStationNumber();

        int expected = 3;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldTurnPreviousRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(3);

        radio.prevRadioStationNumber();

        int expected = 2;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCircleTurnNextRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);

        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCircleTurnPreviousRadioStationNumber() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);

        radio.prevRadioStationNumber();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseSoundLevel() {
        Radio radio = new Radio();

        radio.setSoundLevel(74);

        radio.plusSoundLevel();

        int expected = 75;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceSoundLevel() {
        Radio radio = new Radio();

        radio.setSoundLevel(75);

        radio.minesSoundLevel();

        int expected = 74;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCancelIncreaseSoundLevel() {
        Radio radio = new Radio();

        radio.setSoundLevel(100);

        radio.plusSoundLevel();

        int expected = 100;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCancelReduceSoundLevel() {
        Radio radio = new Radio();

        radio.setSoundLevel(0);

        radio.minesSoundLevel();

        int expected = 0;
        int actual = radio.getSoundLevel();

        Assertions.assertEquals(expected, actual);
    }

}
