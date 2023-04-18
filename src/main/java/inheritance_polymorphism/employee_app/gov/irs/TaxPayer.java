package inheritance_polymorphism.employee_app.gov.irs;

public interface TaxPayer {
    public static final double HOURLY_TAX_RATE = 0.25;
    public static final double SALARIED_TAX_RATE = 0.30;
    public static final double CORP_TAX_RATE = 0.20;

    double computeMonthlyTaxToPay();
}
