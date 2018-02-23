//IMPORTS
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class FileOut
{
    public static void write(List<Comment> inList)
    {
        FileOutputStream fileStream = null;
        PrintWriter pw = null;

        try
        {
            fileStream = new FileOutputStream("C:\\Users\\nathan\\Desktop\\Report.txt");
            pw = new PrintWriter(fileStream);

            for(int ii=0;ii<inList.size();ii++)
            {
                pw.write(inList.get(ii).getFormattedString());
            }//ENDFOR
            pw.close();
        }//END TRY
        catch(IOException ioex)
        {
            if(fileStream != null)
            {
                try
                {
                    fileStream.close();
                }//ENDTRY
                catch(IOException ioex2)
                {
                    //nothing more to do
                }//END CATCH
            }//ENDIF
            System.out.print("There was an error in file processing.\n");
            System.out.println(ioex.getMessage());
            ioex.printStackTrace();
        }//END CATCH
    }//END write
}//END class FileOut