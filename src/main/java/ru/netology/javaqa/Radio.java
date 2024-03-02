package ru.netology.javaqa;

public class Radio {
    private int RadioStationNumber;
    private int SoundLevel;

    public int getRadioStationNumber() {
        return RadioStationNumber;
    }

    public int getSoundLevel() {
        return SoundLevel;
    }

    public void setRadioStationNumber(int nextRadioStationNumber) {
        if (nextRadioStationNumber > 9) {
            return;
        }
        if (nextRadioStationNumber < 0) {
            nextRadioStationNumber = 9;
        }
        RadioStationNumber = nextRadioStationNumber;
    }

    public void setSoundLevel(int nextSoundLevel) {
        if (nextSoundLevel > 100) {
            nextSoundLevel = 100;
        }
        if (nextSoundLevel < 0) {
            nextSoundLevel = 0;
        }
        SoundLevel = nextSoundLevel;
    }

    public void setToMaxRadioStationNumber() {
        RadioStationNumber = 9;
    }

    public void setToMaxSoundLevel() {
        SoundLevel = 100;
    }

    public void setToMinRadioStationNumber() {
        RadioStationNumber = 0;
    }

    public void setToMinSoundLevel() {
        SoundLevel = 0;
    }

    public void nextRadioStationNumber() {
        if (RadioStationNumber >= 9) {
            RadioStationNumber = 0;
            return;
        }
        RadioStationNumber = RadioStationNumber + 1;
    }

    public void prevRadioStationNumber() {
        if (RadioStationNumber <= 0) {
            RadioStationNumber = 9;
            return;
        }
        RadioStationNumber = RadioStationNumber - 1;
    }

    public void plusSoundLevel() {
        if (SoundLevel >= 100) {
            SoundLevel = SoundLevel;
        }
        if (SoundLevel < 100) {
            SoundLevel = SoundLevel + 1;
        }
    }

    public void minesSoundLevel() {
        if (SoundLevel <= 0) {
            SoundLevel = SoundLevel;
        }
        if (SoundLevel > 0) {
            SoundLevel = SoundLevel - 1;
        }
    }


}
