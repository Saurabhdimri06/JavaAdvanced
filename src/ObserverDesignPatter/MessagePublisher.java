package ObserverDesignPatter;
import java.util.ArrayList;
import java.util.List; 

public class MessagePublisher implements Subject{

	private List<Observer> observers = new ArrayList<>();
	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void deattach(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notify(Message m) {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(m);	}
	}

}
