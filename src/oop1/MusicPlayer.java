package oop1;

public class MusicPlayer {
    //속성과 기능을 한곳으로 모아 캡슐화, 객체지향
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼룸:" + volume);

    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼룸:" + volume);

    }
    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼룸:" + volume);
        }
        else {
            System.out.println("음악 플레이어 OFF");

        }
    }
}
