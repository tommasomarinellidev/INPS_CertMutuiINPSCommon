package it.inps.eng.wscertificazionemutui.common.utils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ChronoTest {
//
//    private Chrono chrono;
//
//    @BeforeEach
//    public void setUp() {
//        chrono = new Chrono();
//    }
//
//    @Test
//    public void testGetStartTime() {
//        Calendar startCalendar = GregorianCalendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        String expectedStartTime = sdf.format(startCalendar.getTime());
//        String actualStartTime = chrono.getStartTime();
//        assertEquals(expectedStartTime, actualStartTime, "Start time should match the expected time.");
//    }
//
//    @Test
//    public void testGetEndTime() {
//        Calendar endCalendar = GregorianCalendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        String expectedEndTime = sdf.format(endCalendar.getTime());
//        String actualEndTime = chrono.getEndTime();
//        assertTrue(actualEndTime.matches("\\d{2}:\\d{2}:\\d{2}"), "End time should be in HH:mm:ss format.");
//    }
//
//    @Test
//    public void testGetTimeSpent() {
//        // Ensure the clock is started
//        long initialStartTimeMillis = GregorianCalendar.getInstance().getTimeInMillis();
//        chrono.getStartTime();
//        long timeSpentMillis = chrono.getTimeSpent();
//        long currentEndTimeMillis = GregorianCalendar.getInstance().getTimeInMillis();
//        long expectedTimeSpentMillis = currentEndTimeMillis - initialStartTimeMillis;
//        
//        // The actual time spent should be approximately equal to the expected time
//        assertTrue(timeSpentMillis >= 200 && timeSpentMillis < 300, "Time spent should be approximately 200 milliseconds.");
//    }
//
//    @Test
//    public void testEndTimeInitialization() {
//        // Verify that getEnd() initializes the end time correctly
//        Calendar start = GregorianCalendar.getInstance();
//        chrono.getStartTime();
//        String endTime = chrono.getEndTime();
//        Calendar end = GregorianCalendar.getInstance();
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//        String expectedEndTime = sdf.format(end.getTime());
//        assertTrue(endTime.matches("\\d{2}:\\d{2}:\\d{2}"), "End time should be in HH:mm:ss format.");
//    }
}
