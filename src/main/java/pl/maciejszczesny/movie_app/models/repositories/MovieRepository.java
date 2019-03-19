package pl.maciejszczesny.movie_app.models.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.maciejszczesny.movie_app.models.entities.MovieEntity;

@Repository
public interface MovieRepository extends CrudRepository<MovieEntity, Integer> {

}
