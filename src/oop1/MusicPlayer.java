package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("플레이어 켜기");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 끄기");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 증가: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨 감소: " + volume);
    }

    void showStatus() {
        System.out.println("플레이어 상태확인");
        if (isOn) {
            System.out.println("플레이어 On, 볼륨 " + volume);
        } else {
            System.out.println("플레이어 Off");
        }
    }
}
