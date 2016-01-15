/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.phish.spreadsheet;

import com.google.gdata.client.spreadsheet.SpreadsheetService;
import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import com.google.gdata.data.spreadsheet.SpreadsheetFeed;
import com.google.gdata.util.ServiceException;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author ehansen
 */
public class PhishSpreadsheetService extends SpreadsheetService {

    public final static String BASE_URL = "https://spreadsheets.google.com/spreadsheet/pub?key=0AjeIQ6qQvexzcDhXS2twUC1US3BPMVZuUWdjZmY2RVE&gid=7";
    PhishSpreadsheetMain main;

    public PhishSpreadsheetService() throws PhishSpreadsheetServiceException {
        super("PhishSpreadsheetService-v1");
        main = getMainSpreadsheet();
    }

    public final PhishSpreadsheetMain getMainSpreadsheet() throws PhishSpreadsheetServiceException {
        try {
            SpreadsheetFeed feed = getFeed(getBaseUrl(), SpreadsheetFeed.class);
            
            return new PhishSpreadsheetMain(new SpreadsheetEntry());
        } catch (IOException | ServiceException e) {
            throw new PhishSpreadsheetServiceException("Unable to retrieve spreadsheet", e);
        }
    }

    public PhishDownloadSpreadsheet getDownloadSpreadsheet() throws PhishSpreadsheetServiceException {
        retrun new PhishDownloadSpreadsheet()
    }

    public static URL getBaseUrl() {
        return _getURL(BASE_URL);
    }

    public static URL getErrorUrl() {
        try {
            return PhishSpreadsheetService.class.getResource("error.html");
        } catch (Exception e) {
            throw new PhishSpreadsheetServiceRuntimeException("Error generating error page URL");
        }
    }

    private static URL _getURL(String _u) {
        try {
            return new URL(_u);
        } catch (Exception e) {
            throw new PhishSpreadsheetServiceRuntimeException("Error generating URL from: " + _u);
        }
    }
}
