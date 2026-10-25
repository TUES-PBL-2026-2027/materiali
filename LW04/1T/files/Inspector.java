public class Inspector {
    boolean check(Validatable v, int minute) {
        return v.isValidAt(minute);
    }
}
