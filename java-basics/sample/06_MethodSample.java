public class MethodSample {

    public static void greet(String name) {
        System.out.println("こんにちは、" + name + "さん");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet("Taro");
        int result = add(3, 5);
        System.out.println("合計: " + result);
    }
}