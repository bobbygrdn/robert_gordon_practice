package inheritance_polymorphism.employee_app.com.hr.corp;

import inheritance_polymorphism.employee_app.gov.irs.TaxPayer;

public class Corporation implements TaxPayer {
    String name;
    double monthlyIncome;

    public double computeMonthlyTaxToPay() {
        return monthlyIncome * CORP_TAX_RATE;
    }
}
