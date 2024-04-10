package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum1 = 2 * 2 + 3 * 3;
        int sum2 = (2 * 2) + (3 * 3); //위와 같지만 연산자 우선순위가 복잡해진다면 괄호를 넣자

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
