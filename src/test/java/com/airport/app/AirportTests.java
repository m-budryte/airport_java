package com.airport.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.*;

public class AirportTests
{
    private final Airport airport = new Airport();

    @Test
    public void landsPlaneAndReturnsTrue()
    {
      boolean expected = true;
      boolean actual = airport.land("plane");
      assertEquals(expected, actual);
    }

    @Test
    public void takesOffPlaneReturnsTrue()
    {
      boolean expected = true;
      boolean actual = airport.takeOff("plane");
      assertEquals(expected, actual);
    }

    @Test
    public void landsPlaneAndStoresIt() {
      airport.land("plane");
      List<String> actual = airport.getPlane();
      assertEquals(Arrays.asList("plane"), actual);
    }

    @Test
    public void takesOffAndRemovesPlane()
    {
      airport.land("plane");
      airport.takeOff("plane");
      List<String> actual = airport.getPlane();
      assertEquals(Arrays.asList(), actual);
    }
}
