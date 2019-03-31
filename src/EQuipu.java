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
}