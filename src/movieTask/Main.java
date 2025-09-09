package movieTask;

import movieTask.enums.Genre;
import movieTask.models.Actor;
import movieTask.models.Movie;
import movieTask.models.Producer;
import movieTask.service.Impl.MovieServiceImpl;
import movieTask.service.MovieFindableService;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Movie> movies = new ArrayList<>();
        MovieServiceImpl service = new MovieServiceImpl(movies);

        while (true) {
            System.out.println("""
                ===== MENU =====
                1 - Show all movies
                2 - Add movie
                3 - Find movie by name
                4 - Find movie by actor
                5 - Find movie by year
                6 - Find movie by producer
                7 - Find movie by genre
                8 - Find movie by role
                9 - Sort movies by name
                10 - Sort movies by year
                11 - Sort movies by producer
                0 - Exit
                """);

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    if (service.getAllMovies().isEmpty()) {
                        System.out.println("No movies yet!");
                    } else {
                        service.getAllMovies().forEach(System.out::println);
                    }
                }
                case 2 -> {

                    System.out.print("Movie name: ");
                    String name = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();
                    LocalDate releaseDate = LocalDate.of(year, 1, 1);

                    System.out.print("Genre (ACTION, ROMAN, DRAMA, COMEDY): ");
                    Genre genre = Genre.valueOf(sc.nextLine().toUpperCase());

                    System.out.print("Producer first name: ");
                    String prodName = sc.nextLine();
                    System.out.print("Producer last name: ");
                    String prodLast = sc.nextLine();
                    Producer producer = new Producer(prodName, prodLast);

                    System.out.print("How many actors? ");
                    int actorCount = sc.nextInt();
                    sc.nextLine();
                    List<Actor> actors = new ArrayList<>();
                    for (int i = 0; i < actorCount; i++) {
                        System.out.print("Actor full name: ");
                        String actorFullName = sc.nextLine();
                        System.out.print("Role: ");
                        String role = sc.nextLine();
                        actors.add(new Actor(actorFullName, role));
                    }

                    Movie movie = new Movie(name, releaseDate, genre, producer, actors);
                    service.getAllMovies().add(movie);
                    System.out.println("Movie added successfully!");
                }
                case 3 -> {
                    System.out.print("Enter movie name: ");
                    String name = sc.nextLine();
                    System.out.println(service.findMovieByFullNameOrPartName(name));
                }
                case 4 -> {
                    System.out.print("Enter actor name: ");
                    String actor = sc.nextLine();
                    System.out.println(service.findMovieByActorName(actor));
                }
                case 5 -> {
                    System.out.print("Enter year: ");
                    int y = sc.nextInt();
                    sc.nextLine();
                    System.out.println(service.findMovieByYear(LocalDate.of(y, 1, 1)));
                }
                case 6 -> {
                    System.out.print("Enter producer full name: ");
                    String prod = sc.nextLine();
                    System.out.println(service.findMovieByProducer(prod));
                }
                case 7 -> {
                    System.out.print("Enter genre (ACTION, ROMAN, DRAMA, COMEDY): ");
                    Genre genre = Genre.valueOf(sc.nextLine().toUpperCase());
                    System.out.println(service.findMovieByGenre(genre));
                }
                case 8 -> {
                    System.out.print("Enter role: ");
                    String role = sc.nextLine();
                    System.out.println(service.findMovieByRole(role));
                }
                case 9 -> {
                    System.out.print("Sort order (asc/desc): ");
                    String order = sc.nextLine();
                    service.sortMovieByName(order);
                }
                case 10 -> {
                    System.out.print("Sort order (asc/desc): ");
                    String order = sc.nextLine();
                    service.sortByYear(order);
                }

                case 11 -> {
                    System.out.print("Sort by (name/lastname): ");
                    String type = sc.nextLine();
                    service.sortByProducer(type);
                }

                case 0 -> {
                    System.out.println("Program ended!");
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }

    }
}
