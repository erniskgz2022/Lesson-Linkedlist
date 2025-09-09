package movieTask.service;

import movieTask.enums.Genre;
import movieTask.models.Movie;

import java.time.LocalDate;
import java.util.List;

public interface MovieFindableService {
    List<Movie>getAllMovies();
    Movie findMovieByFullNameOrPartName(String name);
    Movie findMovieByActorName(String actorName);
    Movie findMovieByYear(LocalDate year);
    Movie findMovieByProducer(String producerFullName);
    Movie findMovieByGenre(Genre genre);
    Movie findMovieByRole(String role);
}
