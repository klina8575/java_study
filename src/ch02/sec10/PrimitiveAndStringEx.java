package ch02.sec10;

public class PrimitiveAndStringEx {
    public static void main(String[] args) {
        String str = "10";
        int value1 = Integer.parseInt(str);
        System.out.println("value1: " + value1);

        double value2 = Double.parseDouble("3.14");
        System.out.println("value2: " + value2);

        boolean value3 = Boolean.parseBoolean("true");
        System.out.println("value3: " + value3);
    }
}
