package static2.ex;

public class Car {
    private static int totalCars;
    private String model;

    public Car(String model) {
        this.model = model;
        totalCars++;
        System.out.println("차량 구입, 이름: " + model);
    }

    public static void showTotalCars() {
        System.out.println("총 구입 차량 대수: " + totalCars);
    }
}
