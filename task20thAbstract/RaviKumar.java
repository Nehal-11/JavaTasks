package task20thAbstract;

public class RaviKumar extends Athlete {
	String eventName = "Wrestling";
	String accomplishment="Silver in Olympics 2021";
	
	@Override
	void event() {
		// TODO Auto-generated method stub
		System.out.println("Ravi Kumar won in the event - " + eventName);
	}

	@Override
	void accomplishment() {
		// TODO Auto-generated method stub
		System.out.println("Ravi Kumar won medal in the year: " + accomplishment);
	}

}
