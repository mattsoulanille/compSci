
/**
 * LapTimerRunner gets a String of time values as input
 * and uses the LapTimer class to identify the maximum laptime,
 * the minimum laptime, and the average laptime, in the format
 * min:sec.
 * 
 * @author Richard White 
 * @version 2013-11-18
 */

import java.util.Scanner;

public class LapTimerRunner
{
    public static void main(String[] args)
    {
        // Get times
        String input = "7:45.59 7:33.19 7:46.30 7:56.30 7:49.82 8:36.81 8:13.56 8:06.40 8:08.63 8:13.84 8:11.35 8:26.30 8:40.41";
        
        // Create an array to store those times
        String[] lapTimes = new String[100];
        
        // Put times into the array (splitting by whitespace)
        lapTimes = input.split("\\s+");
        
        // create a laptimer
        LapTimer myTimes = new LapTimer(lapTimes);
        
        // print results        
        System.out.println("You ran " + myTimes.numOfLaps() + " laps.");
        System.out.println("The fastest lap time was " + myTimes.fastestLap());
        System.out.println("The slowest lap time was " + myTimes.slowestLap());
        System.out.println("The average lap time was " + myTimes.averageLap());
            
    }
}
