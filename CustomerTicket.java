
public class CustomerTicket {
    public static void main(String[] args) {
        // Some testing code
        Ticket sat = new StudentAdvanceTicket(1,11);
        Ticket satLate = new StudentAdvanceTicket(2,9);
        Ticket wt = new WalkupTicket(3);
        Ticket at = new AdvanceTicket(4,10);
        System.out.println("price of ticket purchased 10 days in advance: "+at.getPrice());
        System.out.println(sat);
        System.out.println(satLate);
        System.out.println(wt);
        System.out.println(at);

    }
}
