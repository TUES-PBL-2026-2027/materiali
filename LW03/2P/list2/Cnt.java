public class Cnt {
    public static void main(String[] args) {
        Validator v1 = new Validator("Tram 10");
        Validator v2 = new Validator("Bus 94");
        Ticket t = new Ticket();
        v1.validate(t, 100);
        v2.validate(t, 200);
        v2.validate(new Ticket(), 210);
        System.out.println(Validator.validations + " " + v1.inThisVehicle
            + " " + v2.inThisVehicle + " " + Ticket.sold);
        System.out.println(t.isValidAt(225) + " " + t.isValidAt(235));
    }
}
