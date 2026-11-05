package gamecollection;

public class Collector
{
  private int id;
  private String username;
  private GameLibrary library;

  public Collector(int id, String username)
  {
    this.id = id;
    this.username = username;
    this.library = new GameLibrary(); // We creating own gamelibrary 4 each user/collector
  }


  public void setUsername(String username)
  {
    this.username = username;
  }

  public int getId()
  {
    return id;
  }

  public String getUsername()
  {
    return username;
  }
  public GameLibrary getLibrary()
  {
    return library;
  }

}
