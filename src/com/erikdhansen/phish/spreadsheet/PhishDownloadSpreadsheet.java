/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.phish.spreadsheet;

import com.google.gdata.data.spreadsheet.WorksheetEntry;
import java.net.URL;
import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author ehansen
 */
public class PhishDownloadSpreadsheet {
    final static Logger log = Logger.getLogger(PhishDownloadSpreadsheet.class.getName());
    WorksheetEntry entry;
    
    Date    showDate;
    boolean sbd;
    Setlist setlist;
    Venue   venue;
    String  kbps;
    URL     downloadUrl;
    String  notes;
    
    public PhishDownloadSpreadsheet(WorksheetEntry entry) {
        this.entry = entry;
        dumpInfo();
    }
    
    public void dumpInfo() {
        log.info("[" + entry.getTitle().getPlainText() + "] Rows: " + entry.getRowCount() + " Cols: " + entry.getColCount());
    }
}
