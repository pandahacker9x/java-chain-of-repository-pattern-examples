package approve_leave;

public class ProjectManager extends Approver  {

    private static final int MAX_DAY_OFF_CAN_APPROVE = 20;

    public ProjectManager(String name) {
        super(name);
    }

    @Override
    public void approveLeave(Employee employee, int dayOffNum) {
        if (dayOffNum <= MAX_DAY_OFF_CAN_APPROVE) {
            System.out.println("Project manager approved " + dayOffNum + " days off for " + employee.getName());
        } else {
            super.approveLeave(employee, dayOffNum);
        }
    }
}
