package ch03.sec04;

public class AccuracyEx2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number; //산술연산을 정확하게 하려면 정수타입의 값들로 연산
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result / 10.0);

    }
}
