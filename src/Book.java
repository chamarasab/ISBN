public class Book {
    private String title; 
    private String author; 
    private String publisher; 
    private String city; 
    private String date; 
    private float price; 
    private ISBN isbnNumber;

    public Book() {
        this.isbnNumber = new ISBN();
    }

    public Book(String title, String author, String publisher, String city, String date, float price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.date = date;
        this.price = price;
        this.isbnNumber = new ISBN();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getIsbnNumber() {
        return isbnNumber.getISBN();
    }

    public void setIsbnNumber(int n1, int n2, int n3, int n4) {
        isbnNumber.setISBN (n1, n2, n3, n4);
    }

    public void display() {
        System.out.println(Color.ANSI_YELLOW + "\n\tBook Details");
        System.out.println(Color.ANSI_GREEN + "Book Title:     " + Color.ANSI_YELLOW + getTitle() + Color.ANSI_RESET); 
        System.out.println(Color.ANSI_GREEN + "Book Author:    " + Color.ANSI_YELLOW + getAuthor() + Color.ANSI_RESET); 
        System.out.println(Color.ANSI_GREEN + "Book Publisher: " + Color.ANSI_YELLOW + getPublisher() + Color.ANSI_RESET); 
        System.out.println(Color.ANSI_GREEN + "Book ISBN:      " + Color.ANSI_YELLOW + getIsbnNumber() + Color.ANSI_RESET);
    }

    
}
