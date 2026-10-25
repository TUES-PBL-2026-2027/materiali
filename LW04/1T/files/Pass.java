public class Pass implements Validatable {
    private int from;                     // минута от деня
    private int to;

    Pass(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public boolean isValidAt(int minute) {
        return from <= minute && minute <= to;
    }
}
