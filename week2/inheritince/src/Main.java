public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee();
    Customer customer = new Customer();
    employee.name="Oğuzhan";
    employee.lastName="Yıldırım";
    customer.name="Ali";
    customer.lastName="Yıldırım";

    EmployeeManager employeeManager = new EmployeeManager();
    CustomerManager customerManager = new CustomerManager();
    employeeManager.BestEmployee();
    customerManager.List();

    }
}
