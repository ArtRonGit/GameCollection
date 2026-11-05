package gamecollection;

import java.time.LocalDate;

public class GameCard
{
  private Game game;
  private String console;
  private String copyType;
  private Double rating;
  private String review;
  private String notes;
  private LocalDate playedDate;

  public GameCard(Game game, String console,String copyType)
  {
    this.game = game;
    this.console = console;
    this.copyType = copyType;
  }
  public void setGame(Game game)
  {
    this.game = game;
  }
  public void setConsole(String console)
  {
    this.console = console;
  }
  public void setCopyType(String copyType)
  {
    this.copyType = copyType;
  }

  public Game getGame()
  {
    return game;
  }
  public String getConsole()
  {
    return console;
  }
  public String getCopyType()
  {
    return copyType;
  }

  public void setRating(double rating)
  {
    // Prevents invalid ratings from being saved,even we will have slider with already  included limits the rating from 0-10
    if(rating >= 0 && rating <= 10)
    {
      this.rating = rating;
    }
    else
    {
      System.out.println("Error: Rating must be between 0 and 10!");
    }
  }

  public Double getRating()
  {
    return rating;
  }

  public void setReview(String review)
  {
    this.review = review;
  }
  public String getReview()
  {
    return review;
  }
  public void setNotes(String notes)
  {
    this.notes = notes;
  }
  public String getNotes()
  {
    return notes;
  }
  public void setPlayedDate(LocalDate playedDate)
  {
    this.playedDate = playedDate;
  }
  public LocalDate getPlayedDate()
  {
    return playedDate;
  }

}
