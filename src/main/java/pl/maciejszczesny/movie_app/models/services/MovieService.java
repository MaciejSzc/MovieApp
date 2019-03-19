package pl.maciejszczesny.movie_app.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.maciejszczesny.movie_app.models.entities.MovieEntity;
import pl.maciejszczesny.movie_app.models.forms.MovieForm;
import pl.maciejszczesny.movie_app.models.repositories.MovieRepository;

@Service
public class MovieService {
@Autowired
MovieRepository movieRepository;

public void addMoive(MovieForm movieForm){
    MovieEntity movieEntity = new MovieEntity();

    movieEntity.setTitle(movieForm.getTitle());
    movieEntity.setAuthor(movieForm.getAuthor());
    movieEntity.setShortSum(movieForm.getShortSum());
    movieEntity.setLongSum(movieForm.getLongSum());
    movieEntity.setGenre(movieForm.getGenre());

    movieRepository.save(movieEntity);
}

public void deleteMovie(int id){
 movieRepository.deleteById(id);
}

public MovieEntity findById(int id){
    return movieRepository.findById(id).get();
}

public Iterable<MovieEntity> findAll(){
   return movieRepository.findAll();
}

}
