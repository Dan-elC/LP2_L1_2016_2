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

		for(Member mem : teams.get(index).getMembers() ){
			if( mem instanceof MemberPUCP){

				chain = chain + "\n" + ((MemberPUCP)mem).consultData();
			}
			
		}
		
		return chain;
	}
}