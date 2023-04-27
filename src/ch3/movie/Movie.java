package ch3.movie;

import ch3.Money;
import ch3.MovieType;
import ch3.Screening;
import ch3.discount.DiscountCondition;

import java.time.Duration;
import java.util.List;

public abstract class Movie {


    private String title; // 제목

    private Duration runningTime; // 상영 시간
    private Money fee; // 요금
    private List<DiscountCondition> discountConditions; // 할인 가능한 상황
    public Movie(String title, Duration runningTime, Money fee, List<DiscountCondition> discountConditions) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountConditions = discountConditions;
    }

    public Money calculateMovieFee(Screening screening) {
        if (isDiscountable(screening)) return fee.minus(calculateDiscountAmount());
        return fee;
    }

    private boolean isDiscountable(Screening screening) {
        return discountConditions.stream().anyMatch(discountCondition -> discountCondition.isSatisfiedBy(screening));
    }

    protected Money getFee() {
        return fee;
    }

    abstract protected Money calculateDiscountAmount();
}
