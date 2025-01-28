package org.nour.booksmanagementapi.models;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "books")
public class Book {
    // ENTITES OF BOOK TABLE IN DATABASE
    /* DIDN'T USE @COLUMN ON THEM CAUSE ITS AUTOMATIC ASSIGNED IF THE ATTRIBUTE GOT THE SAME NAMES BUT IN CASE U
    CHANGE U NEED TO ASSIGN EACH ATTRIBUTE TO IT'S COLUMN */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // WE WILL LET THE DB AUTO INCREMENT IT
    private int id;
    private String title;
    private String author;
    private double price;
    private Date publish_data;

/////////////////////////////////////////////////////
    public Book() {}

    public Book(Date publish_data, double price, String author, String title) {
        this.publish_data = publish_data;
        this.price = price;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publish_data=" + publish_data +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPublish_data() {
        return publish_data;
    }

    public void setPublish_data(Date publish_data) {
        this.publish_data = publish_data;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
