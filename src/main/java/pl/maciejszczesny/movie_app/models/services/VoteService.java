package pl.maciejszczesny.movie_app.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.movie_app.models.entities.VoteEntity;
import pl.maciejszczesny.movie_app.models.forms.VoteForm;
import pl.maciejszczesny.movie_app.models.repositories.VoteRepository;

@Service
public class VoteService {

    @Autowired
    VoteRepository voteRepository;

    public void addVote(VoteForm voteForm){
        VoteEntity voteEntity = new VoteEntity();

        voteEntity.setMovieId(voteForm.getMovieId());
        voteEntity.setUpVotes(voteForm.getUpVotes());
        voteEntity.setDownVotes(voteForm.getDownVotes());

        voteRepository.save(voteEntity);
    }
}
