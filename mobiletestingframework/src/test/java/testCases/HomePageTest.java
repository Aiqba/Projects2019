package testCases;

import home.HomePage;
import route.SelectRoutePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class HomePageTest extends HomePage {
    HomePage objHomePage;
    SelectRoutePage objSelectRoutePage;

    @BeforeMethod
    public void initializationOfObjects() {
        objHomePage = PageFactory.initElements(ad, HomePage.class);
        objSelectRoutePage = PageFactory.initElements(ad, SelectRoutePage.class);
    }

    @Test
    public void testMenu() throws InterruptedException {
       // objHomePage.skipLogin();
        // objHomePage.clickGps();
        objHomePage.getMenu();

      //  objHomePage.getMenu();
    }

  /*  @Test
    public void testYourPlaces() {
        objHomePage.getYourPlaces();
    }

    @Test
    public void testYourTimeline() {
        objHomePage.getYourTimeline();
    }

    @Test
    public void testYourCOntribution() {
        objHomePage.getYourContributions();
    }

    @Test
    public void testLocationSharing() {
        objHomePage.getLocationSharing();
    }

    @Test
    public void testStartDriving() {
        objHomePage.getStartDriving();
    }

    @Test
    public void testExplore() {
        objHomePage.getExplore();
    }

    @Test
    public void testTipsAndTricks() {
        objHomePage.getTipsAndTricks();
    }

    @Test
    public void testAddAMissingPlace() {
        objHomePage.getAddAMissingPlace();
    }

    @Test
    public void testSettings() {
        objHomePage.getSettings();
    }

    @Test
    public void testHelp() {
        objHomePage.getHelp();
    }

    @Test
    public void testSendFeedBack() {
        objHomePage.getSendFeedback();
    }

    @Test
    public void testTermsOfService() {
        objHomePage.getTermsOfServices();
    }

    @Test
    public void testSetHomeAddressInYourPlace() {
        objHomePage.setHomeAddressInYourPlaces();
    }

    @Test
    public void testMapTypeSatellite() {
        objHomePage.mapTypeSatellite();
    }

    @Test
    public void testMapTypeTerrain() {
        objHomePage.mapTypeTerrain();
    }

    @Test
    public void testStartDrivingTo() {
        objHomePage.startDriving();
    }
    @Test
    public void testSearch() {
        objHomePage.search();
    }*/
/*

    public static class StartAppiumServer {

        String APPIUM_COMMAND = "appium";

        */
/**
         * Setup method in Base Driver that executes before tests
         *//*

        public static void setUp() throws Exception {

            // Initialize coniguration, objects, driver... set capabilities.

            startAppiumServer("4273");
        }

        */
/**
         * Teardown method in Base Driver that executes before tests, to clean up.
         *//*

        public static void tearDown() throws Exception {

            // quit driver, cleanup code.

            stopAppiumServer("4273");

        }

*/

        /**
         * To start Appium server
         * @param port - port number on which the server starts
         * @throws Exception
         */
      /*  private static void startAppiumServer(String port) throws Exception {
            Logger.log(String.format("Starting Appium server on port %s", port));

            // Check if Appium server already up and running
            if (!isAppiumServerRunning(port)) {
                // command to start Appium server --> appium -p 4273
                String completeAppiumCommand = String.format("%s -p %s", APPIUM_COMMAND, port);
                Logger.logComment("Starting Server");
                try {
                    Logger.logComment("Appium server started with version: " + runCMD(completeAppiumCommand));
                } catch (Exception serverNotStarted) {
                    Logger.logWarning("Could not start Appium Server");
                    throw new Exception(serverNotStarted.getMessage());
                }
            } else {
                Logger.logComment("Appium server already started");
            }
        }
*/

        /**
         * To check if Appium server is already up and running on the desired port
         * @param port desired port for server to start
         * @return true if server running, else false.
         * @throws Exception
         */
       /* private static boolean isAppiumServerRunning(String port) throws Exception {
            Logger.logAction(String.format("Checking if Appium server is executing on port %s", port));

            // command to check if Appium service running on port --> sh -c lsof -P | grep ':4723'
            String checkCommand[] = new String[]{"sh", "-c", String.format("lsof -P | grep :%s", port)};
            if (runCommandAndWaitToComplete(checkCommand).equals("")) {
                Logger.logWarning(String.format("Appium server is not running on port %s", port));
                return false;
            } else {
                Logger.logComment(String.format("Appium server is running on port %s", port));
                return true;
            }
        }*/

        /**
         * To stop appium server
         * @param port desired port for server to stop
         * @throws Exception
         */
       /* private static void stopAppiumServer(String port) throws Exception {
            Logger.logAction(String.format("Stopping Appium server on port %s", port));

            // command to stop Appium service running on port --> sh -c lsof -P | grep ':4723' | awk '{print $2}' | xargs kill -9
            String stopCommand[] = new String[]{"sh", "-c", String.format("lsof -P | grep ':%s' | awk '{print $2}' | xargs kill -9", port)};
            runCommandAndWaitToComplete(stopCommand);
        }
*/
        /**
         * To execute a terminal command, and get the complete log response.
         *
         * @param command - command we intend to execute via terminal
         * @return - the execution log. We can scan this to check if the command executed was a success or failure.
         * @throws Exception
         */
        /*public static String runCommandAndWaitToComplete(String[] command) throws Exception {
            String completeCommand = String.join(" ", command);
            Logger.logAction("Executing command: " + completeCommand);
            String line;
            String returnValue = "";

            try {
                Process processCommand = Runtime.getRuntime().exec(command);
                BufferedReader response = new BufferedReader(new InputStreamReader(processCommand.getInputStream()));

                try {
                    processCommand.waitFor();
                } catch (InterruptedException commandInterrupted) {
                    throw new Exception("Were waiting for process to end but something interrupted it" + commandInterrupted.getMessage());
                }

                while ((line = response.readLine()) != null) {
                    returnValue = returnValue + line + "\n";
                }

                response.close();

            } catch (Exception e) {
                throw new Exception("Unable to run command: " + completeCommand + ". Error: " + e.getMessage());
            }

*/ /*           Logger.logComment("Response : runCMDAndWaitToComplete(" + completeCommand + ") : " + returnValue);
            return returnValue;
        }
*/
        /**
         * Helper method to run an arbitrary command-line 'command', waits for few seconds after command executes
         * @param command string that will be sent to command-line
         * @return The first line response after executing command. (can be used to verify)
  /*       *//*
        public static String runCMD(String command) throws Exception {
            Logger.logAction("Executing command: " + command);
            try {
                Process process = Runtime.getRuntime().exec((command));
                process.waitFor(10, TimeUnit.SECONDS);
                BufferedReader response = new BufferedReader(new InputStreamReader(process.getInputStream()));
                return response.readLine();
            } catch (Exception e) {
                Logger.logWarning("Unable to run command: " + command + ". Error: " + e.getMessage());
                throw new Exception(e.getMessage());
            }
        }
    }*/
}
