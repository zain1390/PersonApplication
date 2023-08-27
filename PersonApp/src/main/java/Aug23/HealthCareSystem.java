/*4. Create instances and display information in Main class:
- In the "main" method of a separate main class "HealthcareSystem", create two "Person"
objects like, "person1" and "person2"
- Create a "Patient" instance using "person1", patientId, and medicalCondition. - Create a "Doctor" instance using "person2", specialization, and doctorId.
- Display patient and doctor information using the "displayInfo()" methods. */
package Aug23;

public class HealthCareSystem {
    public static void main(String[] args) {
        Person person1 = new Person("Alexa", 25);
        Person Doctor = new Person("Dr. Alex", 30);
        Patient patient = new Patient(person1, 1, "Heart Patient");
        Doctor doctor = new Doctor(Doctor, "Heart Specialist", 231);
        patient.displayInfo();
        doctor.displayInfo();
    }
}