package Base;


import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Base.ExtentTestManager.*;

public class TestListener extends TestBase implements ITestListener {


    private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    public void onStart(ITestContext context) {
        System.out.println("*** Test Suite " + context.getName() + " started ***");
    }

    public void onFinish(ITestContext context) {
        System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
        endTest();
        ExtentManager.getInstance().flush();
    }

    public void onTestStart(ITestResult result) {
        System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
        startTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("*** Executed " + result.getMethod().getMethodName() + " test successfully...");
        getTest().log(Status.PASS, "Test passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("*** Test execution " + result.getMethod().getMethodName() + " failed...");
        System.out.println((result.getMethod().getMethodName() + " failed!"));

        Object currentClass = result.getInstance();
        WebDriver driver = ((TestBase) currentClass).getDriver();
        String targetLocation = null;
        String testClassName = getTestClassName(result.getInstanceName()).trim();
        String timeStamp = getCurrentTimeStamp("yyyy-MM-dd-HH-mm-ss-SSS"); // get timestamp
        String testMethodName = result.getName().toString().trim();
        String screenShotName = testMethodName + timeStamp + ".png";
        String fileSeperator = System.getProperty("file.separator");
        String reportsPath = System.getProperty("user.dir") + fileSeperator + "TestReport" + fileSeperator
                + "screenshots";
        System.out.println("Screen shots reports path - " + reportsPath);
        try {
            File file = new File(reportsPath + fileSeperator + testClassName); // Set
// screenshots
// folder
            if (!file.exists()) {
                if (file.mkdirs()) {
                    System.out.println("Directory: " + file.getAbsolutePath() + " is created!");
                } else {
                    System.out.println("Failed to create directory: " + file.getAbsolutePath());
                }

            }

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            targetLocation = reportsPath + fileSeperator + testClassName + fileSeperator + screenShotName;// define
            System.out.println("Faisal "+targetLocation); // location
            File targetFile = new File(targetLocation);
            System.out.println("Screen shot file location - " + screenshotFile.getAbsolutePath());
            System.out.println("Target File location - " + targetFile.getAbsolutePath());
            FileHandler.copy(screenshotFile, targetFile);

        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("File not found exception occurred while taking screenshot " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("An exception occurred while taking screenshot " + e.getCause());
        }

// attach screenshots to report
        try {
            ExtentTestManager.getTest().fail("Screenshot",
                    MediaEntityBuilder.createScreenCaptureFromPath(targetLocation).build());
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("An exception occured while taking screenshot " + e.getCause());
        }
        ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
    }
    public String getTestClassName(String testName) {
        String[] reqTestClassname = testName.split("\\.");
        int i = reqTestClassname.length - 1;
        System.out.println("Required Test Name : " + reqTestClassname[i]);
        return reqTestClassname[i];
    }

    /*---------Prints current date time stamp---------*/
    public String getCurrentTimeStamp(String format){
        Date currentDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat(format);
        String currentDateString = df.format(currentDate);
        return currentDateString;
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
        getTest().log(Status.SKIP, "Test Skipped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
    }

}