package projectoop;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Author {

    private String authorName;
    private String authorEmail;

    public Author() {
        this.authorName = "";
        this.authorEmail = "";
    }

    public Author(String name, String email) {
        this.authorName = name;
        this.authorEmail = email;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public void setAuthorInfo() {
        Scanner scanner = new Scanner(System.in);
        String checkString;
        System.out.println("Nhap ten tac gia: ");
        authorName = scanner.nextLine();
        System.out.println("Nhap dia chi email: ");
        checkString = scanner.nextLine();
        String checkEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while (Pattern.matches(checkEmail, checkString) == false) {
            System.out.println("Email khong hop le, vui long nhap lai: ");
            System.out.println("Vi du: abc@xyz.com");
            checkString = scanner.nextLine();
        }
        this.setAuthorEmail(checkString);
    }

    @Override
    public String toString() {
        return authorName + ", email: " + authorEmail;
    }
}
