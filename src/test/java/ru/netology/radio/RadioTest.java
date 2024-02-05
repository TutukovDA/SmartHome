package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio channel = new Radio(30);

    @Test
    public void setRadioChannelBelowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation() - 1);

        int expected = channel.getMinCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelToLowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation());

        int expected = channel.getMinCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelAboveLowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation() + 1);

        int expected = channel.getMinCountRadioStation()+1;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelLowUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation() - 1);

        int expected = channel.getMaxCountRadioStation() - 1;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelToUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation());

        int expected = channel.getMaxCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioChannelAboveUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation() + 1);

        int expected = channel.getMinCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelToLowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation());

        channel.nextRadioChannel();

        int expected = channel.getMinCountRadioStation()+1;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelAboveLowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation() + 1);

        channel.nextRadioChannel();

        int expected =channel.getMinCountRadioStation() + 2;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelBelowUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation() - 1);

        channel.nextRadioChannel();

        int expected = channel.getMaxCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioChannelToUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation());

        channel.nextRadioChannel();

        int expected = channel.getMinCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelToLowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation());

        channel.prevRadioChannel();

        int expected = channel.getMaxCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelAboveLowBorderTest() {
        channel.setCurrentRadioChannel(channel.getMinCountRadioStation() + 1);

        channel.prevRadioChannel();

        int expected = channel.getMinCountRadioStation();
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelBelowUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation() - 1);

        channel.prevRadioChannel();

        int expected = channel.getMaxCountRadioStation() - 2;
        int actual = channel.getCurrentRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioChannelToUpperBorderTest() {
        channel.setCurrentRadioChannel(channel.getMaxCountRadioStation());

        channel.prevRadioChannel();

        int expected = channel.getMaxCountRadioStation() - 1;
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
