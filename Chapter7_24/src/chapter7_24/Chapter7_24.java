/*
Chapter 7 Programming excercise 24
Riky Hernandez
9/16/21
Description: A program that shuffles 52 cards and finds out how many cards are picked out before you see one of each suit
`;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
          (_,'
 */
package chapter7_24;

public class Chapter7_24 {

 
    public static void main(String[] args) {
     
        final int NUMBER_OF_CARDS = 52;
        String[] suits = {"Clubs","Diamonds", "Hearts", "Spades"};         //Arrays to keep track all cards instaed of having to type all 52 cards
        String [] ranks = {"Ace","2", "3", "4","5","6","7", "8","9","10",
                                "Jack", "Queen","King"};
        
      boolean[] found = new boolean[4];                 //to make sure only 4 cards are stored
      
      int numberOfPicks = 0;
      int count =0;
      
      while (count < 4){                            // counts how many cards is pulled from the deck
          numberOfPicks++;
          int index = (int) (Math.random() * NUMBER_OF_CARDS);          //randomly choosing cards
          if(!found[index/13]){
              found[index/13] = true;
              count++;                                      
              
              String suit = suits[index/13];                        //choosing the cards suit and rank and printing only 4 
              String rank = ranks[index % 13];
              System.out.println(rank + " of " + suit);
          }
      }                                                                     //counting how many cards it took to get the four cards
        System.out.println("Number of picks: " + numberOfPicks);
        
    }
    
}
