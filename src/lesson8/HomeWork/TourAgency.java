package lesson8.HomeWork;

public class TourAgency {
    public Tour[] tours = new Tour[10];

    public void addTour(Tour tour) {
        for (int i = 0; i < 10; i++) {
            if (tours[i] == null) {
                tours[i] = tour;
                break;
            }
        }
    }


}
