package gamecollection;
import java.time.LocalDate; // help to use class to work with dates.

public class Game
{
  private String title;
  private LocalDate releaseDate;
  private String genre;

  public Game(String title, LocalDate releaseDate, String genre)
  {
    this.title = title;
    this.releaseDate = releaseDate;
    this.genre = genre;
  }
  public String getTitle()
  {
    return title;
  }
  public LocalDate getReleaseDate()
  {
    return releaseDate;
  }
  public String getGenre()
  {
    return genre;
  }
  public void setTitle(String title)
  {
    this.title = title;
  }
  public void setReleaseDate(LocalDate releaseDate)
  {
    this.releaseDate = releaseDate;
  }
  public void setGenre(String genre)
  {
    this.genre = genre;
  }   


}

