//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: your a1750906
// Semester: 1
// Year: 2019
// Practical Number: a1750906
//===================================

public class Test{
    public static void main(String[] args) {
        HanoiTower ht = new HanoiTower();
        int ndisks = 3;
        char A = 'A';
        char B = 'B';
        char C = 'C';
        ht.solve(ndisks, A, B, C);
    }    
}