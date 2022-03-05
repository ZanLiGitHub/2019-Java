//==================================
// Foundations of Computer Science
// Student: Zan Li
// id: a1750906
// Semester: 1
// Year: 2019
// Practical Number: 05
//===================================

import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) {
		
        Student Student = new Student();
        Student[] students = new Student[6];
        students[0] = new Student("a", 85, 72, 95, 84d);
        students[1] = new Student("b", 87, 72, 93, 84d);
        students[2] = new Student("c", 88, 73, 90, 83d);
        students[3] = new Student("d", 99, 94, 56, 83d);
        students[4] = new Student("e", 89, 89, 89, 89d);
        students[5] = new Student("f", 35, 78, 83, 65d);


        printStudents(sortStudents(students));
	}

	
	private static String[] readData() {
        String[] Student = new String[20];
        try {
            System.out.println(System.in);

            FileReader fileReader = new FileReader("students.txt");
            BufferedReader buf = new BufferedReader(fileReader);

            int i = 0;
            String bufToString = "";
            String readLine = "";
            while((readLine = buf.readLine()) != null){
                Student[i] = readLine;
                i++;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return Student;
    }


    public static Student[] sortStudents(Student[] students){

        int n = students.length;
        int i, j;
        Student temp;

        for(i=0; i<n-1; i++){
            for (j=i+1; j<n; j++){
                if (students[i].getAverage() < students[i+1].getAverage()){
                    temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                }else if (students[i].getAverage() == students[i+1].getAverage()){
                    if (students[i].getPhysic() < students[i+1].getPhysic()){
                        temp = students[i];
                        students[i] = students[i+1];
                        students[i+1] = temp;
                    }else if (students[i].getPhysic() == students[i+1].getPhysic()){
                        if (students[i].getChemistry() < students[i+1].getChemistry()){
                            temp = students[i];
                            students[i] = students[i+1];
                            students[i+1] = temp;
                        }else if (students[i].getChemistry() == students[i+1].getChemistry()){
                            if (students[i].getMath() < students[i+1].getMath()){
                                temp = students[i];
                                students[i] = students[i+1];
                                students[i+1] = temp;
                            }
                        }
                    }
                }
            }
        }
        
        return students;
    }


    public static void printStudents(Student[] students) {
        System.out.print("Student  Average  Physic  Chemistry  Maths");
        System.out.print("\n");
        for (int n=0; n<students.length; n++){
            System.out.println(students[n].getName()+"        "+students[n].getAverage()+"     "+students[n].getPhysic()+"      "+students[n].getChemistry()+"         "+students[n].getMath()+" ");
        }
    }
}

