package approve_leave;

public class Main {
    public static void main(String[] args) {
        Approver approverChain = new TeamLeader("TeamLeader");
        ProjectManager projectManager = new ProjectManager("TeamLeader");
        HR hr = new HR("TeamLeader");

        approverChain.setNextApprover(projectManager);
        projectManager.setNextApprover(hr);

        Employee employee = new Employee("Trung");
        employee.requestLeave(approverChain, 5);
        employee.requestLeave(approverChain, 15);
        employee.requestLeave(approverChain, 23);
        employee.requestLeave(approverChain, 50);
    }
}
