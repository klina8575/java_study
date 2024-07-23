package ch02.sec01;

public class VariableExchangeEx {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        System.out.println("x: " + x + ", y: " + y);

        //x = y; // x: 5, y: 5
        //y = x; // y: 5, x: 5

        //두 변수의 값을 교환하는 방법
        int temp = x; //temp: 3
        x = y; //x: 5
        y = temp;

        System.out.println("x: " + x + ", y: " + y);




    }
}
