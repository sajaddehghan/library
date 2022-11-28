
public class Book {
    private String name;
    private String writer;
    private int number;
    private boolean flag=true;
    public int counter1;


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter() {
        this.writer = writer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = number;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlagTrue() {
        this.flag = true;
    }

    public void setFlagFalse() {
        this.flag = false;
    }

    public Book(String name, String writer, int number) {
        this.name = name;
        this.writer = writer;
        this.number = number;
    }

    public Book() {
    }
}
