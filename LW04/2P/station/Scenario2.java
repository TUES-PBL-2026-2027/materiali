public class Scenario2 {
    public static void main(String[] args) {
        Station st = new Station();
        Ticket t = st.sell("S", "");
        st.validate(t, 485);
        st.validate(t, 590);
        new Inspector(st).check(t, 600);
    }
}
