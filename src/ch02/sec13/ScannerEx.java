package ch02.sec13;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        //1. Scanner 객체 생성
        //자동완성 되는걸 선택해서 사용
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력: ");

        //2. scanner에서 값 입력받기
        String strX = scanner.nextLine();
        System.out.println("입력받은 x값 출력: " + strX);

        System.out.print("y값 입력: ");
        String strY = scanner.nextLine();
        System.out.println("입력받는 Y값 출력: " + strY);

        //String 타입의 문자열을 int타입으로 변경 후 덧셈을 한다.
        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("result: " + result);




    }
}
