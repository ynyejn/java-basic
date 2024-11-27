package access;

public class Speaker {
    private int volumn;

    Speaker(int volumn) {
        this.volumn = volumn;
    }

    void volumnUp() {
        if (volumn>=100) {
            System.out.println("볼륨을 더 높일 수 없습니다.");
        }else {
            volumn += 10;
            System.out.println("음량을 10 올렸습니다.");
        }
    }

    void volumnDown() {
        if (volumn<=0) {
            System.out.println("볼륨을 더 낮출 수 없습니다.");
        }else {
            volumn -= 10;
            System.out.println("음량을 10 내렸습니다.") ;
        }
    }

    void showVolumn() {
        System.out.println("현재 볼륨: " + volumn);
    }
}
