public class Main {
    public static void main(String[] args) {
        BoxOffice box = new BoxOffice();
        box.sell("нормален");
        box.sell("студентски");
        box.sell("промо");
        box.refund("студентски");
        box.report();
    }
}
