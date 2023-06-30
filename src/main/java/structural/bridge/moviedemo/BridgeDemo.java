package structural.bridge.moviedemo;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie("Action", "2:30", "John Wick", "2014");

        PrintFormatter printFormatter = new PrintFormatter();
        HtmlFormatter htmlFormatter = new HtmlFormatter();

        MoviePrinter moviePrinter = new MoviePrinter(movie);
        String printed = moviePrinter.print(printFormatter);
        System.out.println(printed);

        String htmlPrinted = moviePrinter.print(htmlFormatter);
        System.out.println(htmlPrinted);
    }
}
