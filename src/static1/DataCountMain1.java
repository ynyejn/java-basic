package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 a = new Data1("A");
        System.out.println("A count: " + a.count);

        Data1 b = new Data1("B");
        System.out.println("B count: " + b.count);

        Data1 c = new Data1("C");
        System.out.println("C count: " + c.count);

        // count 가 증가하지 않음. 객체를 생성할 때 마다 새로생성됨.
        // count 를 static 으로 선언해야함.
    }
}
