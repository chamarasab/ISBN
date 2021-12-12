import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String title,author,publisher,city,date;
        float price;
        int n1,n2,n3,n4;
        Scanner scanner = new Scanner(System.in);

        System.out.println(Color.ANSI_YELLOW + "\tBook Shop" + Color.ANSI_RESET);

        //-----data pass using constructor--------------------
        Book book = new Book("title", "author", "publisher", "city", "date", 78);
        book.setIsbnNumber(0, 941, 831, 396);
        book.display();


        //-----data passing using as user inputs---------------
        System.out.print(Color.ANSI_GREEN + "\nEnter Book Title : " + Color.ANSI_RESET);
        title = scanner.nextLine();

        System.out.print(Color.ANSI_GREEN + "Enter Author     : " + Color.ANSI_RESET);
        author = scanner.nextLine();

        System.out.print(Color.ANSI_GREEN + "Enter Publisher  : " + Color.ANSI_RESET);
        publisher = scanner.nextLine();

        System.out.print(Color.ANSI_GREEN + "Enter City  : " + Color.ANSI_RESET);
        city = scanner.nextLine();

        System.out.print(Color.ANSI_GREEN + "Enter Date  : " + Color.ANSI_RESET);
        date = scanner.nextLine();

        System.out.print(Color.ANSI_GREEN + "Enter Price  : " + Color.ANSI_RESET);
        price = scanner.nextFloat();

        System.out.print(Color.ANSI_RED + "Enter ISBN part-1  :" + Color.ANSI_RESET);
        n1 = scanner.nextInt();

        System.out.print(Color.ANSI_RED + "Enter ISBN part-2  :" + Color.ANSI_RESET);
        n2 = scanner.nextInt();

        System.out.print(Color.ANSI_RED + "Enter ISBN part-3  :" + Color.ANSI_RESET);
        n3 = scanner.nextInt();

        System.out.print(Color.ANSI_RED + "Enter ISBN part-4  :" + Color.ANSI_RESET);
        n4 = scanner.nextInt();

        System.out.println("\n");

        
        //Book book2 = new Book(title, author, publisher, city, date, price);
        Book book2 = new Book();
        book2.setTitle(title);
        book2.setAuthor(author);
        book2.setPublisher(publisher);
        book2.setCity(city);
        book2.setDate(date);
        book2.setPrice(price);
        book2.setIsbnNumber(n1, n2, n3, n4);

        book2.display();


        scanner.close();
    }
}
