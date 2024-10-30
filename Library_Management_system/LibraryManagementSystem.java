abstract class UserAccount{
    String userId;
    String name;
    boolean loggedIn = false;

    public UserAccount(String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public void login (){
        loggedIn = true;
        System.out.println(name + " logged in");
    }

    public void logout (){
        loggedIn = false;
        System.out.println(name + " logged out");
    }

    public void viewProfile (){
        System.out.println("User Id: " + userId + " Name: " + name); 
    }
}

interface BookBorrower{
    void borrowBook(String bookId);
    void returnBook(String bookId);
}

interface BookManager{
    void addBook(String bookId, String bookTitle);
    void removeBook(String bookId);
}

class Member extends UserAccount implements BookBorrower {
    public Member(String userId, String name){
        super(userId, name);
    }

    @Override
    public void borrowBook (String bookId){
        System.out.println(name + "borrowed the book & Id: " + bookId);
    }

    @Override
    public void returnBook(String bookId){
        System.out.println(name + "returned the book & Id: " + bookId);
    }
}

class Librarian extends UserAccount implements BookBorrower, BookManager{
    public Librarian(String userId, String name){
        super(userId, name);
    }

    @Override
    public void addBook(String bookId, String bookTitle){
        System.out.println("Book title: " + bookTitle + "with id " + bookId + " added to the library");
    }

    @Override
    public void removeBook (String bookId){
        System.out.println("Book with id " + bookId + " removed from the library");
    }

    @Override
    public void borrowBook (String bookId){
        System.out.println(name + "borrowed the book & Id: " + bookId);
    }

    @Override
    public void returnBook (String bookId){
        System.out.println(name + "returned the book & Id: " + bookId);
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args){
        Member member = new Member("001", "John");
        Librarian librarian = new Librarian("1001" , "Adam");

        member.login();
        member.viewProfile();
        member.borrowBook("B101");
        member.returnBook("B101");
        member.logout();

        librarian.login();
        librarian.viewProfile();
        librarian.addBook("B102", "Java Programming");
        librarian.borrowBook("B102");
        librarian.returnBook("B102");
        librarian.removeBook("B102");
        librarian.logout();
    }
}
