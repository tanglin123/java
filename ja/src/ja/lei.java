package ja;

public class lei {
	int age;
	String name;
	String gender;
	private float height;
	
	public lei(String _name,int _age,String _gender,float _height){
		age = _age;
		name = _name;
		gender= _gender;
		height= _height;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getgender(){
		return gender;
	}
	public float getheight(){
	    return height;
	}
	
	public boolean canMarry(){
		if(age>=22&&gender=="��"){
			return true;
		}
		if(gender=="Ů"&&age>=20){
			return true;
	
		}
		return false;

	}
	
	public void printInfo(){
		System.out.println("Age:"+getAge());
		System.out.println("name:"+getName());
		System.out.println("gender:"+getgender());
		System.out.println("height:"+getheight());
		if(canMarry()){
			System.out.println("I can marry!");
		}
		else{
			System.out.println("I cannot marry!");
		}
	}
}
		
