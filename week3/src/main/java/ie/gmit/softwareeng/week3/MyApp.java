package ie.gmit.softwareeng.week3;

public class MyApp {

    public static void main(String[] args) {
        SlowUnreliableDependency dependency = new SlowUnreliableDependency();
        MyService service = new MyService(dependency);

        while(true) {
            System.out.println("Running...");
            System.out.println("Response from service: " + service.makeRequest());
        }
    }


}