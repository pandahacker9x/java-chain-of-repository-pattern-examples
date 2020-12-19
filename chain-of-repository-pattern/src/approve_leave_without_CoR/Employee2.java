package approve_leave_without_CoR;

import approve_leave.Approver;

public class Employee2 {
    private String name;

    public Employee2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void requestLeave(int dayOffNum) {
        if (dayOffNum <= 10) {
            System.out.println("Team leader approved " + dayOffNum + " days off for " + getName());
        } else if (dayOffNum <= 20) {
            System.out.println("Project manager approved " + dayOffNum + " days off for " + getName());
        } else if (dayOffNum <= 30) {
            System.out.println("HR approved " + dayOffNum + " days off for " + getName());
        } else {
            System.out.println("Leave request suspended. Please, contact HR");
        }
    }
}

