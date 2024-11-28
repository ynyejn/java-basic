package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue = 10; // Cannot make a static reference to the non-static field instanceValue
        // instanceMethod();   // Cannot make a static reference to the non-static method instanceMethod() from the type DecoData

        staticValue++;      // 정적 변수 접근가능
        staticMethod();     // 정적 메소드 접근가능
    }

    // 정적 메소드에서 인스턴스 변수나 메소드에 접근하려면 인스턴스를 변수로 받아야 한다.
    public static void staticCall(DecoData decoData) {
        decoData.instanceValue++; //인스턴스 변수 접근
        decoData.instanceMethod(); //인스턴스 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근 instanceMethod(); //인스턴스 메서드 접근
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }
}
