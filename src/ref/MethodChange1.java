package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("메소드 호출전: " + a);
        changePrimitive(a);
        System.out.println("메소드 호출후: " + a);
    }

    private static void changePrimitive(int x) {
        x = 20;
    }
}
