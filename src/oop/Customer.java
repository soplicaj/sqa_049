package oop;

import java.util.Arrays;

//        Create a class Customer with the following attributes:
//        - name - String
//        - customer_id - int
//        - array of size 10 of Invoices
//
//        Add a method in Customer called addInvoice() that will receive a parameter of the Invoice type
//        and will add that invoice in the array ONLY IF the invoice is not already present. If the
//        invoice is already present - display an error message
//
//
//        Add another method - displayInvoices() - that will display all the invoices of the Customer.
public class Customer {
    String name;
    int customer_id;
    private Invoice[] invoices;

    public Customer(String name) {
        this.name=name;
    }

    public Customer(String name, int customer_id) {
        this.name=name;
        this.customer_id=customer_id;
    }

    public void addInvoice(Invoice invoice){
        if (invoices==null){ invoices = new Invoice[2]; }
        if (Arrays.asList(invoices).contains(invoice)) {
            System.out.println("invoice " + invoice.series +":" + invoice.number + " already on " + name + " customer's list!");
        } else {
            for (int i=0; i<invoices.length; i++) {
                if (invoices[i]==null) {
                    invoices[i]=invoice;
                    System.out.println("invoice " + invoice.series +":" + invoice.number + " added to " + name + " customer's list.");
                    break;
                } else if (i==invoices.length-1) {
                    System.out.println("invoice " + invoice.series +":" + invoice.number + " NOT added to " + name + " customer's list.");
                    System.out.println("customer " + name + " has reached a maximum of " + invoices.length + " invoices");
                }
            }
        }
    }

    public void displayInvoices() {
        if (invoices==null) {
            System.out.println(name + " customer does not have any invoices assigned!");
        } else {
            System.out.println(name + " customer's invoices:");
            for (Invoice i : invoices) {
                if (i != null) {
                    System.out.println(i.toString());
                }
            }
        }
    }
}
