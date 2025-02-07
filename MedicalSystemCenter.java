import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class User {
    protected String username;
    protected String password;
    protected String userType;

    public User(String username, String password, String userType) {
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public abstract void showMenu(Scanner scanner);
}

class Patient extends User {
    private List<String> prescriptions;

    public Patient(String username, String password) {
        super(username, password, "Patient");
        this.prescriptions = new ArrayList<>();
    }

    public void viewPrescriptions() {
        System.out.println("Viewing prescriptions for: " + username);
        if (prescriptions.isEmpty()) {
            System.out.println("No prescriptions available.");
        } else {
            for (String prescription : prescriptions) {
                System.out.println("- " + prescription);
            }
        }
    }

    public void addPrescription(String prescription) {
        prescriptions.add(prescription);
    }

    @Override
    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. View prescriptions");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    viewPrescriptions();
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Doctor extends User {
    public Doctor(String username, String password) {
        super(username, password, "Doctor");
    }

    public void prescribe(Patient patient, String prescription) {
        patient.addPrescription(prescription);
        System.out.println("Prescription added for patient: " + patient.username);
    }

    @Override
    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Prescribe Medicine");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient's username: ");
                    String patientUsername = scanner.nextLine();
                    User patient = MedicalCenterSystem.findUserByUsername(patientUsername);

                    if (patient instanceof Patient) {
                        System.out.print("Enter prescription: ");
                        String prescription = scanner.nextLine();
                        prescribe((Patient) patient, prescription);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Pharmacist extends User {
    public Pharmacist(String username, String password) {
        super(username, password, "Pharmacist");
    }

    public void manageStock() {
        System.out.println("Managing medicine stock...");
    }

    @Override
    public void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Manage Stock");
            System.out.println("2. Logout");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageStock();
                    break;
                case 2:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class MedicalCenterSystem {
    private static List<User> users = new ArrayList<>();

    public MedicalCenterSystem() {
        // Adding dummy users
        users.add(new Doctor("doctor", "d"));
        users.add(new Pharmacist("pharmacist", "p"));
        users.add(new Patient("2007331039", "mokarrom"));
    }

    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static User findUserByUsername(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void start() {
        System.out.println("Welcome to SUST Medical Centre Management System!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            User user = authenticate(username, password);
            if (user != null) {
                System.out.println("Login Successful! Welcome, " + user.userType);
                user.showMenu(scanner);
            } else {
                System.out.println("Invalid credentials. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        MedicalCenterSystem system = new MedicalCenterSystem();
        system.start();
    }
}
