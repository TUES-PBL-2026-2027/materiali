public class Scenario1 {
    public static void main(String[] args) {
        Station st = new Station();
        Ticket t = new Ticket();
        t.kind = "M";
        new Inspector(st).check(t, 600);
        System.out.println(st.report());
    }
}
