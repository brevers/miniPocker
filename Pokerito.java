import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mini Poker Game");
        System.out.println("Similar to Poker. \n2 Players, you and computer.\nYou both will receive a card from the dealer. \nDealer will draw five cards (the river), the player with more river matches wins! \nIf matches are equal, both win.");
        
        System.out.println("\t ----Ready?----. \nType something when you are ready");
        scan.nextLine();

        String yourCard= randomCard();
        System.out.println("\nYour Card: "+ "\n"+yourCard);
        String computerCard=randomCard();
        System.out.println("\nComputer Card: "+ "\n"+computerCard);


        int yourMatches = 0;
        int computerMatches =0;

        System.out.print("Now, Dealer will draw 5 cards. Enter to continue");
        for(int i=0; i<5;i++){
            String draw=randomCard();
            scan.nextLine();
            System.out.print("Card "+(i+1)+"\n"+draw);
            if(yourCard.equals(draw)){
                yourMatches++;
            }
            if(computerCard.equals(draw)){
                computerMatches++;
            }
        }
        
        System.out.println("You matched "+yourMatches+" in total");
        System.out.println("Machine matched "+computerMatches+" in total\n");
        if(yourMatches>computerMatches){
        System.out.println("WOW, You win!");
        }else if (yourMatches<computerMatches){
            System.out.println("Sorry, computer wins");
        }else{
        System.out.println("Congrats to both! You all win");}

         scan.close();
    }
    public static String randomCard(){
        double randomCard = Math.random() * 13;
        randomCard +=1;
        switch ((int)randomCard) {
            case 1: return 

                    "   _____\n"+
                    "  |A _  |\n"+ 
                    "  | ( ) |\n"+
                    "  |(_'_)|\n"+
                    "  |  |  |\n"+
                    "  |____V|\n" ;
            case 2:return
                    "   _____\n"+
                    "  |2    |\n"+
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";

            case 3:return
                    "   _____\n" +
                    "  |3    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____E|\n";
            case 4:return
                    "   _____\n" +
                    "  |4    |\n"+
                    "  | o o |\n"+
                    "  |     |\n"+
                    "  | o o |\n"+
                    "  |____h|\n";

            case 5:return
                    "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
            case 6:return
                    "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                
            case 7:return 
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
            case 8:return
                    "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:return
                    "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
            case 10:return
                    "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:return
                    "   _____\n" +
                    "  |J  ww|\n"+
                    "  | o {)|\n"+
                    "  |o o% |\n"+
                    "  | | % |\n"+
                    "  |__%%[|\n";
            case 12:return
                        "   _____\n" +
                        "  |Q  ww|\n"+
                        "  | o {(|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%O|\n";
            case 13:return
                        "   _____\n" +
                        "  |K  WW|\n"+
                        "  | o {)|\n"+
                        "  |o o%%|\n"+
                        "  | |%%%|\n"+
                        "  |_%%%>|\n";

            default: return "no found";

        }
    }

}
