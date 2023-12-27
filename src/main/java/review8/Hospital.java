package review8;

import review8_1.Orthodontist;

public class Hospital {
    public static void main(String[] args){
        Doctor.hospital="Inova";
        Surgeon surgeon=new Surgeon("John","Smith","surgeon",20);
        surgeon.checkVitals();
        surgeon.checkVitals("Jane Smith");
        surgeon.prescribeMedication("Smith");
        Doctor.work();
        Surgeon.work();
        System.out.println("//////////////////");
        Orthodontist ortho=new Orthodontist("Josh","Doe","orthodontist",15);
        Orthodontist.work();
        ortho.checkVitals();
        ortho.prescribeMedication("Pain killers");
    }
}
