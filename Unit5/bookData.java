public class bookData
{
    private String title, color;
    private int pages;
    public bookData(String ttl, String col, int p)
    {
        title = ttl;
        color = col;
        pages = p;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPages()
    {
        return pages;
    }
    public void addPages(int numAdded)
    {
        pages += numAdded;
    }
}