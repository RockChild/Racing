package Racing;

import java.util.ArrayList;

public class Race {
public static void main(String[] args){
	System.out.println("Hello, world!");
	Racer bestRacer=new Racer();
	bestRacer.setName("Paul");
	bestRacer.setSurname("Schumacher");
	bestRacer.setNumber(1);
	bestRacer.setBirthday(1989, 5, 15);
	Team team1 =new Team();
	team1.setName("Winners");
	team1.addMember(bestRacer);
	ArrayList<Team> teams=new ArrayList<Team>();
	teams.add(team1);
	//teams.add(A);
}
}
