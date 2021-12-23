/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectoop;

/**
 *
 * @author TRI
 */
public class TheBook {

    /**
     * @param args the command line arguments
     */
    private int id;
    private String name;
    private String author;
    private int numOfpage;

    //Số sách
    private static int numberOfBooks = 0;

    public TheBook() {
    }

    public TheBook(String name, String author) {
        this.id = ++numberOfBooks;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfpage() {
        return numOfpage;
    }

    public void setNumOfpage(int numOfpage) {
        this.numOfpage = numOfpage;
    }

    @Override
    public String toString() {
        return "The book created id: " + this.id + ", Name: " + this.getName() + " by " + this.getAuthor();
    }

}
