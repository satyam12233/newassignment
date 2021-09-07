package constructor.demo;
class Bike{
	String colour;
	String company;
	Bike(String col, String com){
		
		colour= col;
		company = com;
      
	}
	String getBike(){
		return "red - "  +  "royalEnfield";
	}
}
public class ParametarizedConstructor {
	public static void main(String arg[]) {
		
		Bike bike = new Bike("colour","company");
		System.out.println("Bike Is Created = " +bike.getBike());
	}

}
