/*2. Define the "Patient" class:
- Create a class named "Patient" that extends "Person".
- Add private attributes "patientId" and "medicalCondition".
- Create a constructor that takes a   , patientId, and medicalCondition.
"Person" object
 - Call the
- Define getter methods for "patientId" and "medicalCondition".
- Override the "displayInfo()" method to include patient-specific attributes.*/
package Aug23;

public class Patient extends Person {
    private Integer patientId;
    private String medicalCondition;

    public Patient(Person person, Integer patientId,
                   String medicalCondition) {
        super(person.getName(), person.getAge());
        this.patientId = patientId;
        this.medicalCondition = medicalCondition;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Patient ID: " + this.patientId + ", Condition: " + this.medicalCondition + "\n");

    }
}

