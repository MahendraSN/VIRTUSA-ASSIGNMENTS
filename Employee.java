class Employee {

    int id;
    String name;
    static String companyName;

    // Static block to initialize company name
    static {
        companyName = " Virtusa ";
    }

    // Constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Static method to change company name
    static void changeCompany(String newCompany) {
        companyName = newCompany;
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Company: " + companyName);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Rahul");
        Employee e2 = new Employee(2, "Ankit");

        e1.display();
        e2.display();

        // Change company name
        Employee.changeCompany("XYZ Pvt Ltd");

        System.out.println("After changing company name:\n");

        e1.display();
        e2.display();
    }
}
