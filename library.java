import java.util.*;
                           
class Library123
{
    String book[];
    int n;

    Library123()
    {
        this.book = new String[100];
        this.n = 0;
    }

    public void addBook(String book)
    {
        this.book[n] = book;
        n++;
        System.out.println(book+" has Been Added !!");
    }

    public void Show()
    {
        int i =0;

        System.out.println("Avialable Books Are..");
        System.out.println("");

        for(String book : this.book)
        { 
            i++;

            if(book == null)
            {
                continue;
            }
            System.out.println("*  "+ book);
        }
        System.out.println("");
    }

    public void GrabBook(String book)
    {
        for(int i = 0;i < this.book.length;i++)
        {
        
           if(this.book[i] == book)
           {
              System.out.println("Book has been Issued");
              this.book[i] = null;
              System.out.println("");
              return;
           }
        }
        System.out.println("Book is not available in Library");
        System.out.println("");
    }
}
public class library
{
    public static void main(String args[])
    {
        System.out.println("");

        Library123 l = new Library123();
        
        l.addBook("Rich Dad Poor Dad");
        l.addBook("Who Will Cry When You Die");
        l.addBook("The Brief History of Time");
        
        System.out.println("");
        l.Show();
        l.GrabBook("Rich Dad Poor Dad");
        l.addBook("Bhagvat Geeta");
        l.Show();
        
        System.out.println("");
    }
}