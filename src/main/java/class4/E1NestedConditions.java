package class4;

public class E1NestedConditions {
    public static void main(String[] args) {
        boolean isMaindoorOpened = true;
        boolean isRoom1Opened = true;
        boolean isRoom2Opened = true;
        if (isMaindoorOpened) {
            if (isRoom1Opened) {
                System.out.println("We are in room 1");
            } else {
                System.out.println("Room 1 is closed");
            }
            if (isRoom2Opened) {
                System.out.println("We are in room 2");
            } else {
                System.out.println("Room 2 is closed");
            }
        } else {
            System.out.println("Can't enter the house main door is closed");
        }
    }
}
