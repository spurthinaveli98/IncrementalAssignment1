package spurthi.assignment.main;

import spurthi.assignment.data.Data;
import spurthi.assignment.singleton.Singleton;

public class Main {
    public static void main(String args[]) {
        Data data= new Data();
          data.printGlobal();
          data.printLocal();
        Singleton singleton=Singleton.getInstance("spurthi");
          singleton.print();
    }
}

/*
-:Output:-
0
null
spurthi
 */