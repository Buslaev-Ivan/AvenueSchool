package lesson8.HomeWork;

public class Main {
    public static void main(String[] args) {
        TourAgency tourAgency = new TourAgency();
        Tour tour1 = new Tour("??????",6,"???????",245.70);
        Tour tour2 = new Tour("??????",4,"???????",145.70);


        tourAgency.addTour(tour1);
        tourAgency.addTour(tour2);
    }
}
