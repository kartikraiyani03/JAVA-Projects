import java.util.*;

class game
{
    int user;
    int comp;

    public void input()
    {                                        
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number : ");
        user = sc.nextInt();
        System.out.println("");
    }

    game()
    {
        Random rd = new Random();
        this.comp = rd.nextInt(100);
    }

    public void isCorrect()
    {
        if(user == comp)
        {
          System.out.println("You win !!");
        }
        else if( user > comp)
        {
            System.out.println("\033[H\033[2J");
            System.out.println("Your Number is High");
        }
        else
        {
            System.out.println("\033[H\033[2J");
            System.out.println("Your Number is Low ");
        }  
    }
}
 
public class Number
{
    public static void main(String args[])
    {

        game g = new game();
        int i = 1;
    
        while(true)
        {
            g.input();
            g.isCorrect();
            i++;
            System.out.println("Attempt "+i);
            System.out.println("");
        }

        // Scanner sc = new Scanner(System.in);
        
        // Random rd = new Random(100);
        // int comp = rd.nextInt();
        
        // while(true)
        // {
        //     System.out.println("Guess the Number ");
        //     int user = sc.nextInt();

            // if(user == comp)
            // {
            //   System.out.println("You win !!");
            // }
            // else if( user > comp)
            // {
            //     System.out.println("Your Number is High");
            // }
            // else
            // {
            //     System.out.println("Your Number is Low ");
            // }  
        // }

    }
}