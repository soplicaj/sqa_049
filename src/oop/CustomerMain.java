package oop;
/*
         Create a CusomterMain class - create 4 instances of the Invoice class - two of the them will have
         the same series an number. Try to add the 4 instances in the array of a customer using the
         addInvoice() method.

         Call the method displayInvoices() that we added in the customer class.
    */
public class CustomerMain {
    public static void main(String[] args) {
        Invoice i1 = new Invoice("RS",123, 120.50F);
        Invoice i2 = new Invoice("ST",456, 20.29F);
        Invoice i3 = new Invoice("TR",789, 500F);
        Invoice i4 = new Invoice("RS",123, 9999.99F);

        Customer cust1 = new Customer("Jasiek");
        cust1.addInvoice(i1);
        cust1.addInvoice(i2);
        cust1.addInvoice(i3);
        cust1.addInvoice(i4);

        cust1.displayInvoices();

        Customer cust2 = new Customer("Maciek");
        cust2.displayInvoices();
    }
}
