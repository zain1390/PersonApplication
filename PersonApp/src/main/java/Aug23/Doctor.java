/*

3. Define the "Doctor" class:
- Create a class named "Doctor" that extends "Person".
- Add private attributes "specialization" and "doctorId".
- Create a constructor that takes a "Person" object specialization, and doctorId. - Call the
- Define getter methods for "specialization" and "doctorId".
- Override the "displayInfo()" method to include doctor-specific attributes.
 */
package Aug23;
public class Doctor extends Person {
    private String specialization;
    private Integer doctorId;
    public Doctor(Person person, String specialization, Integer doctorId) {
        super(person.getName(), person.getAge());
        this.specialization = specialization;
        this.doctorId = doctorId;
    }
    public String getSpecialization() {
        return specialization;
    }
    public Integer getDoctorId() {
        return doctorId;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doctor ID: "
                +this.doctorId+", Specialization: "
                +this.specialization+"\n");

    }
}
