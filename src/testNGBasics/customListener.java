package testNGBasics;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListener extends Base implements ITestListener {
    @Override
    public void onTestFailure(ITestResult tr) {
        failed(tr.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult tr) {

    }

    @Override
    public void onTestSuccess(ITestResult tr) {
    }
}
