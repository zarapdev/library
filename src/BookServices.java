package LibrarySystem.src;

public interface BookServices {
    void add (Book book);
    void update (int id,String name,String author);
    void delete (int id);
    Book getBook(int id);
    Book [] getBooks();
}
