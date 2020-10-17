package basics;

public class ObjectEqulaity {
    public static void main(String[] args) {
        Customer c1 = new Customer(12, "John");
        Customer c2 = new Customer(13, "John");
        Customer c3 = new Customer(12, "John");
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
    }
}

class Customer {
    private int customerId;
    private String customerName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + customerId;
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        return result;
        // either use the above code or below code
        // retutn customerId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (customerId != other.customerId)
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        return true;

        // either use the above code or below code
        // Customer cust = (Customer) other;
        // if(this.hashCode() == cust.hashCode()) {
        // return this.customerName.equals(cust.customerName);
        // }
        // return false;
    }

}
