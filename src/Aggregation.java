public class Aggregation {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Bilal Khan", new Address("Bhopal", "MP", "India"));
        employee1.display();
        Address address2 = new Address("Mumbai", "Maharashtra", "India");
        Employee employee2 = new Employee(102, "Balwant Birajdar", address2);
        employee2.display();
    }
}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Employee {
    int id;
    String fullName;
    Address address;

    public Employee(int id, String fullName, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public void display() {
        System.out.println(this.id + " " + this.fullName + " " + this.address.city + " " + " " + address.state + " " + address.country);
    }
}
