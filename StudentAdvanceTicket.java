//StudentAdvanceTicket.java

public class StudentAdvanceTicket extends AdvanceTicket {

    public StudentAdvanceTicket(int number, int daysInAdvance) {
        super(number, daysInAdvance);
        price = price/2;
    }
}
