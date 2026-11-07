package gamecollection;
public class GameCopy
{
    private String console;
    private String copyType;

    public GameCopy(String console, String copyType)
    {
        this.console = console;
        this.copyType = copyType;
    }

    public void setConsole(String console)
    {
        this.console = console;
    }
    public void setCopyType(String copyType)
    {
        this.copyType = copyType;
    }
    public String getConsole()
    {
        return console;
    }
    public String getCopyType()
    {
        return copyType;
    }
}
