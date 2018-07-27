package sample.intellij;

public class Main {
    public static void main(String... args) {
        //System.out.println("Hello IntelliJ!!");
        Java lang = new Java("Java");
        System.out.println(lang.getName());
        System.out.println(lang.getKind());
    }
}
