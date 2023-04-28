package ch6.version1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TicketOffice {

    private List<Ticket> tickets = new ArrayList<>();
    private Set<Ticket> soldTickets = new HashSet<>();
    private Long amount;

    public TicketOffice(Long amount) {
        this.amount = amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    public Ticket getTicket() {
        Ticket ticket = tickets.get(tickets.size() - 1);
        soldTickets.add(ticket);
        tickets.remove(tickets.size() - 1);

        return ticket;
    }

    public boolean isTicketsNotEmpty() {
        return this.tickets.isEmpty();
    }
}
