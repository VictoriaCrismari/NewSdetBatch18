package class10;

public class PhoneTest {
    public static void main(String[] args) {
        Phone iPhone=new Phone();
        iPhone.price=1000;
        iPhone.size=6;
        iPhone.color="Grey";
        iPhone.model="iPhone";
        iPhone.ring();
        iPhone.downloadFiles();
        iPhone.takePictures();

        Phone Pixel=new Phone();
        Pixel.price=900;
        Pixel.size=5;
        Pixel.color="Black";
        Pixel.model="Pixel";
        Pixel.ring();
        Pixel.takePictures();
        Pixel.downloadFiles();

        Phone Samsung= new Phone();
        Samsung.size=6;
        Samsung.color="Blue";
        Samsung.model="Samsung";
        Samsung.takePictures();
        Samsung.downloadFiles();
        Samsung.accessInternet();
    }
}
