package com.github.xenteros.designpatterns.decorator.coffee.external;

import java.math.BigDecimal;

public interface Supplement {

    BigDecimal cost();
    Supplement parent();
}
