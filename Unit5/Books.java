public class Books
{
    public static void main(String[] args)
    {
        bookData book1 = new bookData("The Talos Mistake", "Red", 6);
        bookData book2 = new bookData("The Lusty Argonian Maid, v1", "Black", 4);
        bookData book3 = new bookData("Songs of Skyrim", "Blue", 8);
        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(book3.getTitle());
        book3.addPages(10);
        int totalPages = book1.getPages() + book2.getPages() + book3.getPages();
        System.out.println(totalPages);
    }
}