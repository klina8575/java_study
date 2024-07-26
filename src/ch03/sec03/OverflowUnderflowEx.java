package ch03.sec03;

public class OverflowUnderflowEx {
    public static void main(String[] args) {
        //오버플로우: 최대 허용범위를 벗어나면 최소값으로 돌아감
        byte var1 = 127;
        System.out.println(++var1);
        System.out.println(++var1);
        System.out.println(++var1);

        //언더플로우: 최소 허용범위를 벗어나면 최대값으로 돌아감
        byte var2 = -128;
        System.out.println(--var2);
        System.out.println(--var2);
        System.out.println(--var2);
    }
}
