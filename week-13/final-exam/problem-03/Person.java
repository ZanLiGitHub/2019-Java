class Person extends PersonAbstract{

	public void setAge(int _age){
		this.age = _age;
	}
    public void setName(String _name){
    	this.name = _name;
    }
    public void setAddress(String _address){
    	this.address = _address;
    }

    public int getAge(){
    	return age;
    }
    public String getName(){
    	return name;
    }
    public String getAddress(){
    	return address;
    }

    public Person(){
    	this.name = "unknow";
    	this.age = -99;
    	this.address = "None";
    }

    public Person(int age, String name, String address){
    	this.age = age;
    	this.name = name;
    	this.address = address;
    }

    public void display(){
    	System.out.println("name: "+this.name+", age: "+this.age+", address: "+this.address+";");
    }
}