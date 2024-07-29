package ch03.sec07;

public class LogicalOperatorEx {
    public static void main(String[] args) {
//        int charCode = 'A'; //65
//        int charCode = 'a'; //97
        int charCode = '5'; //53

        //65(A) ~ 90(Z) 사이의 문자인지 판단 -> 대문자
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("대문자입니다.");
        }

        //97(a) ~ 122(z) 사이의 문자인지 판단 -> 소문자
        if((97 <= charCode) && (charCode <= 122)) {
            System.out.println("소문자입니다.");
        }

        //48(0) ~ 57(9) 사이의 문자인지 판단 -> 숫자
        if((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9사이의 숫자입니다.");
        }


        System.out.println("-----------------------------");

//        int value = 8;
        int value = 7;

        if((value % 2 == 0) || (value % 3 == 0)) {
            System.out.println("2의 배수 또는 3의 배수 입니다.");
        }

        boolean result = (value % 2 == 0) || (value % 3 == 0);

        if (!result) {
            System.out.println("2또는 3의 배수가 아닙니다.");
        }


        System.out.println("---------------------------");

        int x = 10;
        int y = 20;
        int z = 30;

        //논리연산자는 괄호를 사용하면 우선순위가 바뀐다.
        if ( (x >= 1 && y >= 8) && (z < 10 || y > 20)) {
            System.out.println("첫번째 if문 조건식의 결과는 true입니다.");
        }

        if ( x >= 1 && (y >= 8 || z < 10)) {
            System.out.println("두번째 if문 조건식의 결과는 true입니다.");
        }


    }
}
