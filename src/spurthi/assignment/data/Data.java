package spurthi.assignment.data;

public class Data {
    //Global variables
    int global1;
    char global2;

    /*
        Method for printing global variables.
     */
    public void printGlobal()
    {
        System.out.println(global1);// prints 0
        System.out.println(global2);//prints null
    }

    /*
      Method for printing local variables.
      Compile time error, cannot print local variables with out initializing.
    */
    public void printLocal()
    {
        //local variables
        int local1;
        char local2;
        //System.out.println(local1);
        //System.out.println(local2);
    }


}