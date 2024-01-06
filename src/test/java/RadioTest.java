import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setRadioChannelTest() {
        Radio channel = new Radio();
        for (int i = -1; i < 11; i++) {
            channel.setCurrentRadioChannel(i);
        }
    }

    @Test
    public void nextRadioChannelTest() {
        Radio channel = new Radio();
        for (int i = -1; i < 11; i++) {
            channel.nextRadioChannel(i);
        }
    }

    @Test
    public void prevRadioChannelTest() {
        Radio channel = new Radio();
        for (int i = -1; i < 11; i++) {
            channel.prevRadioChannel(i);
        }
    }

    @Test
    public void increaseVolumeTest() {
        Radio volume = new Radio();
        for (int i = -1; i < 101; i++) {
            volume.increaseVolume(i);
        }
    }

    @Test
    public void downVolumeTest() {
        Radio volume = new Radio();
        for (int i = 102; i > -2; i--) {
            volume.downVolume(i);
        }
    }
}
