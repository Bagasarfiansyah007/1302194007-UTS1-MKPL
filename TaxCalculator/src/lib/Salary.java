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
}
