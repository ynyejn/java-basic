package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data3 a = new Data3("A");
        System.out.println("A count: " + Data3.count);

        Data3 b = new Data3("B");
        System.out.println("B count: " + Data3.count);

        Data3 c = new Data3("C");
        System.out.println("C count: " + Data3.count);
    }
}
