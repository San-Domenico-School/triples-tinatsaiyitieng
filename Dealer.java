import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * A subclass of the Actor class
 * 
 * Tina Tsai 
 * 1/18/2024
 */
public class Dealer extends Actor
{
    public Deck deck;
    private ArrayList<Card> cardsOnBoard = new ArrayList<Card>();
    private ArrayList<Integer> selectedCardsIndex = new ArrayList<Integer>();
    private Card[] cardsSelected;
    private int numCardsInDeck;
    private int triplesRemaining;
    
    public Dealer(int numCardsInDeck)
    {
        this.numCardsInDeck = numCardsInDeck;
        triplesRemaining = numCardsInDeck / 3;
        deck = new Deck(numCardsInDeck);
        cardsSelected = new Card[3];
    }
    
    public void addedToWorld(World world)
    {
        dealBoard();
        setUI();
    }
    
    public void dealBoard()
    {
        Greenfoot.playSound("shuffle.wav");
        for(int row = 1; row <= 5; row++)
        {
            for(int column = 1; column <= 3; column++)
            {
                getWorld().addObject(deck.getTopCard(), column * 127 - 39, row * 75 + 10);
            }
        }
    }
    
    public void setUI()
    {
        Integer cardsRemaining = new Integer(deck.getNumCardsInDeck());
        getWorld().showText(cardsRemaining.toString(), 315, 470);
        Integer score = new Integer(Scorekeeper.getScore());
        getWorld().showText(score.toString(), 315, 505);
    }
    
    public void endGame()
    {
        
    }
    
    public void checkIfTriple()
    {
        
    }
    
    public void actionIfTriple()
    {
        
    }
    
    public void setCardsSelected(ArrayList<Card> cardList, Card[] cardArray,ArrayList<Integer> indexList)
    {
        
    }
}
