package ch02.sec06;

public class StringEx {
    public static void main(String[] args) {
//        char var1 = "A"; //char 타입은 큰따옴표 사용 X
//        char var2 = '홍길동'; // char타입은 문자열 1개만 작성 가능

        //문자열 타입(쌍따옴표 안에 작성)
        String name = "홍길동";
        String job = "프로그래머";
        //문자열 합산
        String text = name + "은 " + job + "입니다.";

        System.out.println(name + "은 " + job + "입니다.");
        System.out.println(text);

        //작은따옴표 출력
        String str = "나는 '자바'를 배웁니다.";
        System.out.println(str);

        //큰따옴표 출력(역슬래시 이용)
        str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);


    }
}
