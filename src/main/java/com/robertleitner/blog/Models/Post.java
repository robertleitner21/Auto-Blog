package com.robertleitner.blog.Models;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String announcement;

    @Column(length = 10000)
    private String fullText;

    private String image;

    public Post() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String anons) {
        this.announcement = anons;
    }

    public String getFullText() {
        return fullText;
    }

    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String images) {
        this.image = images;
    }

    @Transient
    public String getImagePath() {
        if (image == null || id == null) return null;

        return "/post-images/" + id + "/" + image;
    }

    public Post(String title, String announcement, String fullText, String image) {
        this.title = title;
        this.announcement = announcement;
        this.fullText = fullText;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", announcement='" + announcement + '\'' +
                ", fullText='" + fullText + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
