package ch03.sec11;

public class ConditionalEx {
    public static void main(String[] args) {
        int score = 85; //점수

        //90점 초과: A등급, 80점 초과: B등급, 80점 미만: C등급
        //grade 변수: 등급저장
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
