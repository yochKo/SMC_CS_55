/*
Name: young cheol ko
Class: CS55
Project 5
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

public class TestBookShelf {

    public static void main(String[] args) {
        Bookshelf shelf = new Bookshelf();
        Book[] books = new Book[5];

        books[0] = new Book("A First Course in Differential Equations 5th","Dennis G. Zill","Brooks Cole",16.55,"12/08/2000");
        books[1] = new Book("Calculus 8th","James Stewart","Cengage",219.99,"5/19/2015");
        books[2] = new Book("University physics WitH modern physics 14th","HugH D. Young, RogeR A. FReeDmAn","Pearson",249.74,"01/09/2015");
        books[3] = new Book("Introduction to JAVA programing","Y. Daniel Liang","Pearson",73.41,"01/06/2014");
        books[4] = new Book("Introduction to JAVA programing","Y. Daniel Liang","Pearson",73.41,"01/06/2014");

        System.out.println("Is shelf empty? : "+shelf.isEmpty());

        shelf.addBook(books[0]);
        System.out.println(shelf);
        shelf.addBook(books[1]);
        System.out.println(shelf);
        shelf.addBook(books[2]);
        System.out.println(shelf);
        shelf.addBook(books[3]);
        System.out.println(shelf);
        shelf.addBook(books[3]);
        System.out.println(shelf);
        shelf.addBook(books[4]);
        System.out.println(shelf);

        if(books[3].isDuplicate(books[4])==true){
            shelf.removeBook(books[4]);
            System.out.println("Found duplicate book! remove the duplicate book");
        }
        System.out.println(shelf);

        books[4] = new Book("Demian","Hermann Hesse","Martino Fine Books ",6.95,"05/18/2011");
        shelf.addBook(books[4]);

        System.out.println("Is shelf full? : "+shelf.isFull());

        shelf.removeBook(books[0]);
        shelf.removeBook(books[0]);
        System.out.println(shelf);
        shelf.removeBook(books[3]);
        shelf.removeBook(books[4]);
        System.out.println(shelf);
    }
}