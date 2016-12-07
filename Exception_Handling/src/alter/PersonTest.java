package alter;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Person p1 = new Person(30);
		Person p2 = new Person(80);
		Person p3 = new Person(160);
		
		}catch(OutOfRangeException e){
			System.out.println(e.getMessage());
			
		}

	}

}
