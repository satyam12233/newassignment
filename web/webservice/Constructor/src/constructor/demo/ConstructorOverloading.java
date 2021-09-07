package constructor.demo;
class Student{
	int id;
	String name;
	int age;
	
	//creating constructor
	Student(int i,String n  ){
		id = i;
		name = n;
		
	}
	//creating 3 argument constructor
	
	Student(int i,String n,int a){
		id = i;
		name = n;
		age = a;
	}
	void display(){
	System.out.println(id+""+name+""+age);
}
}
public class ConstructorOverloading {
	public static void main(String arg[]) {
		Student S1 = new Student(11 , " Satyam ");
		Student S2 = new Student(123 ," Naveen ",23);
		
		S1.display();
		S2.display();
			
	}
}
