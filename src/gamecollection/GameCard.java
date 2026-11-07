package gamecollection;

import java.time.LocalDate;
import java.util.ArrayList;

public class GameCard
{
  private Game game;
  private ArrayList<GameCopy> copies;
  private Double rating;
  private String review;
  private String notes;
  private LocalDate playedDate;

  public GameCard(Game game)
  {
    this.game = game;
    this.copies = new ArrayList<>();
  }
  
  public void setGame(Game game)
  {
    this.game = game;
  }

  
  public int getNumberOfCopies()
  {
    return copies.size();
  }
  public GameCopy getCopy(int index)
  {
    if(index >= 0 && index < copies.size())
    {
      return copies.get(index);
    }
    return null;
  }

  public boolean containsCopy(GameCopy copy)
  {
    for(int i = 0; i < copies.size();i++)
    {
      if(copy.getConsole().equalsIgnoreCase(copies.get(i).getConsole()) && copy.getCopyType().equalsIgnoreCase(copies.get(i).getCopyType()))
      {
        return true;
      }
    }
    return false;
  }

  public void addCopy(GameCopy copy)
  {
    if(containsCopy(copy) != true)
    {
      copies.add(copy);
    }
  }
  public void removeCopy(int index)
  {
    if(index >= 0 && index < copies.size())
    {
      copies.remove(index);
    }
  }

  

  public Game getGame()
  {
    return game;
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


  //Need to realize chicking the console of copies;

  public boolean hasConsole(String console)
  {
    for(int i = 0; i < copies.size(); i++)
    {
      if(copies.get(i).getConsole().equalsIgnoreCase(console))
      {
        return true;
      }
    }
    return false;
  }
}
