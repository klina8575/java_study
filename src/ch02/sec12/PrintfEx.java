package ch02.sec12;

public class PrintfEx {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격: %d원 \n", value); //정수
        System.out.printf("상품의 가격: %6d원 \n", value); //정수 6자리, 왼쪽 공백
        System.out.printf("상품의 가격: %-6d원 \n", value); //정수 6자리, 오른쪽 공백
        System.out.printf("상품의 가격: %06d원 \n", value); //정수 6자리, 왼쪽 빈자리 0으로 채움


        double area = 3.14159 * 10 * 10;

        //정수 7자리 + 소수점 + 소수점 이하 2자리 = 총 10자리, 왼쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이: %10.2f \n", 10, area);

        //정수 3자리 + 소수점 + 소수점 이하 6자리 = 총 10자리, 오른쪽 공백
        System.out.printf("반지름이 %d인 원의 넓이: %-10.2f \n", 10, area);

        //정수 7자리 + 소수점 + 소수점 이하 2자리 = 총 10자리, 왼쪽 공백 0으로 채움
        System.out.printf("반지름이 %d인 원의 넓이: %010.2f \n", 10, area);


        String name = "이지은";
        String job = "가수";
        //6자리 사용 양수값은 왼쪽 공백, 음수값은 오른쪽 공백
        System.out.printf("%6s의 직업은 %-6s입니다", name, job);


    }
}
