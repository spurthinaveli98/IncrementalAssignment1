package spurthi.assignment.singleton;

public class Singleton {
       String name;
       /*
          Static method that takes String as parameter and initialize the member variable
          and then return object of that class
       */
       public static Singleton getInstance(String name) {
           Singleton singleton=new Singleton();
           singleton.name=name;
           return singleton;
       }

      /*
        Non static method to print the String.
       */
       public void print()
      {
           System.out.println(name);
      }
}
