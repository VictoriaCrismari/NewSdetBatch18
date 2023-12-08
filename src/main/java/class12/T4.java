package class12;

public class T4 {
    public static void main(String[] args) {
        String nameMom = "Victoria";
        String nameFather = "Constantin";
        boolean isboy = false;
        if (isboy) {
            String fatherFirtsPart = nameFather.substring(0, nameFather.length() / 2);
            String motherLastPart = nameMom.substring(nameMom.length() / 2, nameMom.length());
            System.out.println(fatherFirtsPart + motherLastPart);
        } else {
            String motherFirstPart = nameMom.substring(0, nameMom.length() / 2);
            String fatherLastPart = nameFather.substring(nameFather.length() / 2, nameFather.length());
            System.out.println(motherFirstPart + fatherLastPart);
        }
    }
}