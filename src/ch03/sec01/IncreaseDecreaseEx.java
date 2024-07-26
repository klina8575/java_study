package ch03.sec01;

public class IncreaseDecreaseEx {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; //1증가
        System.out.println("x= " + x); //11

        ++x; //1증가
        System.out.println("x= "+ x); //12

        y--; //1감소
        System.out.println("y= " + y); //9

        --y; //1감소
        System.out.println("y= " + y); //8

        System.out.println("================================");

        z = x++; //x의 최종값은 12였음
        /*
           후위연산자는 변수에 대입사용할때 주의
           값을 먼저 변수에 대입 후 연산을 진행(선대입 후연산)
           z에 대입을 먼저 진행하고 x값 자체는 나중에 증가시킴
         */
        System.out.println("z= " + z);
        System.out.println("x= " + x);

        z = ++x; //x의 최종값은 13였음
        //연산을 먼저 진행 후에 값을 변수에 대입(선연산, 후대입)
        System.out.println("z= " + z);
        System.out.println("x= " + x);

        System.out.println("===========================");

        //x의 최종값: 14, y의 최종값: 8
        z = ++x + y++;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("y= " + y);
    }
}
