package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메소드 호출전: " + dataA.value);
        System.out.println("dataA: " + dataA);
        changeReference(dataA);
        System.out.println("메소드 호출후: " + dataA.value);
    }

    private static void changeReference(Data data) {
        System.out.println("data: " + data);
        data.value = 20;
    }
}
