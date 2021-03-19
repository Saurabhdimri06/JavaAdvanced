package ChainOfResponsibility;

public class ProjectManager implements LeaveRequestHandler{
private LeaveRequestHandler nextHandler;
	
	public void nextHandler(LeaveRequestHandler next) {
		// TODO Auto-generated method stub
		this.nextHandler = next;
	}

	public void handleRequest(LeaveRequest lr) {
		// TODO Auto-generated method stub
		int days = lr.getDays();
		if(days>3 && days <= 5)	System.out.println("To be Approved by Project Manager");
		else nextHandler.handleRequest(lr);
	}

}
