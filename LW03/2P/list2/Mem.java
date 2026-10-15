public class Mem {
    public static void main(String[] args) {
        Ticket a = new Ticket();
        Ticket b = a;
        Ticket c = new Ticket();
        b.validate(485);
        int[] m = {485, 490};
        int[] n = m;
        n[0] = 500;
        System.out.println(a.isValidAt(500) + " " + c.isValidAt(500) + " " + m[0]);
    }
}
