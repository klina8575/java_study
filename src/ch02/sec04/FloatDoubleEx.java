package ch02.sec04;

public class FloatDoubleEx {
    public static void main(String[] args) {

        //실수형은 기본 리터럴을 double 타입으로 인식하므로 F를 붙여준다.(대소문자 상관 X)
        float var1 = 0.1234567F; //소수점 이하 7자리
        double var2 = 0.1234567891234567891234; //소수점 이하 15자리

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        //가수와 지수 나눠서 작성하기
        double var3 = 3e6; // 3.0 X 10^6
        System.out.println("var3: " + var3);

        float var4 = 3e6F; // 3.0 X 10^6
        System.out.println("var4: " + var4);

        double var5 = 2e-3; // 2.0 X 10^-3
        System.out.println("var5: " + var5);
    }
}
