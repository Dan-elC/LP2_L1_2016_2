

public class Principal{
	public static void main(String[] args){
		EQuipu objEquipu = new EQuipu();
		Date date = new Date();

		//Create Teams
		Team team1 = new Team();		

		Student member1 = new Student();
		

		String report = objEquipu.consultMembersEquipu(2);

		System.out.println(report);
	}
}