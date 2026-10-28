import java.io.FileWriter;
import java.io.IOException;

public class Report {
    public String text(Station st) {
        Ticket[] sold = st.getSold();
        int s = 0, d = 0, m = 0;
        for (Ticket t : sold) {
            if (t.getKind().equals("S")) {
                s = s + 1;
            } else if (t.getKind().equals("D")) {
                d = d + 1;
            } else if (t.getKind().equals("M")) {
                m = m + 1;
            }
        }
        return "продадени: " + sold.length + " (S " + s + ", D " + d + ", M " + m + "), каса: " + Money.lv(st.getCash());
    }

    public void save(Station st, String file) {
        try {
            FileWriter w = new FileWriter(file);
            w.write(text(st) + "\n");
            w.close();
        } catch (IOException e) {
            System.out.println("не мога да запиша " + file);
        }
    }
}
