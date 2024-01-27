package class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constant;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {


        FileInputStream fis=new FileInputStream(Constant.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Employee");
        Row row=sheet.getRow(2);
        Cell cell=row.getCell(1);
        System.out.println(cell);



    }
}
