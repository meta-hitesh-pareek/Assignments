package Assignment5;

abstract class Animal {
	
	Animal(String name,int ageInYears,int weight)
	{
		this.name=name;
		this.ageInYears=ageInYears;
		this.weight=weight;
		id++;
		
	}
	abstract public String  getSound();
	String name;
	static int id;
	int ageInYears,weight;
	String type;

}
