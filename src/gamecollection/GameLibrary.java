package gamecollection;

import java.util.ArrayList;

public class GameLibrary
{
  private ArrayList<GameCard> cards;

  public GameLibrary()
  {
    cards = new ArrayList<>();
  }

  public void addGameCard(GameCard card)
  {
    if(containsGameCard(card) != true )
    {
    cards.add(card);
    }
  }

  public int getNumberOfCards()
  {
    return cards.size();
  }

  public GameCard getGameCard(int index)
  {
    if(index >= 0 && index < cards.size())
    {
      return cards.get(index);
    }
    return null;
  }

  public GameCard findGameCard(String title)
  {
    for(int i = 0; i < cards.size(); i++)
    {
      if(title.equalsIgnoreCase(cards.get(i).getGame().getTitle()))
      {
        return cards.get(i);
      }
    }
    return null;
  }

  public void removeGameCard(int index)
  {
    if(index >= 0 && index < cards.size())
    {
      cards.remove(index);
    }
  }
  public boolean containsGameCard(GameCard card)
  {
    for(int i = 0; i < cards.size(); i++)
    {
      if(card.getGame().getTitle().equalsIgnoreCase(cards.get(i).getGame().getTitle()))
      {
        return true;
      }
    }
    return false;
  }
  //Sorting method  BUBLE SORT METHOD. W W PYTHON COURSE OF ALGORITHMS
  public void sortByTitle()
  {

  for (int t = 0; t < cards.size() - 1; t++) 
  {
    for (int i = 0; i < cards.size() - 1 - t; i++) // -t cause the last t elements are already sorted
    {
      String title1 = cards.get(i).getGame().getTitle();
      String title2 = cards.get(i + 1).getGame().getTitle();
      if(title1.compareToIgnoreCase(title2) > 0)
      {
        GameCard savedCard = cards.get(i);
        cards.set(i, cards.get(i + 1));
        cards.set(i + 1, savedCard);
      }
    }
  }
  
  
  }

}
