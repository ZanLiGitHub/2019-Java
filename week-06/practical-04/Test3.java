//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 04
//===================================

public class Test3{
	public static void main (String [] args){
		ShakingPartyConstrainted spc = new ShakingPartyConstrainted();
		int nCouples = 20;
		int nPeople = nCouples * 2;
		int count1 = spc.countHandShakes1(nPeople);
		int count2 = spc.countHandShakes2(nCouples);
		int count = spc.countHandShakes(count1, count2);
		System.out.println("There are "+nCouples+" couples, and they need to shakehands for "+count+" times.");
	}
}