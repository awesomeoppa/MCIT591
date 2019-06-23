package git_prac;

public class person {
	String name;
	int age;
	
	person (String n,int a){
		name = n;
		age = a;
	
	}
	
	public static void main (String[] args) {
		person p = new person("Peter",23);
		System.out.println(p.name);
	}

}
