package ch3;

import ch3.movie.Movie;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;

    private LocalDateTime whenScreened;

    public Movie getMovie() {
        return movie;
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }


    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }


}
