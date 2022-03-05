//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Exam Number: 02
//===================================
public class DebuggingDemo {

    /**
    * Bug: The printed number beyonds the int array 
    */
    public void bugMethod() {
         int num[] = {1, 2, 3, 4};
         System.out.println(num[2]);
     }

    /**
    * Bug: int method can only return int varibles
    */
    public int bugMethod2() {
            int ans = 0;
            System.out.println("This method had a bug!");
            return ans;
     }
}