import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] array = new User[100];
        Book[] array1 = new Book[200];
        Clerk clerk=new Clerk("golnar","ahmadi",1,20,"female");
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("1.Connect Clerk");
            System.out.println("2.Connect User");
            System.out.println("3.Exit");
            System.out.println("Enter number:");
            int num = input.nextInt();
            if (num==1){
                while (true){
                    System.out.println("1.add book");
                    System.out.println("2.add user");
                    System.out.println("3.show all user");
                    System.out.println("4.show user");
                    System.out.println("5.show all book");
                    System.out.println("6.show Books borrowed");
                    System.out.println("7.show Books available");
                    System.out.println("8.Exit");
                    System.out.println("Enter number:");
                    int num1 = input.nextInt();
                    if (num1==1){
                        clerk.addBook(array1);
                    }
                    if (num1==2){
                        clerk.addUser(array);
                    }
                    if (num1==3){
                        clerk.showUserlist(array);
                    }
                    if (num1==4){
                        clerk.showUser(array);
                    }
                    if (num1==5){
                        showAllBook(array1);
                    }
                    if (num1==6){
                        showBooksBorrowed(array1);
                    }
                    if (num1==7){
                        showBooksAvailable(array1);
                    }
                    if (num1==8){
                        break;
                    }
                }
            }
            if (num==2){
                User user = null;
                while(true){
                    boolean flag=false;
                    System.out.println("Enter code:");
                    int code=input.nextInt();
                    for (int i = 0; i <= 100; i++) {
                        if (array[i]!=null){
                            if (array[i].getCode()==code){
                                user=array[i];
                                flag=true;
                                break;
                            }
                        }
                    }
                    if (flag){
                        break;
                    }
                }
                while (true){
                    System.out.println("1.show account");
                    System.out.println("2.borrowing a book");
                    System.out.println("3.return a book");
                    System.out.println("4.show all book");
                    System.out.println("5.show Books borrowed");
                    System.out.println("6.show Books available");
                    System.out.println("7.Exit");
                    System.out.println("Enter number:");
                    int num1 = input.nextInt();
                    if (num1==1){
                        System.out.println(user.getName());
                        System.out.println(user.getFamily());
                        Book[] books=user.getBooks();
                        for (int j = 0; j <6 ; j++) {
                            if(books[j]!=null){
                                System.out.println(books[j].getName());
                                System.out.println(books[j].getNumber());
                                System.out.println(books[j].getWriter());
                            }
                        }
                    }
                    if (num1==2){
                        System.out.println("Enter name book:");
                        String str=input.next();
                        for (int i = 0; i <= 200; i++) {
                            if (array1[i]!=null){
                                if (array1[i].getName().equals(str)){
                                    if (array1[i].isFlag()) {
                                        user.setBooks(array1[i]);
                                        array1[i].setFlagFalse();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (num1==3){
                        System.out.println("Enter name book:");
                        String str=input.next();
                        for (int i = 0; i <= 200; i++) {
                            if (array1[i]!=null){
                                if (array1[i].getName().equals(str)){
                                    user.removeBooks(array1[i]);
                                    array1[i].setFlagTrue();
                                    break;
                                }
                            }
                        }
                    }
                    if (num1==4){
                        showAllBook(array1);
                    }
                    if (num1==5){
                        showBooksBorrowed(array1);
                    }
                    if (num1==6){
                        showBooksAvailable(array1);
                    }
                    if (num1==7){
                        break;
                    }
                }
            }
            if (num==3){
                break;
            }
        }
    }
    public static void showAllBook(Book[] books){
        for (int i = 0; i <=200 ; i++) {
            if (books[i]!=null) {
                System.out.println(books[i].getName() + books[i].getNumber());
            }
        }
    }
    public static void showBooksBorrowed(Book[] books){
        for (int i = 0; i <=200 ; i++) {
            if (books[i]!=null) {
                if (!books[i].isFlag()) {
                    System.out.println(books[i].getName() + books[i].getNumber());
                }
            }
        }
    }
    public static void showBooksAvailable(Book[] books){
        for (int i = 0; i <=200 ; i++) {
            if (books[i]!=null) {
                if (books[i].isFlag()) {
                    System.out.println(books[i].getName() + books[i].getNumber());
                }
            }
        }
    }
}
