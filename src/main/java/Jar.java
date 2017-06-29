import java.util.Random;

public class Jar {
 
   private static int SomeNumber;
   private static int Attempts = 1;
  
  public Jar(String Item, int MaxItemsAllowed ){    }
 
  public static int fill(int MaxItemsAllowed ){
      Random random = new Random();
      SomeNumber = random.nextInt(MaxItemsAllowed)+1;
      return SomeNumber;
   }
  
  public int getRandom(){
      return SomeNumber;  
  }

  public boolean guessedNumberOfItems(int guessedNumber){
      boolean isNot = (guessedNumber != getRandom() );
         if(isNot){
             Attempts++;}
      return isNot;
  }

  public int getAttempts(){
      return Attempts;
  }

  public boolean isWon(int guessedNumber){
      boolean same = (guessedNumber == getRandom()); 
          return same;
  }

}
