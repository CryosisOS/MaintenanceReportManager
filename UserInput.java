import java.util.Scanner;
import static java.lang.System.out;

public class UserInput
{
    public static String getString(String prompt)
    {
        String input;
        Scanner sc = new Scanner(System.in);

        out.print(prompt);
        input = sc.nextLine();
        return input;
    }//END getString
}//END class UserInput