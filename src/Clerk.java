import java.util.Scanner;


public class Clerk {
    private String name;
    private String family;
    private int code;
    private int age;
    private String sexuality;
    private int counter;
    private int counter1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSexuality() {
        return sexuality;
    }

    public void setSexuality(String sexuality) {
        this.sexuality = sexuality;
    }

    public Clerk(String name, String family, int code, int age, String sexuality) {
        this.name = name;
        this.family = family;
        this.code = code;
        this.age = age;
        this.sexuality = sexuality;
    }

    public void addUser(User[] array) {
        array[counter] = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("name :");
        array[counter].setName(name);
        System.out.println("family :");
        array[counter].setFamily(family);
        System.out.println("age :");
        array[counter].setAge(age);
        System.out.println("code :");
        array[counter].setCode(code);
        System.out.println("sexuality:");
        array[counter].setSexuality(sexuality);
        counter++;


    }

    public void showUser(User[] array) {
        int temp = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("enter code :");
         int code = input.nextInt();
        for (int i = 0; i < counter; i++) {
            if (code == i) {
                temp = 1;
                System.out.println(array[i].getName());
                System.out.println(array[i].getFamily());
                System.out.println(array[i].getSexuality());
                Book[] books=array[i].getBooks();
                for (int j = 0; j <6 ; j++) {
                    if(books[j]!=null){
                        System.out.println(books[j].getName());
                        System.out.println(books[j].getNumber());
                        System.out.println(books[j].getWriter());
                    }
                }

            }
            if (temp != 1) {
                System.out.println("not found");
            }

        }

    }

    public void showUserlist(User[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= counter; i++) {
            System.out.println(array[i].getCode());
            System.out.println(array[i].getName());
            System.out.println(array[i].getFamily());
            System.out.println(array[i].getSexuality());


        }
    }

    public void addBook(Book[] array1) {
        array1[counter1] = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("name :");
        String name = input.next();
        array1[counter1].setName();
        System.out.println("writer :");
        String writer = input.next();
        array1[counter1].setWriter();
        System.out.println("number :");
        int number = input.nextInt();
        array1[counter1].setNumber();
        counter1++;
    }
}
