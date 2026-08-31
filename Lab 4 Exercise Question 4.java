import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Patient {
    private int patientId;
    private String patientName;
    private int age;
    private String diagnosis;
    
    public static String hospitalName = "Apollo Hospitals";
    public static final int MAX_PATIENTS = 100;

    public Patient(int patientId, String patientName, int age, String diagnosis) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() {
        return this.patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                continue;
            }

            if (input.startsWith("Patient ID")) {
                System.out.println("Patient Details Displayed");
            } else {
                String[] parts = input.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    int age = Integer.parseInt(parts[2].trim());
                    String diagnosis = parts[3].trim();

                    if (age < 1 || age > 100) {
                        System.out.println("Invalid Age");
                    } else {
                        boolean exists = false;
                        for (Patient p : patients) {
                            if (p.getPatientId() == id) {
                                p.setPatientName(name);
                                p.setAge(age);
                                p.setDiagnosis(diagnosis);
                                System.out.println("Patient Record Updated");
                                exists = true;
                                break;
                            }
                        }
                        
                        if (!exists) {
                            if (patients.size() < Patient.MAX_PATIENTS) {
                                Patient newPatient = new Patient(id, name, age, diagnosis);
                                patients.add(newPatient);
                                System.out.println("Patient Record Created");
                            }
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
