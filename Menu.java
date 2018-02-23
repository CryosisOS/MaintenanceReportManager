//IMPORTS
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class Menu
{
    public static void mainMenu()
    {
        String input = "Something randome";
        List<Comment> report = new ArrayList<Comment>();

        while(!input.equals("exit"))
        {
            Comment newComment = new Comment();
            //Company name
            input = getName();
            if(exitValid(input))
            {
                continue;
            }//ENDIF
            newComment.setName(input);
            //Server name
            input = getServerName();
            if(exitValid(input))
            {
                continue;
            }//ENDIF
            newComment.setServerName(input);
            //Status
            input = getStatus();
            if(exitValid(input))
            {
                continue;
            }//ENDIF
            newComment.setStatus(input);
            //Description
            input = getDescription();
            if(exitValid(input))
            {
                continue;
            }//ENDIF
            newComment.setDescription(input);

            report.add(newComment);
        }//END WHILE
        FileOut.write(report);
        out.print("Done processing\n");
    }//END mainMenu

    public static String getName()
    {
        String prompt = "\nEnter in the name of the company: ";
        String name;
        name = UserInput.getString(prompt);
        return name;
    }//getName

    public static String getServerName()
    {
        String prompt = "\nEnter in the name of the server: ";
        String name;
        name = UserInput.getString(prompt);
        return name;
    }//getName

    public static String getStatus()
    {
        String prompt = "Enter in the status of the Server: ";
        String status;
        status = UserInput.getString(prompt);
        return status;
    }//ENd getStatus

    public static String getDescription()
    {
        String prompt = "Give a brief description: ";
        String desc;
        desc = UserInput.getString(prompt);
        return desc;
    }//END getDescription

    public static boolean exitValid(String inString)
    {
        boolean isEqual = false;
        if(inString.equals("exit"))
        {
            isEqual = true;
        }//ENDIF
        return isEqual;
    }//END getName
}//END class Menu