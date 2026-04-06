import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoadingDock {
    private int packages;
    private Lock lock = new ReentrantLock();
    private Condition takePackages = lock.newCondition();




    public void addPackages(String robotName, int numPackagesToAdd){
        lock.lock();
        packages += numPackagesToAdd;
        System.out.println(robotName + " added " + numPackagesToAdd + " packages. Total packages is: " + packages);

        takePackages.signalAll();
        lock.unlock();
    }

    public void takePackages(String truckName, int numPackagesToTake){
        lock.lock();
        try{
            while(packages < numPackagesToTake){

                System.out.println(truckName + " waiting for 20 packages, but there are only: " + packages);
                takePackages.await();
            }
            if (packages == numPackagesToTake) {
                System.out.println(truckName + " is departing with: " + this.packages);
                this.packages -= numPackagesToTake;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
