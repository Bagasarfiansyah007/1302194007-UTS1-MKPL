package lib;

public class Salary extends Employee{
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

    public Salary(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender, int monthlySalary, int otherMonthlyIncome, int annualDeductible) {
        super(employeeId, firstName, lastName, idNumber, address, yearJoined, monthJoined, dayJoined, isForeigner, gender);
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.annualDeductible = annualDeductible;
    }

    public void setMonthlySalary(int grade) {
        if (grade == 1) {
            monthlySalary = 3000000;
            if (isForeigner) {
                monthlySalary = (int) (3000000 * 1.5);
            }
        }else if (grade == 2) {
            monthlySalary = 5000000;
            if (isForeigner) {
                monthlySalary = (int) (3000000 * 1.5);
            }
        }else if (grade == 3) {
            monthlySalary = 7000000;
            if (isForeigner) {
                monthlySalary = (int) (3000000 * 1.5);
            }
        }
    }

    public void setAnnualDeductible(int deductible) {
        this.annualDeductible = deductible;
    }

    public void setAdditionalIncome(int income) {
        this.otherMonthlyIncome = income;
    }
}
