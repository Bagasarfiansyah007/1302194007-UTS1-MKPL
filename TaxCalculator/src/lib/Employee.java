package lib;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;

	public  enum Gender {
		laki_laki,
		perempuan,
	}
	private Gender gender;//true = Laki-laki, false = Perempuan


	private List<Children> childrens;

	public Employee(
			String employeeId,
			String firstName,
			String lastName,
			String idNumber,
			String address,
			boolean isForeigner,
			Gender gender
	) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
		this.isForeigner = isForeigner;
		this.gender = gender;

		childrens = new LinkedList<Children>();
	}
	
	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

	public String getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getAddress() {
		return address;
	}

	public boolean isForeigner() {
		return isForeigner;
	}

	public int getTotalChildrens(){
		return childrens.size();
	}

	public Gender getGender() {
		return gender;
	}

	public void addChild(String childName, String childIdNumber) {
		childrens.add(new Children(childName,childIdNumber));
	}


}
