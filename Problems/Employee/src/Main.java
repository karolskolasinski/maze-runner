class Employee {

    String name;
    int salary;
    String address;
    static final String UNKNOWN = "unknown";

    public Employee() {
        this.name = UNKNOWN;
        this.address = UNKNOWN;
        this.salary = 0;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = UNKNOWN;
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
