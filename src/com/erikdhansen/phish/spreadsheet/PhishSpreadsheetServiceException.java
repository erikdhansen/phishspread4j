/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.phish.spreadsheet;

/**
 *
 * @author ehansen
 */
public class PhishSpreadsheetServiceException extends Exception {
    public PhishSpreadsheetServiceException(String message) {
        super(message);
    }
    
    public PhishSpreadsheetServiceException(String message, Throwable t) {
        super(message, t);
    }
}
