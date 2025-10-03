package main;

public class BurgerCollection {

    public static final int BURGER_PRICE = 500;
    public static final int CANCEL = 0;
    public static final int PROCESSING = 1;
    public static final int DELIVERED = 2;

    private Burger[] burgers = new Burger[0];

    private void extendburgerArray() {
        Burger[] temp = new Burger[burgers.length + 1];
        for (int i = 0; i < burgers.length; i++) {
            temp[i] = burgers[i];
        }
        burgers = temp;
    }

    public String generateOrderId() {
        if (burgers.length == 0) {
            return "B0001";
        }
        String lastOrderId = burgers[burgers.length - 1].getOrderId();
        int lastOrderIdNum = Integer.parseInt(lastOrderId.substring(1));
        return String.format("B%04d", lastOrderIdNum + 1);
    }

    public String getStatusNameById(int statusId) {
        return statusId == CANCEL ? "Cancelled"
                : statusId == PROCESSING ? "Processing"
                        : statusId == DELIVERED ? "Delivered" : "";

    }

    public String getDuplicateCustomerName(String id) {
        for (int i = 0; i < burgers.length; i++) {
            if (id.equals(burgers[i].getCustomerId())) {
                return burgers[i].getCustomerName();
            }
        }
        return "";
    }

    public boolean addCustomer(Burger customer) {
        extendburgerArray();
        burgers[burgers.length - 1] = customer;
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
        for (int i = 0; i < burgers.length; i++) {
            if (id.equals(burgers[i].getCustomerId())) {
                return true;
            }
        }
        return false;
    }

    public Burger searchOrder(String orderId) {
        for (Burger burgers : burgers) {
            if (orderId.equalsIgnoreCase(burgers.getOrderId())) {
                return burgers;
            }
        }
        return null;
    }
    
    public Burger[] toArray(){
        Burger[] temp=new Burger[burgers.length];
        for (int i=0; i<burgers.length; i++) {
            temp[i]=burgers[i];
        }
        return temp;
    }
    
    public boolean searchDuplicateCustomers(Burger[] burgerArr,String customerId){
        for(int i=0; i<burgerArr.length; i++){
            if(burgerArr[i].getCustomerId().equals(customerId)){
                return true;
            }
        }
        return false;
    }
}
