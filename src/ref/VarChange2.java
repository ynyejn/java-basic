package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA:" + dataA + ", dataB: " + dataB);
        System.out.println("dataA.value: " + dataA.value + ", dataB.value: " + dataB.value);

        // dataA와 dataB는 같은 객체를 참조하므로 dataA.value와 dataB.value는 같은 값을 가진다.
        dataA.value = 20;
        System.out.println("dataA.value: " + dataA.value + ", dataB.value: " + dataB.value);

        // dataB.value를 변경하면 dataA.value도 같이 변경된다.
        dataB.value = 30;
        System.out.println("dataA.value: " + dataA.value + ", dataB.value: " + dataB.value);
    }
}
