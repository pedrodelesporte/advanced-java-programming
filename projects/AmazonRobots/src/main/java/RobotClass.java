public class RobotClass implements Runnable {
    private String name;
    private LoadingDock packages;

    public RobotClass(String name, LoadingDock packages) {
        this.name = name;
        this.packages = packages;
    }



    @Override
    public void run() {

        while (true) {
            int randomPackage = (int)(Math.random() * 3);



            this.packages.addPackages(name, randomPackage);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
