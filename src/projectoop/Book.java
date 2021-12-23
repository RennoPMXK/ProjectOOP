package projectoop;

import java.util.Scanner;

public class Book {

    private String bookId;
    private String bookName;
    private Category category;
    private int numOfAuthors;
    private Author[] author;
    private String publisher;
    private String bookIntroduction;
    private double price;
    private int numberOfPages;
    private boolean eBook;
    private boolean pageBook;
    private boolean status;

    public Book() {

    }

    public Book(String bookId, String bookName, Category category, int numOfAuthors, Author[] author, String publisher, String bookIntroduction, double price, int numberOfPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.category = category;
        this.numOfAuthors = numOfAuthors;
        this.author = author;
        this.publisher = publisher;
        this.bookIntroduction = bookIntroduction;
        this.price = price;
        this.numberOfPages = numberOfPages;
    }

    public Book(String bookId, String bookName, Category category, int numOfAuthors, Author[] author, String publisher, String bookIntroduction, double price, int numberOfPages, boolean eBook, boolean pageBook, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.category = category;
        this.numOfAuthors = numOfAuthors;
        this.author = author;
        this.publisher = publisher;
        this.bookIntroduction = bookIntroduction;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.eBook = eBook;
        this.pageBook = pageBook;
        this.status = status;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public boolean iseBook() {
        return eBook;
    }

    public void setEBook(boolean eBook) {
        this.eBook = eBook;
    }

    public boolean isPageBook() {
        return pageBook;
    }

    public void setPageBook(boolean pageBook) {
        this.pageBook = pageBook;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getNumOfAuthors() {
        return numOfAuthors;
    }

    public void setNumOfAuthors(int numOfAuthors) {
        this.numOfAuthors = numOfAuthors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookIntroduction() {
        return bookIntroduction;
    }

    public void setBookIntroduction(String bookIntroduction) {
        this.bookIntroduction = bookIntroduction;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }



    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID sach: ");
        bookId = scanner.nextLine();
        System.out.println("Nhap ten sach: ");
        bookName = scanner.nextLine();
        System.out.println("Nhap so luong tac gia: ");
        numOfAuthors = scanner.nextInt();
        System.out.println("Nhap thong tin tac gia: ");
        this.author = new Author[numOfAuthors];
        for (int i = 0; i < numOfAuthors; i++) {
            author[i] = new Author();
            author[i].setAuthorInfo();
        }
        this.category = new Category();
//        category.setCategoryInfo();
//        System.out.println("Nhap the loai: ");
//        System.out.println(Arrays.toString(getListOfCategory()));
//        int index = 0;
//        scanner.nextLine();
//        String checkString = scanner.nextLine();
//
//        while(!checkString.equals(listOfCategory[index]) && index < listOfCategory.length) {
//            index++;
//            if (index == listOfCategory.length) {
//                System.out.println("Nhap sai, nhap lai: ");
//                checkString = scanner.nextLine();
//                index = 0;
//            }
//        }
//        this.category = checkString;
        System.out.println("Nhap ten nha xuat ban");
        scanner.nextLine();
        publisher = scanner.nextLine();
        System.out.println("Nhap mo ta noi dung: ");
        bookIntroduction = scanner.nextLine();
        System.out.println("Nhap gia tien: ");
        price = scanner.nextDouble();
        System.out.println("Nhap so trang: ");
        numberOfPages = scanner.nextInt();

    }

    public void display() {
        System.out.println("Ma sach: " + bookId);
        System.out.println("Ten sach: " + bookName);
        for (int i = 0; i < numOfAuthors; i++) {
            System.out.println("Tac gia: " + author[i]);
        }
        System.out.println("The loai: " + category);
        System.out.println("Nha xuat ban: " + publisher);
        System.out.println("Gia tien: " + price + "vnd");
        System.out.println("So trang: " + numberOfPages);
        System.out.println("Mo ta: " + bookIntroduction);
    }

}
