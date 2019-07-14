package com.airport.app;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
}
