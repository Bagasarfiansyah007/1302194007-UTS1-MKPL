package lib;

public class Salary extends Employee{
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int annualDeductible;

    public  Salary(Employee employee)
    {
        super(
                employee.getEmployeeId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getIdNumber(),
                employee.getAddress(),
                employee.isForeigner(),
                employee.getGender()
        );
    }

    public void setMonthlySalary(int grade) {
        if (grade == 1) {
            monthlySalary = 3000000;
            calculateEmplyeeIfIsForeigner(monthlySalary);
        }else if (grade == 2) {
            monthlySalary = 5000000;
            calculateEmplyeeIfIsForeigner(monthlySalary);
        }else if (grade == 3) {
            monthlySalary = 7000000;
            calculateEmplyeeIfIsForeigner(monthlySalary);
        }
    }

    public void calculateEmplyeeIfIsForeigner(int monthlySalary){
        if (super.isForeigner()) {
            monthlySalary = (int) (monthlySalary + (monthlySalary * 0.5));
        }
    }

    public void setOtherMonthlyIncome(int otherMonthlyIncome) {
        this.otherMonthlyIncome = otherMonthlyIncome;
    }

    public void setAnnualDeductible(int annualDeductible) {
        this.annualDeductible = annualDeductible;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getAnnualDeductible() {
        return annualDeductible;
    }
}
