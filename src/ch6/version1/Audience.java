package ch6.version1;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long setTicket(Ticket ticket) {
        return bag.setTicket(ticket);
    }

}
