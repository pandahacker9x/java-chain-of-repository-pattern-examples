package approve_leave;

public class HR extends Approver  {
    private static final int MAX_DAY_OFF_CAN_APPROVE = 30;

    public HR(String name) {
        super(name);
    }

    @Override
    public void approveLeave(Employee employee, int dayOffNum) {
        if (dayOffNum <= MAX_DAY_OFF_CAN_APPROVE) {
            System.out.println("HR approved " + dayOffNum + " days off for " + employee.getName());
        } else {
            System.out.println("Leave request suspended. Please, contact HR");
        }
    }
}
