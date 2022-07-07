public class StringApp {
    public static void main(String[] args) {

        System.out.println("Hello World"); // 문자열
        System.out.println('H'); // ''는 Character 를 나타냄
        System.out.println("H");

        System.out.println("Hello " +
                "World"); // 이렇게 해도 줄바꿈은 안됨!
        System.out.println("Hello \nWorld"); // 줄바꿈은 이렇게!
        System.out.println("Hello \"World\""); // \는 특수문자도 출력시켜줌 (escape)

    }
}
