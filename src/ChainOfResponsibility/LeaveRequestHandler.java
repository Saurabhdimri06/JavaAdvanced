package ChainOfResponsibility;

public interface LeaveRequestHandler {
	public void nextHandler(LeaveRequestHandler next);
	public void handleRequest(LeaveRequest lr); 
}
