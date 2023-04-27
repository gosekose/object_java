package ch3.discount;

import ch3.Screening;
import ch3.discount.DiscountCondition;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class PeriodCondition implements DiscountCondition {
    private DayOfWeek dayOfWeek;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public PeriodCondition(DayOfWeek dayOfWeek, LocalDateTime startTime, LocalDateTime endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.isBefore(screening.getWhenScreened()) &&
                endTime.isAfter(screening.getWhenScreened());
    }
}
