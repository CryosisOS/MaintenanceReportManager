public class Comment
{
    //CLASS FIELDS
    private String name;
    private String serverName;
    private String status;
    private String description;

    public Comment()
    {
        name = "n/a";
        status = "n/a";
        description = "n/a";
    }

    public void setName(String inName)
    {
        name = inName;
    }//END setName

    public void setServerName(String inName)
    {
        serverName = inName;
    }//END setServerName

    public void setStatus(String inStatus)
    {
        status = inStatus;
    }//END setStatus

    public void setDescription(String inDescription)
    {
        description = inDescription;
    }//END setDescription

    public String getFormattedString()
    {
        String outStr;
        outStr = "Company Name: "+name+"\r\nServer Name: "+serverName+"\r\nServer status: "+status+"\r\nDescription: "+description+"\r\n\r\n";
        return outStr;
    }//get FormmattedString
}//END class Comment