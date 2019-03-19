package pl.maciejszczesny.movie_app.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "movie")
@Data
public class VoteEntity {
    @Id
    @GeneratedValue
    private int id;
    private int movieId;
    @Column(name= "up_votes")
    private int upVotes;
    @Column(name= "down_votes")
    private int downVotes;
}
