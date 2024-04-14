package operator;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산자");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산자");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산자");
        System.out.println(!true);
        System.out.println(!false);
    }
}
