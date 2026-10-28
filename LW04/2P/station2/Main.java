public class Main {
    public static void main(String[] args) {
        // касата продава
        Station lions = new Station();
        Ticket a = lions.sell("S", "");
        Ticket b = lions.sell("D", "");
        Ticket c = lions.sell("M", "Maria");
        // бележките
        Receipt receipt = new Receipt();
        receipt.print(a);
        receipt.print(b);
        receipt.print(c);
        // валидиране и контрола
        a.validate(485);
        b.validate(485);
        Inspector ivan = new Inspector();
        ivan.check(a, 500);
        ivan.check(a, 600);
        ivan.check(b, 600);
        ivan.check(c, 600);
        // счетоводството
        Report report = new Report();
        System.out.println(report.text(lions));
        report.save(lions, "report.txt");
    }
}
