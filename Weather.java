public class Weather {
    private int[] highTemps;
    private int[] lowTemps;
    private int windSpeedMPH;
    private int numberTemperatures;
    private char weatherCode;
    private String description;

    public Weather(int[] highTemps, int[] lowTemps, int windSpeedMPH, char weatherCode) {
        this.highTemps = highTemps.clone();
        this.lowTemps = lowTemps.clone();
        this.windSpeedMPH = windSpeedMPH;
        this.numberTemperatures = highTemps.length;
        this.weatherCode = weatherCode;
        determineDescription();
    }

    public double calculateAverageHigh() {
        int sum = 0;
        for (int temp : highTemps) sum += temp;
        return (double) sum / numberTemperatures;
    }

    public double calculateAverageLow() {
        int sum = 0;
        for (int temp : lowTemps) sum += temp;
        return (double) sum / numberTemperatures;
    }

    public int findWeeklyHigh() {
        int max = highTemps[0];
        for (int temp : highTemps) if (temp > max) max = temp;
        return max;
    }

    public int findWeeklyLow() {
        int min = lowTemps[0];
        for (int temp : lowTemps) if (temp < min) min = temp;
        return min;
    }

    private void determineDescription() {
        switch (weatherCode) {
            case 'S':
                description = "SUNNY";
                break;
            case 'P':
                description = "PARTLY CLOUDY";
                break;
            case 'C':
                description = "CLOUDY";
                break;
            case 'N':
                description = "CLEAR";
                break;
            default:
                description = "UNKNOWN";
        }
    }

    public void displayTodayWeather() {
        System.out.println("SUNDAY FORECAST");
        System.out.println("High: " + highTemps[0] + " (F) Low: " + lowTemps[0] + " (F)");
        System.out.println();
    }

    public void displayWeeklyWeather() {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("THE WEEKLY FORECAST");
        System.out.println("Average Hi:  " + calculateAverageHigh());
        System.out.println("Average Low: " + calculateAverageLow());
        System.out.println();
        System.out.println("Highest Weekly Temperature: " + findWeeklyHigh() + " (F)");
        System.out.println("Lowest Weekly Temperature:  " + findWeeklyLow() + " (F)");
        System.out.println();
        for (int i = 0; i < numberTemperatures; i++) {
            System.out.println(days[i]);
            System.out.println("High: " + highTemps[i] + " (F) Low: " + lowTemps[i] + " (F)");
            System.out.println();
        }
    }

    public String getDescription() {
        return description;
    }
}