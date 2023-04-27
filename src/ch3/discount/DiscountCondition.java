package ch3.discount;

import ch3.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);

}
