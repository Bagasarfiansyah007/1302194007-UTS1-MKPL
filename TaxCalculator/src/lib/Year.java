package lib;

import java.time.LocalDate;

public class Year extends Employee{
    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;

    public Year(String employeeId, String firstName, String lastName, String idNumber, String address, int yearJoined, int monthJoined, int dayJoined, boolean isForeigner, boolean gender, int yearJoined1, int monthJoined1, int dayJoined1, int monthWorkingInYear) {
        super(employeeId, firstName, lastName, idNumber, address, yearJoined, monthJoined, dayJoined, isForeigner, gender);
        this.yearJoined = yearJoined1;
        this.monthJoined = monthJoined1;
        this.dayJoined = dayJoined1;
        this.monthWorkingInYear = monthWorkingInYear;
    }

    public int getAnnualIncomeTax() {

        //Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
        LocalDate date = LocalDate.now();

        if (date.getYear() == yearJoined) {
            monthWorkingInYear = date.getMonthValue() - monthJoined;
        }else {
            monthWorkingInYear = 12;
        }

        return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
    }
}
