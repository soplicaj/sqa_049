package oop;

import exceptions.NegativeTotalException;

/*
         Create a CustomerMain class - create 4 instances of the Invoice class - two of them will have
         the same series a number. Try to add the 4 instances in the array of a customer using the
         addInvoice() method.

         Call the method displayInvoices() that we added in the customer class.
    */
public class CustomerMain {
    public static void main(String[] args){
        Invoice i1 = new Invoice("RS",123, 120.50F);
        Invoice i2 = new Invoice("ST",456, 20.29F);
        Invoice i3 = new Invoice("TR",789, 500F);
        Invoice i4 = new Invoice("RS",123, 9999.99F);
        Invoice i5 = new Invoice("RS",124, -9F);

        Customer cust1 = new Customer("Jasiek");
        // so many try..catch blocks to not break execution of CustomerMain.main
        try {cust1.addInvoice(i1);} catch (NegativeTotalException e) {e.printStackTrace();}
        try {cust1.addInvoice(i2);} catch (NegativeTotalException e) {e.printStackTrace();}
        try {cust1.addInvoice(i3);} catch (NegativeTotalException e) {e.printStackTrace();}
        try {cust1.addInvoice(i4);} catch (NegativeTotalException e) {e.printStackTrace();}
        try {cust1.addInvoice(i5);} catch (NegativeTotalException e) {e.printStackTrace();}
        cust1.displayInvoices();

        Customer cust2 = new Customer("Maciek",2);
        cust2.displayInvoices();
        try {cust2.addInvoice(i5);} catch (NegativeTotalException e) {e.printStackTrace();}
        cust2.displayInvoices();
        // just to make sure execution of addInvoice is stopped after throwing exception and cust2.invoices are still null
    }
}
