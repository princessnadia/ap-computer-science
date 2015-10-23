import java.util.*;
public class Books
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        bookData book1 = new bookData("The Talos Mistake", "Red", 6);
        bookData book2 = new bookData("The Lusty Argonian Maid, v1", "Black", 4);
        bookData book3 = new bookData("Songs of Skyrim", "Beige", 5);
        System.out.print("book number: ");
        int booknum = inp.nextInt();
        switch (booknum) {
            case 1:
            System.out.print(book1.getTitle() + ", " +  book1.getPages() + ", " + book1.getColor());
            break;
            case 2:
            System.out.print(book1.getTitle() + ", " +  book1.getPages() + ", " + book1.getColor());
            break;
            case 3:
            System.out.print(book1.getTitle() + ", " +  book1.getPages() + ", " + book1.getColor());
            break;
            case 4:
            System.out.print(book1.getTitle() + ", " +  book1.getPages() + ", " + book1.getColor());
            break;
            case 5:
            System.out.print(book1.getTitle() + ", " +  book1.getPages() + ", " + book1.getColor());
            break;
        }
        book3.addPages(10);
        int totalPages = book1.getPages() + book2.getPages() + book3.getPages();
        System.out.println("total pages: " + totalPages);
    }
}