package ch21;

public class ObjectCopyTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];


        library[0] = new Book("삼국지1", "엽차");
        library[1] = new Book("삼국지2", "엽차");
        library[2] = new Book("삼국지3", "엽차");
        library[3] = new Book("삼국지4", "엽차");
        library[4] = new Book("삼국지5", "엽차");

        for(int i=0; i<library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());

        }

        System.arraycopy(library,0,copyLibrary,0,5);

        System.out.println("==library==");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("== copy library==");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

    }
}
