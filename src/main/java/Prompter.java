import java.util.Scanner;
  
public class Prompter {
  
 
public static String item;
public static int maxItemsAllowed;
public static int guessedNumber;

 
Scanner scanner = new Scanner(System.in);

public void promptAdminstrator(){ 
  
System.out.print("What type of item should fill the jar?: ");
     item = scanner.nextLine();
  
System.out.printf("What is the maximum amount of %s? ",item);
     maxItemsAllowed = scanner.nextInt();
}
  
Jar jar = new Jar(item, maxItemsAllowed);

public void execute(){
      Jar.fill(maxItemsAllowed);
  }

public void promptPlayer(){
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d ", item, maxItemsAllowed);
    guessedNumber = scanner.nextInt();
    
    while(!jar.isWon(guessedNumber)){
        if(guessedNumber > maxItemsAllowed){
            System.out.printf("Your guess must be less than %d: ", maxItemsAllowed);
            guessedNumber = scanner.nextInt();}
        
        else if(jar.guessedNumberOfItems(guessedNumber)){
            
            if(guessedNumber > (jar.getRandom()+5)){
                System.out.print("Your guess is too high: " );
                guessedNumber = scanner.nextInt();}
            
            else if(guessedNumber < (jar.getRandom()-5)){
                System.out.print("Your guess is too low: " );
                guessedNumber = scanner.nextInt();}
            
            else{
                System.out.print("Sorry you missed: ");
                guessedNumber = scanner.nextInt();}
            
        }
            
    if(jar.isWon(guessedNumber)){
          System.out.printf("You got it in %d attempt\n", jar.getAttempts());
          System.exit(0);}
  }
}
}