/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class CustomerIdException extends IllegalArgumentException {

    private static final String ERR_MSG = "Customer ID is invalid";
    
    public CustomerIdException() {
        super(ERR_MSG);
    }

    public CustomerIdException(String s) {
        super(ERR_MSG);
    }

    public CustomerIdException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public CustomerIdException(Throwable cause) {
        super(cause);
    }
}