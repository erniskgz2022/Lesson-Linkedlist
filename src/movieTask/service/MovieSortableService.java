package movieTask.service;

public interface MovieSortableService {

    void sortMovieByName(String asOrDesc);
    void sortByYear(String ascOrDesc);
//    Ascending
//    Descending
    void sortByProducer(String nameOrLastName);
}
