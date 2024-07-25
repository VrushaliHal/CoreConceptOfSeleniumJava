package interfaceconcept;

import static interfaceconcept.RBI_Bank.min_balance;

public class AllBank {
    public static void main(String[] args) {

    KotakMahindra kr = new KotakMahindra();
    kr.credit();
    kr.homeLoan();
    kr.carLoan();
    kr.debit();
    kr.mutualFund();
    kr.personalLoan();
    kr.takeFD();
    System.out.println(min_balance);
    System.out.println(kr.HSBCAccount_Name);

    RBI_Bank br = new KotakMahindra();
    br.credit();
    br.debit();
    br.takeFD();

     }


}
