package approve_leave;

public class Approver extends Employee implements Approval {
    private Approver nextApprover;

    public Approver(String name) {
        super(name);
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approveLeave(Employee employee, int dayOffNum) {
        if (nextApprover != null) {
            nextApprover.approveLeave(employee, dayOffNum);
        }
    }
}
