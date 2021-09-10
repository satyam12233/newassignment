package sept8.demo;
class Student1{
	int id;
	String name;
	int age ;
	
	// creating constructor
	Student1(int i , String n) {
	 id = i;
	 name = n;
	}	
	 // creating 3 argument constructor
	 Student1(int i , String n , int a){
		 id = i;
		 name = n;
		 age = a;
	 }
	 void display() {
	  System.out.println(id+""+name+""+age);
}
}
public class ConstructorOverloading {
public static void main(String arg[]) {
	
	Student1 s1 = new Student1(11, " Satyam");
	Student1 s2 = new Student1(123, " Naveen ", 23);
	s1.display();
	s2.display();
}
}
