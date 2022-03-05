import java.util.*;

public class WaitingList {

    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        Node tmp = this.head;
        if(this.head == null){
            System.out.println("List is empty.");
            tmp = null;
        }else{
            tmp = this.head;
            this.head = tmp.getNext();
        }
        return tmp.getPatient();
    }

    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        Node newPatient = new Node(patient);

        if(this.head == null){
            this.head = newPatient;

        }else{
            Node tmp = this.head;
            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(newPatient);
        }
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        if(this.head != null){
            Node tmp = this.head;
            do{
                System.out.print(tmp.getPatient().getName() + " ");
                tmp = tmp.next;
            }while(tmp != null);
        }
        System.out.println();
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
}
