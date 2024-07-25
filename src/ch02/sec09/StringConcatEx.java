package ch02.sec09;

public class StringConcatEx {
    public static void main(String[] args) {
        int x = 20;
        String result1 = 10 + 10 + x + "살입니다.";
        System.out.println("result1: " + result1);

        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);

        String result6 = ("2" + 1) + (10 - 5);
        System.out.println("result6: " + result6);


        int num = 10;

        String str1 = String.valueOf(num);
        System.out.println("str1: " + str1);

        String str2 = String.valueOf(3.14);
        System.out.println("str2: " + str2);

        String str3 = String.valueOf(true);
        System.out.println("str3: " + str3);



    }
}
