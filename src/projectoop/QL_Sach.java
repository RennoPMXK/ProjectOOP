package projectoop;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class QL_Sach {

    public static ArrayList<Book> listofBook = new ArrayList<>();
    public static ArrayList<PageBook> listofPageBook = new ArrayList<>();
    public static ArrayList<EBook> listofEBook = new ArrayList<>();

    public QL_Sach() {
    }

    public static ArrayList<Book> getListofBook() {
        return listofBook;
    }

    public static void setListofBook(ArrayList<Book> listofBook) {
        QL_Sach.listofBook = listofBook;
    }

    public void searchBook() {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        String checkString = scanner.nextLine();
        while (!listofBook.get(index).getBookName().contains(checkString) && index < listofBook.size()) {
            System.out.println(listofBook.get(index).getBookName());
            index++;
            if (index == listofBook.size()) {
                System.out.println("Khong tim thay");
            }
        }
//        for(int i=0;i<listofBook.size();i++){
//            if(listofBook.get(i).getBookName().contains(checkString));
//                System.out.println(listofBook.get(i).getBookName());//
//        }

    }

    public static void timSach() {
        System.out.print("Tìm sách: ");
        Scanner input = new Scanner(System.in);
        String check = input.nextLine().toUpperCase();
        int index = 0;
        for (Book i : listofBook) {
            if (i.getBookName().toUpperCase().contains(check)) {
                String tacgia = "";
                for (Author j : i.getAuthor()) {
                    tacgia += j.getAuthorName() + ",";
                }
                System.out.println(++index + ". " + i.getBookName() + "\t" + tacgia + "\t" + i.getPublisher());
            }
        }
        //Enter để kết thúc
        String nextLine = input.nextLine();
    }

    public void searchBookByCategory() {
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        String checkString = scanner.nextLine();
        ArrayList<Category> arrListOfCategory = new ArrayList<>();
        arrListOfCategory.add(new Category("01", "Van hoa"));
        arrListOfCategory.add(new Category("02", "Kinh te"));
        arrListOfCategory.add(new Category("03", "Thieu nhi"));
        arrListOfCategory.add(new Category("04", "Lich su"));
        arrListOfCategory.add(new Category("05", "Giao khoa"));
        arrListOfCategory.add(new Category("06", "Ngoai ngu"));
        arrListOfCategory.add(new Category("07", "Tam ly"));
        for (int i = 0; i < arrListOfCategory.size(); i++) {
            System.out.print(arrListOfCategory.get(i) + ", ");
        }
        while (!checkString.equalsIgnoreCase(arrListOfCategory.get(index).getCategoryName()) && index < arrListOfCategory.size()) {
            index++;
            if (index == arrListOfCategory.size()) {
                System.out.println("Nhap sai, nhap lai: ");
                checkString = scanner.nextLine();
                index = 0;
            }
        }
        int i = 0;
        while (!listofBook.get(i).getBookName().contains(checkString) && i < listofBook.size()) {
            System.out.println(listofBook.get(i).getBookName());
            i++;
            if (i == listofBook.size()) {
                System.out.println("Khong tim thay");
            }
        }
    }

    public void addStock(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for ( i = 0; i < listofBook.size(); i++)
            if(listofBook.get(i).isPageBook())
                System.out.println(i+": " + listofBook.get(i));
        System.out.println("Nhap STT sach can them: ");
        int number = scanner.nextInt();
        System.out.println("Nhap so sach muon them: ");
        int stock = scanner.nextInt();
        if(number >= 0 && number < listofBook.size())
            listofBook.set(number,listofBook.get(new PageBook().setStock(stock)));
    }

    public void addBook() {
        Book temp = new Book();
        temp.setInfo();
        int index = 0;
        while (!temp.getBookId().equalsIgnoreCase(listofBook.get(index).getBookId()) && index < listofBook.size()) {
            index++;
            if (index == listofBook.size()) {
                System.out.println("Nhap sai, nhap lai: ");
                temp.setInfo();
                index = 0;
            }
        }
        listofBook.add(new Book());
    }

    public void editBook() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for ( i = 0; i < listofBook.size(); i++)
            System.out.println(i+": " + listofBook.get(i));
        System.out.println("Nhap STT sach can sua: ");
        int number = scanner.nextInt();
        Book temp = new Book();
        temp.setInfo();
        if(number >= 0 && number < listofBook.size())
            listofBook.set(i,temp);

    }
    public void removeBook() {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        for ( i = 0; i < listofBook.size(); i++)
            System.out.println(i+": " + listofBook.get(i));
        System.out.println("Nhap STT sach can xoa: ");
        int number = scanner.nextInt();
        if(number >= 0 && number < listofBook.size())
            listofBook.remove(number);
    }

    public void showBook() {
        for (int i = 0; i < listofBook.size(); i++)
            System.out.println(i+": " + listofBook.get(i));
    }

    public static void danhsachSach() {
        System.out.println("------------------- Danh sách sách -------------------");
        System.out.println("Mã sách\t\tTên sách\t\tTác giả\t\tNXB\n----------------------------------------------------------");
//        int index = 0;
        for (Book i : listofBook) {
            String tacgia = "";
            for (Author j : i.getAuthor()) {
                tacgia += j.getAuthorName() + " ";
            }
            System.out.println(i.getBookId() + ". \t\t" + i.getBookName() + "\t\t" + tacgia + "\t\t" + i.getPublisher());
        }
        System.out.println("-----------------------------------------------------------");
    }

    public static void readFile() {
        try {
            Scanner scanFile = new Scanner(Paths.get("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\sach.txt"), Charset.forName("UTF-8"));
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                if (!row.equals("")) {
                    String[] data = row.split(";;");
                    listofBook.add(new Book());
                }
            }
        } catch (IOException e) {
        }
    }

    public static void writeFile() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\sach.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            for (Book i : listofBook) {
                String tacgia = "";
                if (i.getNumOfAuthors() > 1) {
                    for (int j = 0; j < i.getNumOfAuthors(); j++) {
                        tacgia += i.getAuthor()[j] + "|";
                    }
                }

                pw.println(i.getBookId() + ";;"
                        + i.getBookName() + ";;"
                        + tacgia + ";;"
                        + i.getPublisher() + ";;"
                        + i.getBookIntroduction() + ";;"
                        + i.getCategory().getCategoryName() + ";;"
                        + i.isPageBook() + ";;"
                        + i.iseBook() + ";;"
                        + i.isStatus());
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

    public static void OverwriteFile() {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\TRI\\Documents\\NetBeansProjects\\ProjectOOP\\src\\projectoop\\sach.txt", false);
            PrintWriter pw = new PrintWriter(fw);

            for (Book i : listofBook) {
                String tacgia = "";
                if (i.getNumOfAuthors() > 1) {
                    for (int j = 0; j < i.getNumOfAuthors(); j++) {
                        tacgia += i.getAuthor()[j] + "|";
                    }
                }

                pw.println(i.getBookId() + ";;"
                        + i.getBookName() + ";;"
                        + tacgia + ";;"
                        + i.getPublisher() + ";;"
                        + i.getBookIntroduction() + ";;"
                        + i.getCategory().getCategoryName() + ";;"
                        + i.isPageBook() + ";;"
                        + i.iseBook() + ";;"
                        + i.isStatus());
            }
            pw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }
}
