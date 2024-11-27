package static1;

public class Data3 {
    public String name;
    public static int count;
    // static변수, 정적변수,클래스 변수 라고 불림.
    // 메소드 영역에서 관리함!


    public Data3(String name) {
        this.name = name;
        count++;
    }
}
