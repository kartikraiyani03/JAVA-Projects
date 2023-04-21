import java.lang.*;
import java.util.*;
import java.util.random.*;
 
public class game
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rock     --> 0");
        System.out.println("Paper    --> 1");
        System.out.println("Scissor  --> 2");
        System.out.println("");
        System.out.println("Enter Your Choice : ");
        int user = sc.nextInt();

        Random rd = new Random();
        int comp = rd.nextInt(3);

        System.out.println("Computer Choice :\n"+comp);
    
        if(user == comp)
        {
            System.out.println("DRAW");
        }
        
        else if(user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp ==1)
        {
            System.out.println("YOU WIN !!!");
        }
        
        else
        {
            System.out.println("YOU LOSE");
        }

    }
}