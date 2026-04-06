import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AmazonTest01 {
    static void main() {
        LoadingDock loadingDock = new LoadingDock();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        RobotClass test01 = new RobotClass("[ROBOT 1]", loadingDock);
        RobotClass test02 = new RobotClass("[ROBOT 2]", loadingDock);
        RobotClass test03= new RobotClass("[ROBOT 3]", loadingDock);

        TruckClass testTruck01 = new TruckClass("[TRUCK 1]", loadingDock);
        TruckClass testTruck02 = new TruckClass("[TRUCK 2]", loadingDock);


        executor.execute(test01);
        executor.execute(test02);
        executor.execute(test03);
        executor.execute(testTruck01);
        executor.execute(testTruck02);


        executor.shutdown();
    }
}