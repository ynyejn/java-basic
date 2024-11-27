package static1;

public class Data3 {
    public String name;         // 멤버변수->인스턴스 변수
    public static int count;    // 멤버변수->클래스 변수, 정적변수, static변수
    // 메소드 영역에서 관리함! 자바프로그램 시작할 때 딱 1개 만들어짐.


    public Data3(String name) {
        this.name = name;
        count++;
    }
}
