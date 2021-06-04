package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};

        // 1. a new instance of a students ArrayList storing strings
        private final ArrayList<String> students = new ArrayList<String>();
        // 2. a new instance of a math grades ArrayList storing integers
        private final ArrayList<Integer> mathGrades = new ArrayList<Integer>();
        // 3. a new instance of a science grades ArrayList storing integers
        private final ArrayList<Integer> scienceGrades = new ArrayList<Integer>();
        // 4. a new instance of a English grades ArrayList storing integers
        private final ArrayList<Integer> englishGrades = new ArrayList<Integer>();

    public MSGrades() {

        // add two students to the students ArrayList
        students.add("Baylor");
        students.add("Jenna");
        // add two corresponding values for the two students to the math grades ArrayList
        mathGrades.add(95);
        mathGrades.add(85);
        // add two corresponding values for the two students to the science grades ArrayList
        scienceGrades.add(75);
        scienceGrades.add(98);
        // add two corresponding values for the two students to the english grades ArrayList
        englishGrades.add(89);
        englishGrades.add(82);
    }

    public void printStudents(){
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void printStudentGrades(int studentIndex){
        System.out.println(students.get(studentIndex));
        System.out.println("Math: " + mathGrades.get(studentIndex));
        System.out.println("Science: " + scienceGrades.get(studentIndex));
        System.out.println("English: " + englishGrades.get(studentIndex));
    }


    public static void main(String[] args) {
        MSGrades msGrades = new MSGrades();
        System.out.println();
        
        System.out.println("Middle School Roster");
        System.out.println("====================");

        msGrades.printStudents();
        System.out.println();

        for(int i = 0; i < msGrades.teachers.length; i++) {
            System.out.println("Teacher " + msGrades.teachers[i]);
            System.out.println();
        }

        System.out.println("\nStudent Grades:\n");

        for (int j = 0; j < msGrades.students.size(); j++) {
            msGrades.printStudentGrades(j);
            System.out.println();
        }
        // Use a for loop to loop thru students ArrayList on the class instance
        // inside the loop
            // pass the counter var as an index to the printStudentGrades method
            // to print each students info
            // Print a new line if you want it to look presentable

    }
}
