/*
Name: young cheol ko
Class: CS55
Project 5
Compiler Used: Intellij IDEA
Operating System Used: windows 10
*/

public class Bookshelf {

    private final static int MAX_SIZE=5;
    private Book[] books;
    private int count;

    public Bookshelf(){
        books = new Book[MAX_SIZE];
        count=0;
    }

    public void addBook(Book book){
        if(count<MAX_SIZE){
            books[count++]=book;
        }
    }

    public void removeBook(Book book){
        int index=-1;
        //try to find book we want in the shelf
        for(int i=0;i<count;i++){
            Book bookAtIndex=books[i];
            if(book.getTitle().equals(bookAtIndex.getTitle()) &&
                    book.getPublisher().equals(bookAtIndex.getPublisher())){
                index=i;
                break;
            }
        }
        //case1 not found
        if(index==-1) {
            System.out.println("The book that try to remove is not found.");
            return; }
        //case2 last book is removed
        else if(index==count-1){
            count--;
            return;
        }
        //case3 book in the left side
        else{
            for(int i=index;i<count-1;i++){
                books[i]=books[i+1];
            }
            count--;
            return;
        }
    }
    //is Bookshelf full
    public boolean isFull(){
        return count==MAX_SIZE;
    }
    //is Bookshelf Empty
    public boolean isEmpty(){
        return count==0;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for(int index=0;index<count;index++){
            buffer.append(books[index]).append("\n");
        }
        return buffer.toString();
    }
}