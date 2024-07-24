package ch02.sec06;

public class TextBlockEx {
    public static void main(String[] args) {
        String str1 = "" +
                "{\n" +
                "\t\"id\":\"winter\",\n" +
                "\t\"name\":\"눈송이\"\n" +
                "}";

        System.out.println(str1);

        //텍스트 블록(쌍따옴표 3개 사용)
        String str2 = """
        {
           "id": "winter",
           "name": "눈송이"
        }
        """;

        System.out.println(str2);

        //블록 내부에서 역슬래시 사용시 한 라인에 출력
        String str = """
              나는 자바를 \
              학습합니다.
              나는 자바 고수가 될 겁니다.
              """;

        System.out.println(str);

    }
}
