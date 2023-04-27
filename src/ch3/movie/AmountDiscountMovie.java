package ch3.movie;

import ch3.Money;
import ch3.discount.DiscountCondition;

import java.time.Duration;
import java.util.List;

public class AmountDiscountMovie extends Movie {

    private Money discountMoney;

    public AmountDiscountMovie(String title, Duration runningTime, Money fee, List<DiscountCondition> discountConditions, Money discountMoney) {
        super(title, runningTime, fee, discountConditions);
        this.discountMoney = discountMoney;
    }

    @Override
    protected Money calculateDiscountAmount() {
        return discountMoney;
    }
}
