public class Card {
    private String owner;
    private int validUntilDay;        // ден от годината, например 304 = 31 октомври

    Card(String owner, int validUntilDay) {
        this.owner = owner;
        this.validUntilDay = validUntilDay;
    }

    String owner() { return owner; }

    boolean isValidOn(int day) { return day <= validUntilDay; }
}
