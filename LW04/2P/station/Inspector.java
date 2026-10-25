public class Inspector {
    public Station station;

    public Inspector(Station station) {
        this.station = station;
    }

    public void check(Ticket t, int minute) {
        if (station.isValid(t, minute)) {
            System.out.println("OK");
        } else {
            System.out.println("ГЛОБА");
        }
    }
}
