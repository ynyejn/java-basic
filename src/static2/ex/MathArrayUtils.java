package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private 생성자로 인스턴스화 방지
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] array) {
        return sum(array) / array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
}
