public class Money {
    public static String lv(int stotinki) {
        String st = "" + stotinki % 100;
        if (stotinki % 100 < 10) {
            st = "0" + st;
        }
        return stotinki / 100 + "." + st + " лв";
    }
}
