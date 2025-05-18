public class Main {
    public static void main(String[] args) {
        int[] fh = {78, 76, 80, 82, 85, 79, 75};
        int[] fl = {75, 70, 75, 76, 75, 70, 69};
        int ws = 9;
        char wc = 'P';

        Weather w = new Weather(fh, fl, ws, wc);

        // Display info
        System.out.println("Weather description: " + w.getDescription());
        w.displayTodayWeather();
        w.displayWeeklyWeather();
    }
}