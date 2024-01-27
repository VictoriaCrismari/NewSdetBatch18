package class26;

import utils.Constant;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
         List<Map<String,String>> data=ExcelReader.read(Constant.EXCEL_FILE_PATH,"Employee");
        System.out.println(data.get(1));
        System.out.println(data.get(3).get("FirstName"));
           /*data.forEach(x-> x.forEach((k,v)->{
               System.out.println(k+" "+v);
           }));*/
        data.forEach(x-> System.out.println(x));
       // data.forEach(System.out::println);
        }
    }
