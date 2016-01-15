/*
 * Setlist
 * 
 * This class is going to stub out, pretty much, to
 * a URL to the setlist on the web until I get to dealing with
 * reading and parsing them.
 * 
 * @author ehansen@erikdhansen.com
 * 
 */
package com.erikdhansen.phish.spreadsheet;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author ehansen
 */
public class Setlist {
    URL url;
    
    public Setlist(){}
    public Setlist(URL url) {
        this.url = url;
    }
    public Setlist(String url) throws MalformedURLException {
        this.url = new URL(url);
    }
}
