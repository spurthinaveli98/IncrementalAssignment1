package spurthi.assignment.data;

public class Data {
    //Global variables
    int collegeId;
    char collegeName;
    /*
        Method for printing global variables.
     */
    public void printGlobal() {
        System.out.println(collegeId);// prints 0
        System.out.println(collegeName);//prints null
    }
    /*
      Method for printing local variables.
      Compile time error, cannot print local variables with out initializing.
    */
    public void printLocal() {
        //local variables
        int studentId;
        char studentName;
        System.out.println(studentId);
        System.out.println(studentName);
    }
}