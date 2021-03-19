package ObserverDesignPatter;

public class Main{
	public static void main(String[] args){
	
	MessageSubscriberOne s1 = new MessageSubscriberOne();
	MessageSubscriberTwo s2 = new MessageSubscriberTwo();
	MessagePublisher p = new MessagePublisher();
	p.attach(s1);
	p.notify(new Message("First Message")); //s1 will receive the update
	p.attach(s2);
	p.notify(new Message("Second Message")); //s2 and s1 will receive the update	
	
	}
}