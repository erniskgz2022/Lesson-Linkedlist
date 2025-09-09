package movieTask.service.Impl;

import movieTask.db.Database;
import movieTask.enums.Genre;
import movieTask.models.Actor;
import movieTask.models.Movie;
import movieTask.service.MovieFindableService;
import movieTask.service.MovieSortableService;

import java.security.cert.CertPath;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

public class MovieServiceImpl implements MovieFindableService, MovieSortableService {
    private List<Movie> movies;

    public MovieServiceImpl(List<Movie> movies) {
        this.movies = movies;
    }


    @Override
    public List<Movie> getAllMovies() {
        return movies;
    }

    @Override
    public Movie findMovieByFullNameOrPartName(String name) {
        try {
            for (Movie movie : movies) {
                if (movie.getName().toLowerCase().contains(name.toLowerCase())){
                    return movie;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Movie findMovieByActorName(String actorName) {
        try {
            for (Movie movie : movies) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getActorFullName().equalsIgnoreCase(actorName)) {
                        return movie;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Movie findMovieByYear(LocalDate year) {
        try {
            for (Movie movie : movies) {
                if (movie.getYear().equals(year)){
                    return movie;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Movie findMovieByProducer(String producerFullName) {
        try {
            for (Movie movie : movies) {
                if (movie.getProducer().getFullName().equalsIgnoreCase(producerFullName)) {
                    return movie;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Movie findMovieByGenre(Genre genre) {
        try {
            for (Movie movie : movies) {
                if (movie.getGenre().equals(genre)){
                    return movie;
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        try {
            for (Movie movie : movies) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getRole().equalsIgnoreCase(role)) {
                        return movie;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void sortMovieByName(String asOrDesc) {
        if (asOrDesc.equalsIgnoreCase("asc")){
            movies.sort(Comparator.comparing(Movie::getName));
        }else {
           movies.sort(Comparator.comparing(Movie::getName).reversed());
        }
        movies.forEach(System.out::println);
    }

    @Override
    public void sortByYear(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")){
            movies.sort(Comparator.comparing(Movie::getYear));
        }else {
            movies.sort(Comparator.comparing(Movie::getYear).reversed());
        }
        movies.forEach(System.out::println);
    }

    @Override
    public void sortByProducer(String nameOrLastName) {
        if (nameOrLastName.equalsIgnoreCase("name")){
            movies.sort(Comparator.comparing(m -> m.getProducer().getFullName().split(" ")[0]));
        }else {
            movies.sort(Comparator.comparing(m -> m.getProducer().getFullName().split(" ")[1]));
        }
       movies.forEach(System.out::println);
    }
}
