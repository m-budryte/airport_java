package com.airport.app;

public class Airport
{
    String plane;

    public Airport(){
      plane = "";
    }
    public boolean land(String landed_plane) {
      plane = landed_plane;
      return true;
    }

    public boolean takeOff(String plane_taking_off) {
      plane = "";
      return true;
    }

    public String getPlane() {
      return plane;
    }
}
