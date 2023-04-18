package inheritance_polymorphism.employee_app.gov.irs;

public class IRS {
    private TaxPayer[] taxPayers = new TaxPayer[100];;
    private int currendIndex = 0;

    public void register(TaxPayer taxPayer) {
        taxPayers[currendIndex++] = taxPayer;
    }

    public double computeTotalMonthlyTaxToCollect() {
        double total = 0;
        for (int i = 0; i < currendIndex; i++) {
            total += taxPayers[i].computeMonthlyTaxToPay();
        }
        return total;
    }
}
