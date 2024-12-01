package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10; //최초 한번만 초기화 가능
//        data1 = 20; //에러 발생

        //final 지역 변수2
        final int data2 = 20;
//        data2 = 30; //에러 발생

    }
    //final 매개변수
    static void method(final int param) {
//        param = 20; //에러 발생
    }
}
