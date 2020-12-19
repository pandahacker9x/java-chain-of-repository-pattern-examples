package approve_leave;

public class TeamLeader extends Approver  {
    private static final int MAX_DAY_OFF_CAN_APPROVE = 10;

    public TeamLeader(String name) {
        super(name);
    }

    @Override
    public void approveLeave(Employee employee, int dayOffNum) {
        if (dayOffNum <= MAX_DAY_OFF_CAN_APPROVE) {
            System.out.println("Team leader approved " + dayOffNum + " days off for " + employee.getName());
        } else {
            super.approveLeave(employee, dayOffNum);
        }
    }
}
