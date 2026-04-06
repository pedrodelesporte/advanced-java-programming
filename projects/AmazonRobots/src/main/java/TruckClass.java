public class TruckClass implements Runnable {
    private String name;
    private LoadingDock packages;

    public TruckClass(String s, LoadingDock packages) {
        this.name = s;
        this.packages = packages;
    }

    public LoadingDock getPackages() {
        return packages;
    }

    @Override
    public void run() {
        while (true) {

            this.packages.takePackages(name, 20);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
