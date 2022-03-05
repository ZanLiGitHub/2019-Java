import java.util.*;

public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location, int id) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location, id);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty
        Patient patient = null;
        if(this.awl.head == null){
            System.out.println("Waiting list is empty");
            patient = null;
        }else{
            patient = this.awl.popPatient();
            System.out.println("Assigned an ambulance for patient: " + patient.getName());
        }
        return patient;
    }

    public void assignAmbulanceForPatientById() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input ID: ");
        int id = input.nextInt();
        if(this.awl.head == null)
            System.out.println("Waiting list is empty");
        else{
            Node tmp = this.awl.head;
            Node tmpPre = null;
            boolean b = true;
            while(b){
                if(tmp.getPatient().getId() != id){
                    tmpPre = tmp;
                    tmp = tmp.getNext();
                    b = true;
                }else{
                    tmpPre.setNext(tmp.getNext());
                    b = false;
                }
            }
            System.out.println("Assigned an ambulance for patient: "+ id);
        }
    }


    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }
}
