/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author carrieaubin
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList = new Student[5];
        //make up 5 students to put inside
        studentList[0] = new Student("Superman", "007");
        studentList[1] = new Student("James Bond", "700");
        studentList[2] = new Student("Wonder Woman", "100");
        studentList[3] = new Student("Batman", "001");
        studentList[4] = new Student("Joker", "002");
        //the for each loop iterates over a list of Objects
        for(Student s : studentList)
        {
            System.out.println(s.getName());
        }
    }
    
}
