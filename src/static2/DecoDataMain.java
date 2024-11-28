package static2;

import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        staticCall();   //import static static2.DecoData.*; 로 선언했기 때문에 DecoData. 생략 가능
        staticCall();
        staticCall();
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData decoData = new DecoData();
        decoData.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        System.out.println("4. 정적 호출2");
        DecoData data2= new DecoData();
        staticCall(data2);

        //추가
        //인스턴스를 통한 접근(비권장)
        //인스턴스를 통해 정적 메소드를 호출하면 컴파일러가 경고를 표시한다.
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근
        staticCall();


    }
}
