package sample;


import main.java.regular.OtherClass;
import main.java.regular.OutputConsole;

public class Main {
    public static void main(String[] args) {
        int result = OtherClass.pow(5,2);
        System.out.println(OutputConsole.output(result));
        result = OtherClass.rem(5, 2);
        System.out.println(OutputConsole.output(result));

    }
}
