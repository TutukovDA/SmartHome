package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setRadioChannelBelowBorderTest() {
        Radio channel = new Radio();

        channel.setCurrentRadioChannel(-1);

        int expected = 0;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelToLowBorderTest() {
        Radio channel = new Radio();

        channel.setCurrentRadioChannel(0);

        int expected = 0;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelAboveLowBorderTest() {
        Radio channel = new Radio();

        channel.setCurrentRadioChannel(1);

        int expected = 1;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelLowUpperBorderTest() {
        Radio channel = new Radio();

        channel.setCurrentRadioChannel(8);

        int expected = 8;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelToUpperBorderTest() {
        Radio channel = new Radio();

        channel.setCurrentRadioChannel(9);

        int expected = 9;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelAboveUpperBorderTest() {
        Radio channel = new Radio();

        channel.setCurrentRadioChannel(10);

        int expected = 0;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelToLowBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(0);

        channel.nextRadioChannel();

        int expected = 1;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelAboveLowBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(1);

        channel.nextRadioChannel();

        int expected = 2;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelBelowUpperBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(8);

        channel.nextRadioChannel();

        int expected = 9;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelToUpperBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(9);

        channel.nextRadioChannel();

        int expected = 0;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelToLowBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(0);

        channel.prevRadioChannel();

        int expected = 9;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelAboveLowBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(1);

        channel.prevRadioChannel();

        int expected = 0;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelBelowUpperBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(8);

        channel.prevRadioChannel();

        int expected = 7;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelToUpperBorderTest() {
        Radio channel = new Radio();
        channel.setCurrentRadioChannel(9);

        channel.prevRadioChannel();

        int expected = 8;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBelowLowBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeUpperLowBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.increaseVolume();

        int expected = 2;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBelowUpperBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeToUpperBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveUpperBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeToBorderTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.turnDownVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeUpperLowBorderTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.turnDownVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeBelowUpperBorderTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.turnDownVolume();

        int expected = 98;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeToUpperBorderTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.turnDownVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownVolumeAboveUpperBorder() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);

        volume.turnDownVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}