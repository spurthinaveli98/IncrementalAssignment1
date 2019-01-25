package spurthi.assignment.main;

import spurthi.assignment.data.Data;
import spurthi.assignment.singleton.Singleton;

public class Main
{
    public static void main(String args[]) {
        Data obj1= new Data();
          obj1.printGlobal();
          obj1.printLocal();
        Singleton obj2=Singleton.getInstance("spurthi");
          obj2.print();
    }
}
