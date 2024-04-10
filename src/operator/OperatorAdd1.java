package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //전위 증감연산자
        ++a;
        System.out.println("a = " + a); //3

        --a;
        System.out.println("a = " + a); //2

        //후위 증감연산자
        int b = 1;
        int c = 0;

        c = b++; //b의 현재값을 c에 먼저 대입하고, 그 후 b값을 증가
        System.out.println("b = " + b + ", c = " + c);

    }
}
