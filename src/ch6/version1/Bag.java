package ch6.version1;

public class Bag {
    private Ticket ticket;
    private Invitation invitation;
    private Long amount;

    public Bag(Ticket ticket, Invitation invitation, Long amount) {
        this.ticket = ticket;
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long setTicket(Ticket ticket) {

        if (hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        }

        else {
            if (!isEnoughAmount(amount)) throw new IllegalArgumentException("여분의 돈이 충분 하지 않습니다.");
            this.ticket = ticket;
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private boolean isEnoughAmount(Long amount) {
        return this.amount >= amount;
    }
}
