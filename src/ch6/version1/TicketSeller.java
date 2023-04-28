package ch6.version1;

public class TicketSeller {

    private TicketOffice ticketOffice;
    public void setTicket(Audience audience) {
        ticketOffice.plusAmount(audience.setTicket(ticketOffice.getTicket()));
    }
}
