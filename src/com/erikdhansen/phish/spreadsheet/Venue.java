/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.phish.spreadsheet;

import java.net.URL;

/**
 *
 * @author ehansen
 */
public class Venue {
    String name;
    String city;
    String state;
    
    // TBD...link up with either Google Maps API or preferably Nokia HERE :-)
    String gps;
    URL    mapURL;
    
    public Venue() {
    }
    
    public Venue(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public URL getMapURL() {
        return mapURL;
    }

    public void setMapURL(URL mapURL) {
        this.mapURL = mapURL;
    }
    
    
}
