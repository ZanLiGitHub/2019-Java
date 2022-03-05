//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 04
//===================================

public class HanoiTower {
    int n;

    HanoiTower(){
        n = 3;
    }

    HanoiTower(int dTmp){
    	dTmp = n;
    }
    
    /**
    * moves the ndisk from one pole to other pole
    *
    * @param int n
    * @param char a 
    * @param char c
    */
    public void move (int n, char a, char c){
        System.out.println("Move the disk"+n+" from pole"+a+" to "+c);
    }
    
    /**
    * Solves the problem by using recursion, n is the number of disk
    * This method can check if the number is ligal
    * 
    * @param int n
    * @param char a
    * @param char b
    * @param char c
    */
    public void solve(int n, char a, char b, char c) {
        if(n <= 0){
            System.out.println("number error");
            return;
        }
        else if (n == 1){
            move (n, a, c);
        }else{
            solve(n-1,a,c,b);
            move(n,a,c);
            solve(n-1,b,a,c);  
        } 
    }
}

