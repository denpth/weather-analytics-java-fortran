import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeatherTest {

    @Test
    void testCalculateAverageHigh() {
        int[] highs = {78, 76, 80, 82, 85, 79, 75};
        int[] lows = {75, 70, 75, 76, 75, 70, 69};
        Weather w = new Weather(highs, lows, 9, 'P');
        assertEquals(79.2857, w.calculateAverageHigh(), 0.0001);
    }

    @Test
    void testCalculateAverageLow() {
        int[] highs = {78, 76, 80, 82, 85, 79, 75};
        int[] lows = {75, 70, 75, 76, 75, 70, 69};
        Weather w = new Weather(highs, lows, 9, 'P');
        assertEquals(72.8571, w.calculateAverageLow(), 0.0001);
    }

    @Test
    void testFindWeeklyHigh() {
        int[] highs = {78, 76, 80, 82, 85, 79, 75};
        int[] lows = {75, 70, 75, 76, 75, 70, 69};
        Weather w = new Weather(highs, lows, 9, 'P');
        assertEquals(85, w.findWeeklyHigh());
    }

    @Test
    void testFindWeeklyLow() {
        int[] highs = {78, 76, 80, 82, 85, 79, 75};
        int[] lows = {75, 70, 75, 76, 75, 70, 69};
        Weather w = new Weather(highs, lows, 9, 'P');
        assertEquals(69, w.findWeeklyLow());
    }

    @Test
    void testDetermineDescriptionSunny() {
        int[] highs = {78, 76, 80, 82, 85, 79, 75};
        int[] lows = {75, 70, 75, 76, 75, 70, 69};
        Weather w = new Weather(highs, lows, 9, 'S');
        assertEquals("SUNNY", w.getDescription());
    }

    @Test
    void testDetermineDescriptionUnknown() {
        int[] highs = {78, 76, 80, 82, 85, 79, 75};
        int[] lows = {75, 70, 75, 76, 75, 70, 69};
        Weather w = new Weather(highs, lows, 9, 'X');
        assertEquals("UNKNOWN", w.getDescription());
    }
}