package com.airport.app;
import java.util.*;
public class Airport
{
    List<String> planes;

    public Airport(){
      planes = new ArrayList<String>();
    }
    public boolean land(String landed_plane) {
      planes.add(landed_plane);
      return true;
    }

    public boolean takeOff(String plane_taking_off) {
      planes.remove(plane_taking_off);
      return true;
    }

    public List<String> getPlane() {
      return planes;
    }
}
