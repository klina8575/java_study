package ch02.sec11;

public class VariableScopeEx {
    public static void main(String[] args) {
        int v1 = 15;

        if (v1 > 10) {
            int v2 = v1 - 10; //블록의 외부에 있는 변수(v1)는 사용 가능
            int num = v2 - 1;
        }

        //int v3 = v1 + 5 + v2; //v1은 같은 main블록 범위 안에 존재하므로 사용 가능
        //블록 내부에 선언한 변수(v2)는 외부에서 사용 할 수 없다.
    }
}
