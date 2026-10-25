public class Main4 {
    public static void main(String[] args) {
        Inspector ivan = new Inspector();
        Ticket t = new Ticket();
        t.validate(485);
        Pass p = new Pass(300, 1200);
        System.out.println(ivan.check(t, 500)
            + " " + ivan.check(p, 500));
        System.out.println(ivan.check(p, 1300));
    }
}
