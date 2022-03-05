//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: your a1750906
// Semester: 1
// Year: 2019
// Practical Number: a1750906
//===================================

public class Test2{
	public static void main(String [] args){
		ShakingParty sp = new ShakingParty();
		int nPeople = 6;
		int count = sp.countHandShakes(nPeople);

		System.out.println("There are "+nPeople+" peoples, and they need to shakehands for "+count+" times.");
	}
}