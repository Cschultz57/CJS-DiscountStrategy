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
public class ConsoleOutput implements OutputStrategy {

    @Override
    public final void printReceipt(Receipt r) {
        System.out.println(r.ReceiptFormat());
    }

}
