package LibrarySystem.src;

public class BookManager implements BookServices {
    Book[] books = new Book[3];
    int count=0;


    @Override
    public void add(Book book) {
        books[0] = book;
        count++;
        System.out.println("Kitab elave olundu");
    }

    @Override
    public void update(int id, String name, String author) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id) {
                books[i].setName(name);
                books[i].setAuthor(author);
                System.out.println("Kitab update olundu");
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id) {
                books[i].setName(null);
                books[i].setAuthor(null);
                System.out.println("Kitab silindi");

            }
        }
    }

    @Override
    public Book getBook(int id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id) {
                return books[i];


            }

        }
        return null;
    }

    @Override
    public Book[] getBooks() {
        return books;
    }


}