package ch02.sec13;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        //1. Scanner 객체 생성
        //자동완성 되는걸 선택해서 사용
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");

        //2. scanner에서 값 입력받기
        //int타입으로 바로 값을 입력받을 수 있음
        int strX = scanner.nextInt();
        System.out.println("입력받은 x값 출력: " + strX);

        System.out.print("y값 입력: ");
        int strY = scanner.nextInt();
        System.out.println("입력받는 Y값 출력: " + strY);

        int result = strX + strY;
        System.out.println("result: " + result);




    }
}
