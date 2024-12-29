package org.example.reviews.models;

import java.time.LocalDateTime;

/**
 * @author Manuel Aguilera / @aguileradev
 */
public abstract class Review {
    private Integer id;
    private String author;
    private String comment;
    private Float rating;
    private LocalDateTime date;

    public Review() {};

    public Review(Integer id, String author, String comment, Float rating, LocalDateTime date) {
        this.id = id;
        this.author = author;
        this.comment = comment;
        this.rating = rating;
        this.date = date;
    };

    public abstract Float calculateRating();


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                ", date=" + date +
                '}';
    }
}