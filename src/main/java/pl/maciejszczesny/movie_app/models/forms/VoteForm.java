package pl.maciejszczesny.movie_app.models.forms;

import lombok.Data;



@Data
public class VoteForm {
    private int id;
    private int movieId;
    private int upVotes;
    private int downVotes;
}
