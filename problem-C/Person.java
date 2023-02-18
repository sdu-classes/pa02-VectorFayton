public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person[name = %s, address = %s]", this.name, this.address);
    }
}
