import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    @FindBy(id = "com.continuum.emi.calculator:id/btnStart")
    WebElement btnStart;

    @FindBy(id = "com.continuum.emi.calculator:id/etLoanAmount")
    WebElement txtAmount;

    @FindBy(id = "com.continuum.emi.calculator:id/etInterest")
    WebElement txtInterest;

    @FindBy(id = "com.continuum.emi.calculator:id/etYears")
    WebElement txtYear;

    @FindBy(id = "com.continuum.emi.calculator:id/etEMI")
    WebElement txtEMI;

    @FindBy(id = "com.continuum.emi.calculator:id/etFee")
    WebElement txtProcFee;

    @FindBy(id = "com.continuum.emi.calculator:id/btnCalculate")
    WebElement btnCalc;

    @FindBy(id = "com.continuum.emi.calculator:id/btnReset")
    WebElement btnReset;

    @FindBy(id = "com.continuum.emi.calculator:id/monthly_emi_result")
    WebElement lblMonthlyEMI;

    @FindBy(id = "com.continuum.emi.calculator:id/total_interest_result")
    WebElement lbltotalInterest;

    @FindBy(id = "com.continuum.emi.calculator:id/processing_fee_result")
    WebElement lblProcFee;

    @FindBy(id = "com.continuum.emi.calculator:id/total_payment_result")
    WebElement lblTotalPayment;

    public CalcScreen(AndroidDriver androidDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public void doCalculate(int loanAmount, double interestRate, int year, double processingFee) {
        txtAmount.sendKeys(""+loanAmount);
        txtInterest.sendKeys(""+interestRate);
        txtYear.sendKeys(""+year);
        txtProcFee.sendKeys(""+processingFee);

        btnCalc.click();
    }
}
