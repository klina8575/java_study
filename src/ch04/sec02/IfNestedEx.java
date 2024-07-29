package ch04.sec02;

public class IfNestedEx {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 20) + 81; // 81 ~ 100
        System.out.println("점수: " + score);

/*      81~100점까지의 점수만 받을때 아래 조건을 이용해 점수별 학점을 세분화해 출력하는 코드를 작성하세요.
        90점 이상인 학생 중에서 95점 이상은 A+ 그렇지 않은 학생은 A
        81점 이상인 학생 중에서 85점 이상은 B+ 그렇지 않은 학생은 B*/
        
        String grade;
        
        if(score >= 90) { //90점 이상
            if(score >= 95) { //95점 이상
                grade = "A+";
            } else { // 95점 미만 ~ 90점 이상
                grade ="A";
            }
        } else { //90점 미만 ~ 81점 이상
            if(score >= 85) { //85점 이상
                grade = "B+";
            } else { //85점 미만 ~ 81점 이상
                grade = "B";
            }
        }

        System.out.println("학점: " + grade);

    }
}
