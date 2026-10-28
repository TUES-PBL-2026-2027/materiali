public class Main {
    public static void main(String[] args) {
        Station lions = new Station();
        Receipt receipt = new Receipt();
        Ticket a = lions.sell("S", "");
        receipt.print(a);
        Ticket b = lions.sell("D", "");
        receipt.print(b);
        Ticket c = lions.sell("M", "Maria");
        receipt.print(c);
        a.validate(485);
        b.validate(485);
        Inspector ivan = new Inspector();
        ivan.check(a, 500);
        ivan.check(a, 600);
        ivan.check(b, 600);
        ivan.check(c, 600);
        Report report = new Report();
        System.out.println(report.text(lions));
        report.save(lions, "report.txt");
    }
}
