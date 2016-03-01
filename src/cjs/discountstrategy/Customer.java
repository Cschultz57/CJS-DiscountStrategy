package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class Customer {

    private String custId;
    private String custName;

    public Customer(String custId, String custName) {
        setCustId(custId);
        setCustName(custName);
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        //needs validation
        this.custId = custId;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) {
        //needs validation
        this.custName = custName;
    }

}
