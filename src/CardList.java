// create class CardList
import java.util.ArrayList;
import java.util.Random;
public class CardList{
  private ArrayList Card cards;
  private Random random=new Random();
  public CardList(){
    cards=new ArrayList<Card>();
    suit=random.nextInt(4);
    rank=random.nextInt(cards.size());
  }
  public int size(){
    return cards.size();
  }   
  public void addCardToBottom(){
    /*
     * fields:
     *   cards
     *   random
     * constructors:
     *   cardList()
     * accessors:
     *   size()
     * mutators:
     *   addCardToBottom
     *   addCardToTop
     *   takeCardFromTop
     *   removeRandomCard
