package task20thAbstract;

public class NeerajChopra extends Athlete {
String eventName = "Javalin";
String accomplishment = "Gold in Olympics 2021";

	@Override
	void event() {
		
		System.out.println("Neeraj won in the event - " + eventName);
	}

	@Override
	void accomplishment() {
		
		System.out.println("Neeraj won  medal in the year: " + accomplishment);
	}

}
