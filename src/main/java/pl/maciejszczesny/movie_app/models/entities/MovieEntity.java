package pl.maciejszczesny.movie_app.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Data
public class MovieEntity {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String author;
    private int year;
    @Column(name= "short_sum")
    private String shortSum;
    @Column(name= "long_sum")
    private String longSum;
    private String genre;

}
