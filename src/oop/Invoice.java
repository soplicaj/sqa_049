package oop;

import java.util.Objects;

//       Create an Invoice class with the following attributes:
//        - series - string: RR, RD, RT, XR
//        - number - int
//        - total  - float
//
//        Override the toString() method in order to display the following format of the Invoice:
//        {SERIES}:{NUMBER} - TOTAL TO PAY: {TOTAL}
//
//        Override the equals() method to establish that two invoices are equal if they have the same
//        series and number.
public class Invoice {
    String series;
    int number;
    float total;

    public Invoice(String series, int number, float total) {
        this.series = series;
        this.number = number;
        this.total = total;
    }

    @Override
    public String toString() {
        return series + ':' + number + " - TOTAL TO PAY: " + total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return number == invoice.number && Objects.equals(series, invoice.series);
    }

}
