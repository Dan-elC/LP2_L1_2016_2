import java.util.*;

public class Team{

	private List<Member> members;

	private String name;
	private String interest;

	public Team(){
		teams = new ArrayList<Member>();
	}

	public getName(){
		return name;
	}
	public setName(String name){
		this.name = name;
	}
	public getInterest(){
		return interest;
	}
	public setInterest(String interest){
		this.interest = interest;
	}
	public addMember(Member member){
		members.add(member);
	}
}