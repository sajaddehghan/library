
public class User {
    private String name;
    private String family;
    private int age;
    private String sexuality;
    private int code;
    private Book[] books = new Book[5];

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

    public User() {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sexuality = sexuality;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book book) {
        boolean flag=false;
        for (int j = 0; j <6 ; j++) {
            if(books[j]!=null){
                books[j]=book;
                flag=true;
                System.out.println("successful");
            }
        }
        if (flag==false){
            System.out.println("unsuccessful");
        }
    }

    public void removeBooks(Book book){
        boolean flag=false;
        for (int j = 0; j <6 ; j++) {
            if(books[j]!=null){
                if (books[j].getName().equals(book.getName())){
                        books[j] = null;
                        flag = true;
                }
            }
        }
        if (flag==false){
            System.out.println("unsuccessful");
        }
    }
}
