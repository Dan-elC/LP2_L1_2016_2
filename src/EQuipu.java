import java.util.*;

public class EQuipu{
	private List<Team> teams;

	public EQuipu(){
		teams = new ArrayList<Team>();
	}
	public List<Team> getTeams(){
		return teams;
	}
	public void setTeams(List<Team> teams){
		this.teams = teams;
	}
	public String consultMembersEquipu(int index){

		String chain = "";

		//chain = teams.get(index).get(1).getName();
		System.out.println(teams.get(index));

		/*
		for(Member mem : teams.get(index)){
			chain = mem.getName();
		}
		*/
		return chain;
	}
}