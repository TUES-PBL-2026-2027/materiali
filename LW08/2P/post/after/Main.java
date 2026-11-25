public class Main {
    public static void main(String[] args) {
        PostOffice post = new PostOffice(new ConsoleOutput());
        post.send(new Letter());
        post.send(new Parcel());
        post.send(new Express());
        post.insure(new Parcel());
        post.report();
    }
}
