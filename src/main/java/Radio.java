public class Radio {
    private int currentVolume;
    private int currentRadioChannel;

    public void nextRadioChannel(int currentRadioChannel) {
        if (currentRadioChannel >= 9 || currentRadioChannel < 0) {
            currentRadioChannel = 0;
        } else currentRadioChannel = currentRadioChannel + 1;
    }

    public void prevRadioChannel(int currentRadioChannel) {
        if (currentRadioChannel <= 0 || currentRadioChannel > 9) {
            currentRadioChannel = 9;
        } else currentRadioChannel = currentRadioChannel - 1;
    }

    public void setCurrentRadioChannel(int newRadioChannel) {
        if (newRadioChannel > 9) {
            return;
        }
        if (newRadioChannel < 0) {
            return;
        }
        currentRadioChannel = newRadioChannel;
    }

    public int increaseVolume(int currentVolume) {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else if (currentVolume < 0) {
            currentVolume = 0;
        } else currentVolume = currentVolume + 1;
        return currentVolume;
    }

    public int downVolume(int currentVolume) {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else if (currentVolume <= 0) {
            currentVolume = 0;
        } else currentVolume = currentVolume - 1;
        return currentVolume;
    }
}
