package remijan.live360.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.StringJoiner;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Invoice {
    private int id;
    private BigDecimal billingAmount;
    private LocalDate billingDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getBillingAmount() {
        return billingAmount;
    }
    public void setBillingAmount(BigDecimal billingAmount) {
        this.billingAmount = billingAmount;
    }

    public LocalDate getBillingDate() {
        return billingDate;
    }
    public void setBillingDate(LocalDate date) {
        this.billingDate = date;
    }

    @Override
    public String toString() {
        return new StringJoiner(",", "\n[INVOICE ", "]")
            .add(String.format("ID=%d", id))
            .add(String.format("BILLING_AMOUNT=%.2f", billingAmount.doubleValue()))
            .add(String.format("BILLING_DATE=%s", billingDate))
            .toString();
    }
}
