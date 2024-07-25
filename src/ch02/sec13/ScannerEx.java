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



    }
}
