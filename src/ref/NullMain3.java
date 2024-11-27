package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("data.data: " + bigData.data + ", data.count: " + bigData.count);

        // NullPointerException
        System.out.println("data.data.value: " + bigData.data.value );
    }
}
