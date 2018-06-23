import java.util.regex.Pattern;

public class App {


    public static void main(String[] args) {

        String passwordString = "M!@jat91";
        String passwordExploded[] = passwordString.split("");

        int capitalCharCount = 0;
        for (int i=0;i<passwordExploded.length; i++) {
            if (passwordExploded[i].matches("[A-Z]")){
                capitalCharCount++;
            }
        }

        System.out.println(capitalCharCount);

    }
}
