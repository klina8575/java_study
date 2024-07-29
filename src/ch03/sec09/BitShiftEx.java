package ch03.sec09;

public class BitShiftEx {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; //num1의 값을 왼쪽으로 3비트 밀어냄
        System.out.println("result1: " + result1);

        int num2 = -8;
        int result2 = num2 >> 3; //num2의 값을 오른쪽으로 3비트 밀어냄
        System.out.println("result2: " + result2);
    }
}
