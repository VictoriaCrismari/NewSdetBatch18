package class3;

public class TrafficLightActions {
    public static void main(String[] args) {
        String trafficLight="Yellow";
        if (trafficLight == "Red"){
            System.out.println("Stop");
        } else if (trafficLight=="Yellow") {
            System.out.println("Caution");
        } else if (trafficLight=="Green") {
            System.out.println("Go");
        }
    }
}
