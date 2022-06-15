package task20thAbstract;

public class PvSindhu extends Athlete{
	String eventName ="Badminton";
	String accomplishment = "Bronze in Olympics 2021";
	
	@Override
	void event() {
		// TODO Auto-generated method stub
		System.out.println("PV Sindhu won in the event - " + eventName);
	}

	@Override
	void accomplishment() {
		// TODO Auto-generated method stub
		System.out.println("PV Sindhu medal won in the year: " + accomplishment);
	}

}
