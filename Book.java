
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Constructor for objects of class Book
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        // initialise instance variables
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;

    }

    public int getBorrowed()
    {
        return borrowed;

    }

    public int getPages()
    {
        return pages;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * 
     */
    public String getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title; 
    }

    public void printAuthor()
    {
        System.out.println("the author is" + author );
    }

    public void printTitle()
    {
        System.out.println("the title is" + title);
    }

    public void printDetails()
    {
        System.out.println("the title is: " + title);
        System.out.println("the author is: " + author);
        System.out.println("the number of pages is " + pages);
        System.out.println("borrowed is: " + borrowed);
        if (refNumber.length() >= 1) {

            System.out.println("the ref number is " + refNumber);

        } else {

            System.out.println("The ref number is: ZZZ");
        }
    }

    public void setRefNumber(String ref)
    

      {  if (refNumber.length() >= 3) {

            refNumber = ref;

        } 
        
        else {
            System.out.println("error");

        }
    }   

    public String getRefNumber()
    {
        return refNumber;
    }

}
