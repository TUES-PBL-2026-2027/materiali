import java.io.FileWriter;
import java.io.IOException;

public class Station {
    public Ticket[] sold = new Ticket[100];
    public int count = 0;
    public int cash = 0;

    public Ticket sell(String kind, String owner) {
        Ticket t = new Ticket();
        t.kind = kind;
        t.owner = owner;
        if (kind.equals("S")) {
            t.price = 160;
        } else if (kind.equals("D")) {
            t.price = 400;
        } else if (kind.equals("M")) {
            t.price = 5000;
        }
        cash = cash + t.price;
        sold[count] = t;
        count = count + 1;
        System.out.println("----- БИЛЕТ -----");
        System.out.println("вид: " + kind + "  цена: " + lv(t.price));
        if (kind.equals("M")) {
            System.out.println("име: " + owner);
        }
        System.out.println("-----------------");
        return t;
    }

    public void validate(Ticket t, int minute) {
        t.validatedAt = minute;
    }

    public boolean isValid(Ticket t, int minute) {
        if (t.kind.equals("M")) {
            return true;
        }
        if (t.validatedAt < 0) {
            return false;
        }
        if (t.kind.equals("S")) {
            return minute - t.validatedAt <= 30;
        } else if (t.kind.equals("D")) {
            return minute - t.validatedAt <= 24 * 60;
        }
        return false;
    }

    public String report() {
        int s = 0, d = 0, m = 0;
        for (int i = 0; i < count; i++) {
            if (sold[i].kind.equals("S")) {
                s = s + 1;
            } else if (sold[i].kind.equals("D")) {
                d = d + 1;
            } else if (sold[i].kind.equals("M")) {
                m = m + 1;
            }
        }
        return "продадени: " + count + " (S " + s + ", D " + d + ", M " + m + "), каса: " + lv(cash);
    }

    public String lv(int stotinki) {
        String st = "" + stotinki % 100;
        if (stotinki % 100 < 10) {
            st = "0" + st;
        }
        return stotinki / 100 + "." + st + " лв";
    }

    public void saveReport(String file) {
        try {
            FileWriter w = new FileWriter(file);
            w.write(report() + "\n");
            w.close();
        } catch (IOException e) {
            System.out.println("не мога да запиша " + file);
        }
    }
}
