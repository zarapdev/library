package LibrarySystem.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager book = new BookManager();
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("Istediyiniz emeliyyati daxil edin:  \n" + "1. Kitab e;ave et. \n" + "2. Kitabi update edin: \n" + "3. Kitabi sil: \n" + "4. Kitabi getir: \n" + "5. Kitabin siyahisini getir: \n" + "6. Sistemden cixin: \n");
            int emeliyyat=scn.nextInt();
            switch (emeliyyat){
                case 1:
                    System.out.println("Id daxil edin");
                    int id=scn.nextInt();
                    System.out.println("Kitabin adini daxil edin");
                    String name=scn.next();
                    System.out.println("Muellifin adini daxil edin");
                    String author=scn.next();
                    book.add(new Book(id,name,author));
                    break;
                default:
                    scn.close();
                    return;


            }
        }
    }
}
