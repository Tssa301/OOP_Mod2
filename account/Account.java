package account;

public class Account {

    private String accHolder;
    private Integer accNumber;
    private Double accAmount;

    // Constructor
    public Account(String accHolder, Integer accNumber, Double accAmount) {
        this.accHolder = accHolder;
        this.accNumber = accNumber;
        this.accAmount = accAmount;
    }

    // Getters and Setters
    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public Integer getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public Double getAccAmount() {
        return accAmount;
    }

    public void setAccAmount(Double accAmount) {
        this.accAmount = accAmount;
    }
}
