package interfaceconcept;

public class KotakMahindra implements RBI_Bank,HSBCBank,ICICIBank,AxisBank{

    @Override
    public void mutualFund() {
        System.out.println("mutualFund.... KotakMahindra");
    }

    @Override
    public void credit() {

        System.out.println("credit money .... KotakMahindra");
    }

    @Override
    public void debit() {
        System.out.println("debit money .... KotakMahindra");
    }

    @Override
    public void takeFD() {
        System.out.println("takeFD  .... KotakMahindra");
    }

    @Override
    public void homeLoan() {
        System.out.println("homeLoan  .... KotakMahindra");
    }

    @Override
    public void personalLoan() {
        System.out.println("personalLoan  .... KotakMahindra");
    }

    public void carLoan() {
        System.out.println("carLoan  .... KotakMahindra");
    }
}
