package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 증가
        volumeUp(data);
        // 볼륨 감소
        volumeDown(data);
        // 음악 플레이어 상태
        showStatus(data);
        // 음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("플레이어 켜기");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어 끄기");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨 증가: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨 감소: " + data.volume);
    }
    static void showStatus(MusicPlayerData data) {
        System.out.println("플레이어 상태확인");
        if (data.isOn) {
            System.out.println("플레이어 On, 볼륨 " + data.volume);
        } else {
            System.out.println("플레이어 Off");
        }
    }
}
