package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        add(valueData);
        add(valueData);
        add(valueData);
        System.out.println("최종 value: " + valueData.value);
    }

    static void add(ValueData data) {
        data.value++;
        System.out.println("숫자증가 value: " + data.value);
    }
}
