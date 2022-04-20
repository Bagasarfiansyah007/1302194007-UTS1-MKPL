package lib;

public class Spous extends Employee{
    private String spouseName;
    private String spouseIdNumber;

    public  Spous(Employee employee)
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

    public void setSpouse(String spouseName, String spouseIdNumber) {
        this.spouseName = spouseName;
        this.spouseIdNumber = super.getIdNumber();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }
}
