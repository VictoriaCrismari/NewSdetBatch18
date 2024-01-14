package class24;

import java.util.Map;
import java.util.TreeMap;

public class Person {
        private String name;
        private String lastName;
        private int age;
        private double salary;
        Person(String name,String lastName,int age, double salary){
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            this.salary=salary;
        }
        void printInfo(){
            System.out.println(name+" "+lastName+" "+age+" "+salary);
        }
    }
    class PersonTester{
        public static void main(String[] args) {
            Map<Integer, Person> maps=new TreeMap<>();
            maps.put(1,new Person("Victoria","C",29,89000));
            maps.put(2,new Person("Maria","V",28,88000));
            maps.put(3,new Person("Karimi","K",26,88500));
            maps.forEach((k,v)->{ System.out.println("id: "+k);
                v.printInfo();
            });
        }
    }
