public class War {
  
  public static void main(String[] args) {
    // create deck, hands and stacks
    CardDeck deck=new CardDeck();
    CardList handA=new CardList();
    CardList handB=new CardList();
    CardList stackA=new CardList();
    CardList stackB=new CardList();
    int round=1;
    deck.shufle();
    // deal the cards
    while(deck.size()!=0)
    {
      handA.addCardToTop(deck.takeCardFromTop());
      handB.addCardToTop(deck.takeCardFromTop());
    }
    // play
    while(handA.size()!=0&&handB.size()!=0)
    {
      System.out.println(handA.size()+"-----ROUND"+round+"-----"+handB.size());
      stackA.addCardToTop(handA.takeCardFromTop());
      stackB.addCardToTop(handB.takeCardFromTop());
      System.out.println(stackA.get(0).toString()+":"///////////////////////////////////////////////////////////////////////////////////////////////////
      if(stackA.get(0).compareTo(stackB.get(0)>0))
      {
        stackA.addCardToTop(stackB.takeCardFromTop());
      }
      else
      {
        if(stackA.get(0).compareTo(stackB.get(0))<0)
        {
          stackB.addCardToTop(stackA.takeCardFromTop());
        }
        else
        {
          System.out.println("------WAR------");
          stackA.addCardToTop(handA.takeCardFromTop());
          stackB.addCardToTop(handB.takeCardFromTop());
        }
      }
      round++;
    }
    if(handA.size()==0)
    {
      System.out.println("playerB won");
    }
    else
    {
      Sytem.out.println("playerA won");
  }
}
  
  
