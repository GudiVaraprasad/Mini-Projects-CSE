
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println();
        System.out.println(" Welcome to ROCK PAPER SCISSORS game : ");
        System.out.println("-------------------------------------------");
        System.out.println("Note: This game can only be played by 2 Players.");
        System.out.println();
        System.out.print("Enter the name of Player 1: ");
        String player1=in.nextLine();
        System.out.print("Enter the name of Player 2: ");
        String player2=in.nextLine();
        System.out.println();
        System.out.println("Let's start the game - ROCK PAPER SCISSORS ");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println(player1 + " needs to choose this: ");
        System.out.println("Choose your input (Enter the number) out of these three: \n1.Rock \n2.Paper \n3.Scissors ");
        System.out.print("Your input: ");
        int p1=in.nextInt();
        while(p1>3)
        {
            System.out.print("Invalid option choosed! Please choose again: ");
            p1=in.nextInt();
        }
        System.out.println();
        System.out.println(player2 + " needs to choose this: ");
        System.out.println("Choose your input (Enter the number) out of these three: \n1.Rock \n2.Paper \n3.Scissors ");
        System.out.print("Your input: ");
        int p2=in.nextInt();
         while(p2>3)
        {
            System.out.print("Invalid option choosed! Please choose again: ");
            p2=in.nextInt();
        }
        System.out.println();
        
        if(p1==p2)
        {
            System.out.println("Draw Game - Play again!");
        }
        else if(p1==1 && p2==2)
        {
            System.out.println("Congratulations! " + player2 + " wins the game.");
        }
        else if(p1==2 && p2==1)
        {
            System.out.println("Congratulations! " + player1 + " wins the game.");
        }
        else if(p1==1 && p2==3)
        {
            System.out.println("Congratulations! " + player1 + " wins the game.");
        }
        else if(p1==3 && p2==1)
        {
            System.out.println("Congratulations! " + player2 + " wins the game.");
        }
        else if(p1==2 && p2==3)
        {
            System.out.println("Congratulations! " + player2 + " wins the game.");
        }
        else if(p1==3 && p2==2)
        {
            System.out.println("Congratulations! " + player1 + " wins the game.");
        }
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.println("Do you want to play again: \n1.yes \n2.no");
        System.out.print("Your input: ");
        int input=in.nextInt();
        while(input>2)
        {
            System.out.print("Invalid input choosed! Please choose again: ");
            input=in.nextInt();
        }
        System.out.println();
        
        if(input==1)
        {
            System.out.println("Click on Run !");
        }
        else if(input==2)
        {
            System.out.println("Thanks for Playing! EXIT ");
        }
    }
}
