import java.util.Scanner;

public class Test{
	public static void main(String[] args) {
		//set a array represent the different types of bikes
		Bicycle[] types = new Bicycle [4];
		types[0] = new ElectricBike("red", 2012, 6, false, "2016.3.6", "2016.3.8", "Jack","220v");
		types[1] = new MountainBike("yellow", 2016, 2, false, "2016.3.2", "2016.3.8", "Olive","good suspension","three forks");
		types[2] = new RoadBike("black", 2012, 6, true, "2016.3.6", "still in the store", "Eric","Michelin");
		types[3] = new Hibrid("bule", 2012, 6, true, "2016.3.6", "2016.3.8", "Zake","good suspension");
		boolean q = true;
		Scanner input = new Scanner(System.in);
		//set a while loop to judge the input
		while(q){
			try{
				System.out.println("Do you want to track the bike ?");
				String 	o = input.nextLine();
				if(o.equals("yes")){
					break;
				}
				else if(o.equals("no")){
					q = false;
				}
				else{
					throw new Exception("Wrong input");
				}
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		while(q){
			try{
				System.out.print("Which type of bike");
				System.out.println(" 1.ElectricBike 2.RoadBike 3.RoadBike 4.Hibrid");
				String p = input.next();
				int l = Integer.parseInt(p);
				//depend on the different input to select the different bike and out put
				if (p.equals("1") ) {
					types[l-1].display();
					break;
				}
				else if(p.equals("2")){
					types[l-1].display();
					break;
				}
				else if(p.equals("3")){
					types[l-1].display();
					break;
				}
				else if(p.equals("4")){
					types[l-1].display();
					break;
				}
				else{
					throw new Exception("Select correct bike");
				}
			}
			catch(Exception e){		
				System.out.println(e.getMessage()+"!   entering correct information!");
			}
		}
	}
}