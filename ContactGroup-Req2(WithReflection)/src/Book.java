public class Book
{
	private String bookName;
    private int bookPrice;
    private String  authorName;
        
  public void setBookName(String a)
    {
       bookName=a;
       
    }
    public String getBookName()
    {
        //System.out.println("Book Name:"+bookName);
      return bookName;
    }
       
 
    public void setBookPrice(int b)
    {
        bookPrice=b;
    }
    public int getBookPrice()
    {
        //System.out.println("Book Price:"+bookPrice);
      return bookPrice; 
    }
          
    public void setAuthorName(String c)
    {
        authorName=c;
        
    }
    public String getAuthorName()
    {
        //System.out.println("Author Name:"+authorName);
      return authorName;
    }
}