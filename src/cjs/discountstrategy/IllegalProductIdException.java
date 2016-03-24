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
public class IllegalProductIdException extends IllegalArgumentException{
    //LAB 4 EXCEPTIONSLAB HOMEWORK
    public IllegalProductIdException() {
    }

    public IllegalProductIdException(String s) {
        super(s);
    }

    public IllegalProductIdException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalProductIdException(Throwable cause) {
        super(cause);
    }
    
}
