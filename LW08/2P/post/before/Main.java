public class Main {
    public static void main(String[] args) {
        PostOffice post = new PostOffice();
        post.send("писмо");
        post.send("колет");
        post.send("експресна");
        post.insure("колет");
        post.report();
    }
}
