
/**
 * Write a description of class LapTimer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LapTimer
{
    public String[] stringTimes;
    public double[] doubleTimes;

    /**
     * Constructor for objects of class LapTimer
     * 
     * Note that this method uses "parallel arrays" to keep track of
     * the String versions of the times (in the array stringTimes) and
     * the double versions of the times (in the array doubltTimes).
     * 
     * Ordinarily we'd avoid this kind of situation, but the intent of
     * this exercise is to practice using arrays, so we're going to go
     * with it!
     */
    public LapTimer(String[] theStringTimes)
    {
        stringTimes = theStringTimes;
        doubleTimes = new double[stringTimes.length];
        // convert stringTimes to seconds using the toSeconds method
        for (int i = 0; i < stringTimes.length; i++)
        {
            doubleTimes[i] = toSeconds(stringTimes[i]);
        }
    }

    /**
     * Returns an int of the number of laps
     * @return int
     */
    public int numOfLaps()
    {
	return doubleTimes.length;
    }
    
    /**
     * Returns a string value of the fastest lap
     * @return String
     * 
     */
    public String fastestLap()
    {
	int fast = 0;
	for (int i = 0; i < numOfLaps(); i++) {
	    if (doubleTimes[fast] < doubleTimes[i]) {
		fast = i;
	    }
	}
	return stringTimes[fast];
    }
    
    /**
     * Finds the slowest lap in lap format
     * @return String
     */
    public String slowestLap()
    {

	int slow = 0;
	for (int i = 0; i < numOfLaps(); i++) {
	    if (doubleTimes[slow] > doubleTimes[i]) {
		slow = i;
	    }
	}
	return stringTimes[slow];
    }
    
    /**
     * Finds the average lap time in lap format
     * @return String
     */
    public String averageLap()
    {
	double sum = 0;
	for (double time : doubleTimes) {
	    sum += time;
	}
	double average = sum / numOfLaps();
	return toTimeFormat(average);
    }
    
    /**
     * toSeconds method converts String format formatted as "min:sec" to seconds
     * @param timer readout
     * @return seconds
     */
    public double toSeconds(String timerReadout)
    {
        int colonLoc = timerReadout.indexOf(":");
        double minutes = Double.parseDouble(timerReadout.substring(0,colonLoc));
        double seconds = Double.parseDouble(timerReadout.substring(colonLoc + 1));
        return minutes * 60 + seconds;
    }
    
    
    /**
     * toTimeFormat method converts seconds to "min:sec" formatted string
     * @param seconds the total number of seconds 
     * @return the formatted string value
     */
    public String toTimeFormat(double theSeconds)
    {
        int minutes = (int) theSeconds / 60;
        double seconds = theSeconds % 60;
        return String.format("%d",minutes) + ":" + String.format("%5.2f",seconds) ;
    }
    
}
