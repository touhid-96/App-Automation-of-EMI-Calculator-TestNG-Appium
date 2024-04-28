import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EMITestRunner extends Setup {

    CalcScreen calcScreen;

    @BeforeTest
    public void startEMI() {
        CalcScreen calcScreen = new CalcScreen(androidDriver);
        calcScreen.btnStart.click();
    }

    @Test(description = "EMI Calculate", dataProvider = "data-provider", dataProviderClass = Dataset.class)
    public void doCalculation(int loanAmount, double interestRate, int year, double processingFee,
                              double resultMonthlyEMI, double resultTotalInterest, double resultProcFee, double resultTotalPayment) {
        calcScreen = new CalcScreen(androidDriver);
        calcScreen.doCalculate(loanAmount, interestRate, year, processingFee);

        //assertion
        double actualMonthlyEMI = Double.parseDouble(calcScreen.lblMonthlyEMI.getText().replace(",", ""));
        double actualTotalInterest = Double.parseDouble(calcScreen.lbltotalInterest.getText().replace(",", ""));
        int actualProcFee = Integer.parseInt(calcScreen.lblProcFee.getText().replace(",", ""));
        double actualTotalPayment = Double.parseDouble(calcScreen.lblTotalPayment.getText().replace(",", ""));

        Assert.assertEquals(actualMonthlyEMI, resultMonthlyEMI);
        Assert.assertEquals(actualTotalInterest, resultTotalInterest);
        Assert.assertEquals(actualProcFee, resultProcFee);
        Assert.assertEquals(actualTotalPayment, resultTotalPayment);

        calcScreen.btnReset.click();
    }
}
