/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.phish.spreadsheet;

import com.google.gdata.data.spreadsheet.SpreadsheetEntry;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

/**
 *
 * @author ehansen
 */
public abstract class PhishSpreadSheetBase extends SpreadsheetEntry {
    final static Logger log = Logger.getLogger("[PhishSpreadSheet]");
    public final static URL ERROR_URL = PhishSpreadsheetService.getErrorUrl();
    
    public PhishSpreadSheetBase(SpreadsheetEntry entry) {
        super(entry);
    }
}
