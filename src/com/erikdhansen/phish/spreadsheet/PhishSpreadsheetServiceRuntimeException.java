/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikdhansen.phish.spreadsheet;

/**
 *
 * @author ehansen
 */
public class PhishSpreadsheetServiceRuntimeException extends RuntimeException {
    public PhishSpreadsheetServiceRuntimeException(String message) {
        super(message);
    }
    
    public PhishSpreadsheetServiceRuntimeException(String message, Throwable t) {
        super(message, t);
    }
}
