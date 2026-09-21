public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        m1.title = "Avengers: Endgame";
        m1.genre = "Action";
        m1.duration = 181;
        
        m1.displayInfo();

        Movie m2 = new Movie();
        m2.title = "The Hangover";
        m2.genre = "Comedy";
        m2.duration = 100;
        
        m2.displayInfo();

        Movie m3 = new Movie();
        m3.title = "The Notebook";
        m3.genre = "Romance";
        m3.duration = 123;
        
        m3.displayInfo();
    }
}
