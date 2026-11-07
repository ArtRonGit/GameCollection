package gamecollection;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<Game> games = new ArrayList<>();

    Game game1 = new Game("Minecraft", LocalDate.of(2011,11,18), "Sandbox");
    Game game2 = new Game("Dota2", LocalDate.of(2013,7,9), "Moba");

    games.add(game1);
    games.add(game2);
    for(int i = 0;i < games.size(); i++)
    {
      System.out.println("Game: " + games.get(i).getTitle() + "|  Genre: " + games.get(i).getGenre() + "|  ReleaseDate: " +  games.get(i).getReleaseDate());
    }
    Collector collector1 = new Collector(1, "Artur");
    Collector collector2 = new Collector(2, "Lukash");

    GameCard card1 = new GameCard(game1);
    GameCard card2 = new GameCard(game2);
    
    card1.addCopy(new GameCopy("PC", "Digital"));
    card2.addCopy(new GameCopy("PS", "Digital"));
    card1.setRating(8.92);
    card2.setRating(8.1);
    collector1.getLibrary().addGameCard(card1);
    collector1.getLibrary().addGameCard(card2);
    
    collector2.getLibrary().addGameCard(card2);
    card1.setRating(9.99);

    System.out.println(collector1.getUsername() + " :" + collector1.getLibrary().getNumberOfCards() + "|  Card Rating: " + card1.getRating());
    System.out.println(collector2.getUsername() + " :" + collector2.getLibrary().getNumberOfCards() + "|  Card Rating: " +  card2.getRating());

    GameCard minecraft = new GameCard(game1);

    minecraft.addCopy(new GameCopy("PC", "Digital"));
    minecraft.addCopy(new GameCopy("PS5", "Physical"));
    minecraft.addCopy(new GameCopy("Switch", "Physical"));

    minecraft.removeCopy(1);

    System.out.println(minecraft.getCopy(1).getConsole());
    System.out.println(collector1.getLibrary().getNumberOfCards());

    collector1.getLibrary().sortByTitle();
    
    
    for(int i = 0; i < collector1.getLibrary().getNumberOfCards(); i++)
    {
      System.out.println(collector1.getLibrary().getGameCard(i).getGame().getTitle());
    }
  }




}
