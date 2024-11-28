package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        DecoUtil1 decoUtil = new DecoUtil1();
        String result = decoUtil.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + result);
    }
}
