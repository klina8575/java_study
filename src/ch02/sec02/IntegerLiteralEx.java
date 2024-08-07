package ch02.sec02;

public class IntegerLiteralEx {

    public static void main(String[] args) {
        //2진수(0과 1로 작성): 1011 => 0b를 붙여서 작성
        int var1 = 0b1011;
        System.out.println("var1: " + var1); //결과는 10진수로 출력

        //8진수(0~7사이의 숫자로 작성): 206 => 0을 붙여서 작성
        int var2 = 0;
        System.out.println("var2: " + var2); //결과는 10진수로 출력

        //16진수(0~9사이의 숫자와 A~F까지의 문자로 작성): B3 => 0x를 붙여서 작성
        int var4 = 0xB3;
        System.out.println("var4: " + var4); //결과는 10진수로 출력

    }
}
