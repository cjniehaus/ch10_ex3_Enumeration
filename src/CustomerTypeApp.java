public class CustomerTypeApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Customer Type Test application\n");
        
        CustomerType ct = CustomerType.RETAIL;
        
        double discountPercent = getDiscountPercent(ct);
        System.out.println(discountPercent);
        // get and display the discount percent for a customer type
       
        System.out.println("Discount for: " + ct.toString() + " is " 
        + discountPercent);
        // display the value of the toString method of a customer type
    }
    
    public static double getDiscountPercent(CustomerType ct) {
    	double discount = 0.0;
    	if (ct == CustomerType.RETAIL) {
    		discount = 0.1;
    	} else if (ct == CustomerType.TRADE) {
    		discount = 0.3;
    	} else if (ct == CustomerType.COLLEGE) {
    		discount = 0.2;
    	}
    	return discount;
    }
    // a method that accepts a CustomerType enumeration
}
