import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String myOtherString = "oi tudo bem com vc?";
        String[] strings = myOtherString.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
