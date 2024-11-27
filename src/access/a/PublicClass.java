package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();// 자기자신클래스생성
        DefaultClass1 defaultClass1 = new DefaultClass1();// 같은 패키지 내에서는 default 접근 가능
        DefaultClass2 defaultClass2 = new DefaultClass2();// 같은 패키지 내에서는 default 접근 가능
    }
}
class DefaultClass1 {

}
class DefaultClass2 {

}
