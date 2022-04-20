package lib;

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
}
