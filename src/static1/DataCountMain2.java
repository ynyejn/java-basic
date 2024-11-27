package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count: " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count: " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count: " + counter.count);

        //Counter 인스턴스를 공용으로 사용해 객체생성시 count를 증가시킴.
        //but Data2객체와 별개로 Counter 인스턴스를 따로 생성해야 함.  생성자에 매개변수도 추가돼서 별로..
    }
}
