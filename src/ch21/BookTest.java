package ch21;

public class BookTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];

//        for(int i=0; i<library.length; i++) {
//            System.out.println(library[i]);
//        }

        library[0] = new Book("삼국지1", "엽차");
        library[1] = new Book("삼국지2", "엽차");
        library[2] = new Book("삼국지3", "엽차");
        library[3] = new Book("삼국지4", "엽차");
        library[4] = new Book("삼국지5", "엽차");

        for(Book book: library) {
            System.out.println(book);
            book.showInfo();
        }

    }



}
