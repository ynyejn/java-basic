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

        //추가
        //인스턴스를 통한 접근
        Data3 d = new Data3("D");
        System.out.println(d.count);

        //클래스를 통한 접근
        System.out.println(Data3.count);

        //둘다 가능함. 하지만 정적변수는 클래스를 통한 접근을 권장함
        //코드를 읽을때 마치 인스턴스 변수를 읽는것처럼 보이기 때문
    }
}
