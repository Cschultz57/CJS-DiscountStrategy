package cjs.discountstrategy;

/**
 *
 * @author Carson Schultz
 */
public class Customer {
    public static final int ID_MIN = 3;
    public static final int ID_MAX = 7;
    public static final int NAME_MIN = 3;
    public static final int NAME_MAX = 7;
    public static final String SPACE = " ";
    public static final int SPC_INDX = -1;
    private String custId;
    private String custName;

    public Customer(String custId, String custName) {
        setCustId(custId);
        setCustName(custName);
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId)throws IllegalArgumentException {
       
        if (custId == null || custId.isEmpty() || custId.length() < ID_MIN || custId.length() > ID_MAX) {
            throw new CustomerIdException();
        }
        this.custId = custId;
    }
    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName)throws IllegalArgumentException {
       
        if (custName == null || custName.isEmpty() ||
                custName.length() < NAME_MIN || custName.length() > NAME_MAX ||
                custName.indexOf(SPACE) == SPC_INDX) {
            throw new IllegalArgumentException();
        }
        this.custName = custName;
    }

}
