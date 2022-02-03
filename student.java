import java.util.*;
import java.util.ArrayList;

public class student{ 
     
     public static void main (String[] args){

         ArrayList<Person> names = new ArrayList<Person>();

             names.add(new Person("Chandu", 25, "chandu01@gmail.com", 73));
             names.add(new Person("Binod", 19, "binod02@gmail.com", 87));
             names.add(new Person("Ezz", 34, "ezz03@gmail.com", 66));
             names.add(new Person("Dholu", 28, "dholu04@gmail.com", 55));
             names.add(new Person("Anuj", 15, "anuj05@gmail.com", 92));

             System.out.println("Unsorted");
         for(Person p : names){
             System.out.println(p.getname() + "" + p.getage() + "" + p.getemail() + "" + p.getmarks());
         }

         Collections.sort(names, new Sortbyname());
         System.out.println("\nSorted by name");
         for(Person p : names){
            System.out.println(p.getname() + "" + p.getage() + "" + p.getemail() + "" + p.getmarks());
         }

        Collections.sort(names, new Sortbyage());
        System.out.println("\nSorted by age");
         for(Person p : names){
            System.out.println(p.getname() + "" + p.getage() + "" + p.getemail() + "" + p.getmarks());
         }
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

     public String getname(){ return name;}
     public int getage(){ return age;}
     public String getemail(){ return email;}
     public int getmarks(){ return marks;}
}

class Sortbyname implements Comparator<Person> {

    public int compare(Person a, Person b){

        return a.name.compareTo(b.name);
    }
}

class Sortbyage implements Comparator<Person> {

    public int compare(Person a, Person b) {

        return Integer.compare(a.age, b.age);
    }
}