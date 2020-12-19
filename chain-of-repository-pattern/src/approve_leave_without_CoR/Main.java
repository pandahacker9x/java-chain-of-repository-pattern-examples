package approve_leave_without_CoR;

import approve_leave.Employee;

public class Main {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2("Employee2");
        employee2.requestLeave(6);
        employee2.requestLeave(15);
        employee2.requestLeave(29);
        employee2.requestLeave(40);
    }
}
