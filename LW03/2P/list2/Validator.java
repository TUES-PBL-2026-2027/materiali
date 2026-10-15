public class Validator {
    static int validations = 0;       // за деня, във всички превозни средства
    String line;                      // например "Tram 10"
    int inThisVehicle = 0;            // само в това превозно средство

    Validator(String line) { this.line = line; }

    void validate(Ticket t, int minute) {
        t.validate(minute);
        inThisVehicle = inThisVehicle + 1;
        validations = validations + 1;
    }
}
