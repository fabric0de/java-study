package variable;

public class Var6 {
    public static void main(String[] args) {
        //정수, int 값을 넘는 경우 끝에 L
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수, 실수는 double이 기본
        float f = 10.0f;  //float < double
        double d = 10.0;
    }
}
