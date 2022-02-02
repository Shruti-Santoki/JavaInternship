import java.util.ArrayList;

public class student{ 
     
     public static void main (String[] args){

          Person p1 = new Person("Anuj", 25, "anuj01@gmail.com", 73);
          Person p2 = new Person("Binod", 19, "binod02@gmail.com", 87);
          Person p3 = new Person("Chandu", 34, "chandu03@gmail.com", 66);
          Person p4 = new Person("Dholu", 28, "dholu04@gmail.com", 55);
          Person p5 = new Person("Ezz", 15, "ezz05@gmail.com", 92);

         ArrayList<Person> names = new ArrayList<Person>();

             names.add(p1);
             names.add(p2);
             names.add(p3);
             names.add(p4);
             names.add(p5);

         System.out.println(names.get(0).name);
         System.out.println(names.get(0).age);
         System.out.println(names.get(0).email);
         System.out.println(names.get(0).marks);
         System.out.println();
         System.out.println(names.get(1).name);
         System.out.println(names.get(1).age);
         System.out.println(names.get(1).email);
         System.out.println(names.get(1).marks);
         System.out.println();
         System.out.println(names.get(2).name);
         System.out.println(names.get(2).age);
         System.out.println(names.get(2).email);
         System.out.println(names.get(2).marks);
         System.out.println();
         System.out.println(names.get(3).name);
         System.out.println(names.get(3).age);
         System.out.println(names.get(3).email);
         System.out.println(names.get(3).marks);
         System.out.println();
         System.out.println(names.get(4).name);
         System.out.println(names.get(4).age);
         System.out.println(names.get(4).email);
         System.out.println(names.get(4).marks);

     }
}

class Person {
     
     String name; 
     int age;
     String email;
     int marks;

     Person(String name, int age, String email, int marks) {

         this.name = name;
         this.age = age;
         this.email = email;
         this.marks = marks;

     }
}