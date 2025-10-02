package main;

public class CustomerCollection {

    public static final int BURGER_PRICE = 500;
    public static final int CANCEL = 0;
    public static final int PROCESSING = 1;
    public static final int DELIVERED = 2;

    private Customer[] customers = new Customer[]{
        new Customer("B0001", "0712345678", "John Smith", 5, 1),
        new Customer("B0002", "0765423212", "Sarah Johnson", 3, 1),
        new Customer("B0003", "0778723432", "Mike Wilson", 10, 1),
        new Customer("B0004", "0717232145", "Emily Davis", 2, 1),
        new Customer("B0005", "0712345678", "John Smith", 25, 1)
    };

    private void extendCustomerArray() {
        Customer[] temp = new Customer[customers.length + 1];
        for (int i = 0; i < customers.length; i++) {
            temp[i] = customers[i];
        }
        customers = temp;
    }

    public String generateOrderId() {
        if (customers.length == 0) {
            return "B0001";
        }
        String lastOrderId = customers[customers.length - 1].getOrderId();
        int lastOrderIdNum = Integer.parseInt(lastOrderId.substring(1));
        return String.format("B%04d", lastOrderIdNum + 1);
    }

    public String getStatusNameById(int statusId) {
        return statusId == CANCEL ? "Cancelled"
                : statusId == PROCESSING ? "Processing"
                        : statusId == DELIVERED ? "Delivered" : "";

    }

    public String getDuplicateCustomerName(String id) {
        for (int i = 0; i < customers.length; i++) {
            if (id.equals(customers[i].getCustomerId())) {
                return customers[i].getCustomerName();
            }
        }
        return "";
    }

    public boolean addCustomer(Customer customer) {
        extendCustomerArray();
        customers[customers.length - 1] = customer;
        return true;
    }

    public boolean isValidPhoneNumber(String id) {
        if (id.length() != 10) {
            return false;
        }
        if (id.charAt(0) != '0') {
            return false;
        }
        for (int i = 0; i < id.length(); i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public boolean isDuplicateCustomer(String id) {
        for (int i = 0; i < customers.length; i++) {
            if (id.equals(customers[i].getCustomerId())) {
                return true;
            }
        }
        return false;
    }

    public Customer searchOrder(String orderId) {
        for (Customer customer : customers) {
            if (orderId.equalsIgnoreCase(customer.getOrderId())) {
                return customer;
            }
        }
        return null;
    }
    
    public Customer[] toArray(){
        Customer[] temp=new Customer[customers.length];
        for (int i=0; i<customers.length; i++) {
            temp[i]=customers[i];
        }
        return temp;
    }
    
    public boolean searchDuplicateCustomers(Customer[] customerArr,String customerId){
        for(int i=0; i<customerArr.length; i++){
            if(customerArr[i].getCustomerId().equals(customerId)){
                return true;
            }
        }
        return false;
    }
}
