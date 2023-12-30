package _231218;
//책 객체 생성
public class Book {
    private String isbn;
    private String name;
    private int price;
    private String author;
    private String desc;
    private String category;
    private String datePublish;
    public Book(String isbn, String name, int price, String author, String desc, String category, String datePublish){
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.author = author;
        this.desc = desc;
        this.category = category;
        this.datePublish = datePublish;
    }
    //책 id값 비교
    public String getIsbn() {
        return isbn;
    }
}
