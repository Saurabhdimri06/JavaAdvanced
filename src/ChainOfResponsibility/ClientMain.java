package ChainOfResponsibility;

public class ClientMain {
	public static void main(String args[]) {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployee("Saurabh");
		leaveRequest.setDays(6);
		
		LeaveRequestHandler s = new Supervisor();
		LeaveRequestHandler pm = new ProjectManager();
		LeaveRequestHandler hr = new HR();
		
		s.nextHandler(pm);
		pm.nextHandler(hr);
		
		s.handleRequest(leaveRequest);
	}
}
