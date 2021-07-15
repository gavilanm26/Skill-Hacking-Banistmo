package Runner.browser_manager;

public class driverManagerFactory {

    public static driverManager getManager(driverType type) {

        driverManager driverManagers = null;

        switch (type) {
            case CHROME:
                driverManagers = new ChromeDriverManager();
                break;

        }

        return driverManagers;
    }
}
