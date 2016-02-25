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
public interface DataBaseStrategy {

    Customer findCustomerById(String custId);

    Product findProductById(String prodId);
    
}
