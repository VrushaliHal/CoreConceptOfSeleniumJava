package exampleOfString;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceptionTimeout {

    @Test(invocationTimeOut = 2, expectedExceptions = ThreadTimeoutException.class)
    public void infiniteloopTest(){
        int i=1;
        while(i==1)
        {
            System.out.println(i);
        }
    }
}
