package lesson8.HomeWork;

public class Tour {
    private String country;
    private int days;
    private String transport;
    private double price;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tour(){
        this.country = null;
        this.days = 0;
        this.transport = null;
        this.price = 0.0;
    }

    public Tour(int days, double price){
        this.days = days;
        this.price = price;
        this.country = null;
        this.transport = null;
    }

    public Tour(String country, int days, String transport, double price){
        this.price = price;
        this.days = days;
        this.transport = transport;
        this.country = country;
    }

    public void displayTour(){
        System.out.println("Страна: "+getCountry()+", дни: " + getDays() +", цена: " + getPrice() + ", транспорт: " + getTransport());
    }

}
