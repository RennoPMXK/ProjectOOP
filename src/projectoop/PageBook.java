package projectoop;

import java.util.Scanner;

public class PageBook extends Book {

    private double length;
    private double width;
    private double height;
    private boolean bookCover; //Hardcover or Softcover
    private int stock;

    public PageBook() {

    }

    public PageBook(String bookId, String bookName, Category category, int numOfAuthors, Author[] author, String publisher, String bookIntroduction, double price, int numberOfPages, double length, double width, double height, boolean bookCover, int stock) {
        super(bookId, bookName, category, numOfAuthors, author, publisher, bookIntroduction, price, numberOfPages);
        this.length = length;
        this.width = width;
        this.height = height;
        this.bookCover = bookCover;
        this.stock = stock;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isBookCover() {
        return bookCover;
    }

    public void setBookCover(boolean bookCover) {
        this.bookCover = bookCover;
    }

    public int getStock() {
        return stock;
    }

    public int setStock(int stock) {
        this.stock = stock;
        return stock;
    }

    @Override
    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        super.setInfo();
        System.out.println("Nhap chieu dai: ");
        length = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        width = scanner.nextDouble();
        System.out.println("Nhap chieu cao: ");
        height = scanner.nextDouble();
        System.out.println("Nhap loai bia: (false: cung / true: mem) ");
//        scanner.nextBoolean();
        Boolean checkBoolean = scanner.nextBoolean();
        while (!checkBoolean.equals(false) && !checkBoolean.equals(true)) {
            System.out.println("Nhap sai, nhap lai: ");
            checkBoolean = scanner.nextBoolean();
        }
        this.bookCover = checkBoolean;
        System.out.println("Nhap so luong: ");
        stock = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Kich thuoc: " + length + "x" + width + "x" + height);
        if (!bookCover) {
            System.out.println("Loai bia: cung");
        } else {
            System.out.println("Loai bia: mem");
        }

        System.out.println("So luong: " + stock);
    }

}
