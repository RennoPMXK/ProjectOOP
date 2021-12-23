package projectoop;

import java.util.Scanner;

public class EBook extends Book {

    private boolean format;//pdf or epub
    private double size;

    public EBook() {
    }

    public EBook(String bookId, String bookName, Category category, int numOfAuthors, Author[] author, String publisher, String bookIntroduction, double price, int numberOfPages, boolean format, double size) {
        super(bookId, bookName, category, numOfAuthors, author, publisher, bookIntroduction, price, numberOfPages);
        this.format = format;
        this.size = size;
    }

    public boolean isFormat() {
        return format;
    }

    public void setFormat(boolean format) {
        this.format = format;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        super.setInfo();
        System.out.println("Nhap loai file: (false: pdf / true: epub) ");
        scanner.nextBoolean();
        Boolean checkBoolean = scanner.nextBoolean();
        while (!checkBoolean.equals(false) && !checkBoolean.equals(true)) {
            System.out.println("Nhap sai, nhap lai: ");
            checkBoolean = scanner.nextBoolean();
        }
        this.format = checkBoolean;
        System.out.println("Nhap dung luong: ");
        scanner.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        if (!format) {
            System.out.println("Dinh dang: " + "pdf");
        } else {
            System.out.println("Dinh dang: " + "epub");
        }
        System.out.println("Kich thuoc: " + size + "mb");
    }

}
