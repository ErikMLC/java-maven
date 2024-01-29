package ec.edu.epn.saew;

import org.joda.time.DateTime;

public class HelloWorld {
    
    // ejcutamos el mismo comando en terminal C:\Users\LabP4E001\Documents\NetBeansProjects\java-maven>C:\apache-maven-3.9.6\bin\mvn package
    public static void main(String[] args) {
        System.out.println("Hello World!");  // This prints the string "Hello World!"
        DateTime dateTime  = new DateTime();
        System.out.println(" DateTime: "+ dateTime.plusDays(3).toLocalDate());
    }
}
