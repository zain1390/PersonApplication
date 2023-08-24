package Aug23;

public class HealthCareSystem {
    public static void main(String[] args) {
        Person person1 = new Person("Alexa",25);
        Person person2 = new Person("Dr. Alex",30);

        Patient patient = new Patient(person1,1,"Heart Patient");
        Doctor doctor = new Doctor(person2,"Heart Specialist",231);

        patient.displayInfo();
        doctor.displayInfo();




    }
}