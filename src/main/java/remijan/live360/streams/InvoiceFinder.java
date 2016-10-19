package remijan.live360.streams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class InvoiceFinder {
    private Map<Integer, Invoice> database;

    public InvoiceFinder() {
        database = new HashMap<>();
        {
            Invoice i = new Invoice();
            i.setId(1);
            i.setBillingAmount(new BigDecimal("783.45"));
            i.setBillingDate(LocalDate.of(2016, 01, 14));
            database.put(i.getId(), i);
        }
        InvoiceGenerator.fill(database);
    }

    public Invoice findById(Integer id) {
        return database.get(id);
    }
}

class InvoiceGenerator {

    public static void fill(Map<Integer, Invoice> database) {
        {
            Invoice i = new Invoice();
            i.setId(2);
            i.setBillingAmount(new BigDecimal("584.35"));
            i.setBillingDate(LocalDate.of(2016, 2, 28));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(3);
            i.setBillingAmount(new BigDecimal("25.23"));
            i.setBillingDate(LocalDate.of(2016, 3, 30));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(4);
            i.setBillingAmount(new BigDecimal("452345.06"));
            i.setBillingDate(LocalDate.of(2016, 4, 8));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(5);
            i.setBillingAmount(new BigDecimal("9.88"));
            i.setBillingDate(LocalDate.of(2016, 5, 22));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(6);
            i.setBillingAmount(new BigDecimal("125.55"));
            i.setBillingDate(LocalDate.of(2016, 6, 19));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(7);
            i.setBillingAmount(new BigDecimal("236.01"));
            i.setBillingDate(LocalDate.of(2016, 7, 2));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(8);
            i.setBillingAmount(new BigDecimal("25.00"));
            i.setBillingDate(LocalDate.of(2016, 8, 11));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(9);
            i.setBillingAmount(new BigDecimal("39.30"));
            i.setBillingDate(LocalDate.of(2016, 9, 30));
            database.put(i.getId(), i);
        }
        {
            Invoice i = new Invoice();
            i.setId(10);
            i.setBillingAmount(new BigDecimal("42.08"));
            i.setBillingDate(LocalDate.of(2016, 10, 8));
            database.put(i.getId(), i);
        }
    }
}
