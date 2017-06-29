public class GuessingGame{

    
    public static void main(String[] args) {
    
    Prompter prompter = new Prompter();
      
    System.out.println("--------------------------ADMINISTRATOR-----------------------");
    prompter.promptAdminstrator();
    System.out.println(" ");
    
    prompter.execute();
      
    System.out.println("-----------------------------PLAYER---------------------------");
    prompter.promptPlayer();
    System.out.println(" ");
      
 }

}
