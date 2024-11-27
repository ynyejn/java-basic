package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("data.data: " + bigData.data + ", data.count: " + bigData.count);

        // NullPointerException
        System.out.println("data.data.value: " + bigData.data.value );
    }
}
