package ch04.sec02;

public class IfElseIfElseEx {
    public static void main(String[] args) {
//        90점 이상은 A등급
//        80점 이상은 B등급
//        70점 이상은 C등급
//        나머지 점수는 D등급

        int score = 85;

        if (score >= 90) {
            System.out.println("A등급 입니다.");
        } else if (score >= 80) {
            System.out.println("B등급 입니다.");
        } else if (score >= 70) {
            System.out.println("C등급 입니다.");
        } else { //70점 미만의 모든 점수들 처리
            System.out.println("D등급 입니다.");
        }


    }
}
