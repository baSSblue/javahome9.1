public class Radio {
    private int currentStation;
    private int currentVolume;
    private int increaseVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getIncreaseVolume() {
        return increaseVolume;
    }

    public void setIncreaseVolume(int increaseVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
    }
}
