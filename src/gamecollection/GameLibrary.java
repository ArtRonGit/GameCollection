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
    cards.add(card);
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

}
