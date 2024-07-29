package ch04.sec03;

public class SwitchValue {
    public static void main(String[] args) {
        String grade = "B";

        //java11이전 문법
        int score = 0;

        switch (grade) {
            case "A":
                score = 100;
                break;
            case "B":
                int result = 100 - 20;
                score = result;
                break;
            default:
                score = 60;
        }

        System.out.println("score: " + score);

        //java12부터 기능
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result; //변수의 값을 score2에 대입해준다.
            }
            default -> 60;
        };

        System.out.println("score2: " + score2);
    }
}
