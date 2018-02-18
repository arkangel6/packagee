
public class akjsfafsd {
		
	public static void main(String[] args) {
	
		
		Contestant jay = new Contestant(0,0);
		Contestant john = new Contestant(0,1);
		Contestant mary = new Contestant(0,2);
		Contestant joan = new Contestant(1,0);
		Contestant ted = new Contestant(1,1);
		Contestant harry = new Contestant(1,2);
		
		
		jay.setScore(22);
		mary.setScore(180);
		john.setScore(160);
		harry.setScore(190);
		ted.setScore(100);
		joan.setScore(88);
		
	
		
		Contestant[] arr = {john, mary, jay, joan, ted, harry};
		Contestant[] arr2 = {harry, ted, joan};
		
		ContestOrganizer co = new ContestOrganizer();
		for(Contestant x : arr) {
			System.out.println(x.getScore());
		}
		
		co.sort(arr);
		
		for(Contestant x : arr) {
			System.out.println(x.getScore());
		}
		
		
}
}
