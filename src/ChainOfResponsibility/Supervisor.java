package ChainOfResponsibility;

public class Supervisor implements LeaveRequestHandler{

	private LeaveRequestHandler nextHandler;
	public void nextHandler(LeaveRequestHandler next) {
		// TODO Auto-generated method stub
		this.nextHandler = next;
	}

	public void handleRequest(LeaveRequest lr) {
		// TODO Auto-generated method stub
		int days = lr.getDays();
		if(days>=1 && days < 3)	System.out.println("To be Approved by Supervisor");
		else nextHandler.handleRequest(lr);
	}

}
