package class21;

interface FileReader{
    public void read();
}
public class ExcelFile implements FileReader{
    @Override
    public void read() {
        System.out.println("Reading an Excel file");
    }
}
class TxtFile implements FileReader{
    @Override
    public void read() {
        System.out.println("Reading text file");
    }
}
