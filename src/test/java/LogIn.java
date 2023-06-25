import StepObject.LogInSteps;
import Utils.ChromRunner;
import org.junit.Test;
import org.testng.Assert;

import static DataObject.LogInData.*;

public class LogIn extends ChromRunner {
    @Test
    public void logInWithIncorrectData() throws InterruptedException {
        LogInSteps step1 = new LogInSteps(ChromRunner.driver);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Sign in to GitHub · GitHub";
        Assert.assertEquals(actualTitle, expectedTitle);
        step1.emailInput(incorrectEmailData);
        step1.passwordInput(incorrectPasswordData);
        step1.logInButton();
        Thread.sleep(5000);

    }
    @Test
    public void LogInWithCorrectEmail() throws InterruptedException {
        LogInSteps step2 = new LogInSteps(ChromRunner.driver);
        String actualTitle = driver.getTitle();
        String expectedTitle ="GitHub";
        Assert.assertNotEquals(actualTitle, expectedTitle);
        step2.emailInput(correctEmailData);
        step2.passwordInput(correctPasswordData);
        step2.logInButton();
        Thread.sleep(5000);



    }


}