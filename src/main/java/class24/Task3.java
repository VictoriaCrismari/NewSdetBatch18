package class24;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,Integer> employee=new HashMap<>();
        employee.put("Victoria",98000);
        employee.put("Karimi",89000);
        employee.put("Maria",109000);
        employee.put("Asghar",129000);
        int salary=0;
        String empName="";
        for (var e:employee.entrySet()){
            if (e.getValue()>salary){
                empName=e.getKey();
                salary=e.getValue();
            }
        }
        System.out.println(empName+" "+salary);
    }
}
