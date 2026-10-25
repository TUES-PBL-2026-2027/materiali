public class Main {
    public static void main(String[] args) {
        Station lions = new Station();
        Ticket a = lions.sell("S", "");
        Ticket b = lions.sell("D", "");
        Ticket c = lions.sell("M", "Maria");
        lions.validate(a, 485);
        lions.validate(b, 485);
        Inspector ivan = new Inspector(lions);
        ivan.check(a, 500);
        ivan.check(a, 600);
        ivan.check(b, 600);
        ivan.check(c, 600);
        System.out.println(lions.report());
        lions.saveReport("report.txt");
    }
}
