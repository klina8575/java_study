package ch04.sec02;

public class IfEx {
    public static void main(String[] args) {
/*      문제) 90점 이상이면  ‘점수가 90보다 큼’, ‘등급은 A’ 를 출력하고
        90미만이면 ‘점수가 90보다 작음’, ‘등급은 B’ 를 출력하세요  */

        int score = 89;

        //90점 이상일때
        if(score >= 90) {
            System.out.println("점수가 90점 보다 큼");
            System.out.println("등급은 A");
        }

        //90점 미만일때
        if(score < 90) {
            System.out.println("점수가 90점 보다 작음");
            System.out.println("등급은 B");
        }

    }
}
