package ch04.sec04;

public class SumFromToEx {
    public static void main(String[] args) {
        int sum = 0;
        int i;

        for (i=1; i<=100; i++) {
            sum += i; //sum = sum + i;
            System.out.println("sum: " + sum + ", i: " + i);
        }

        System.out.println("1~" + (i-1) + "합: " + sum);
    }
}
