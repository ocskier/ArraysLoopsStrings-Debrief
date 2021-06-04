package com.example.MSGrades;
// import the java util ArrayList class module
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    
    // Create 4 ArrayLists below all private constant properties (final)
        // 1. a new instance of a students ArrayList storing strings
        ArrayList<String> students = new ArrayList<String>();
        // 2. a new instance of a math grades ArrayList storing integers
        ArrayList<String> mathGrades = new ArrayList<String>();
        // 3. a new instance of a science grades ArrayList storing integers
        ArrayList<String> scienceGrades = new ArrayList<String>();
        // 4. a new instance of a English grades ArrayList storing integers
        ArrayList<String> englishGrades = new ArrayList<String>();

    public MSGrades() {
        // Add some students and their grades to the ArrayLists

        // add two students to the students ArrayList
        students.add("Baylor");
        students.add("Jenna");
        // add two corresponding values for the two students to the math grades ArrayList
        mathGrades.add("95");
        mathGrades.add("85");
        // add two corresponding values for the two students to the science grades ArrayList
        scienceGrades.add("75");
        scienceGrades.add("98");
        // add two corresponding values for the two students to the english grades ArrayList
        englishGrades.add("89");
        englishGrades.add("82");
    }

    public void printStudents(){
        // loop thru the students ArrayList with a For Each loop
            // print each students name on a new line as output
        for (String student : students) {
            System.out.println("Current students: " + student);
        }
    }

    // Make a method that prints an individual students grades
    // It will be public, not have a return value,
    // and have one int type parameter that is a students index

    // Inside the method:
        // Print the students name by using the index variable to index the students array
        // Print a concatenated string of say "Math: " + and the corresponding grade
            // from that ArrayList of grades by index
        // Do this for the next two subjects
        // Total of four output statements

    public static void main(String[] args) {

        // create a new instance of MSGrades class and store in a variable
            // (anything like msGrade8)
        // look up how to print an empty new line
            // for readability
        
        System.out.println("Middle School Roster");
        System.out.println("====================");

        // invoke or run the printStudents method on our class instance

        // Print another empty line if desired for readability

        // Use a for loop to loop thru the given teachers array on the class instance
        // inside the loop
            // create a new variable that stores the result of "Teacher: " +
                // teachers name from the array using the counter variable
            // Print the new variable as output

        System.out.println("\nStudent Grades:\n");

        // Use a for loop to loop thru students ArrayList on the class instance
        // inside the loop
            // pass the counter var as an index to the printStudentGrades method
            // to print each students info
            // Print a new line if you want it to look presentable

    }
}
