import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberStationUpperMax (){
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberStationMax (){
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberStationUnderMin (){
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void numberStationMin (){
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMax (){
        Radio radio = new Radio();

        radio.setIncreaseVolume(101);

        int expected = 100;
        int actual = radio.getIncreaseVolume();
    }
    @Test
    public void volumeMin (){
        Radio radio = new Radio();

        radio.setIncreaseVolume(-1);

        int expected = 0;
        int actual = radio.getIncreaseVolume();
    }
    @Test
    public void volumeAdded (){
        Radio radio = new Radio();

        radio.setIncreaseVolume(99);

        int expected = 100;
        int actual = radio.getIncreaseVolume();
    }
}
