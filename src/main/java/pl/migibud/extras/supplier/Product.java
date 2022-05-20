package pl.migibud.extras.supplier;

import java.time.LocalDate;

public interface Product {
    Double getPrice();
    Boolean isAvailable(LocalDate localDate);
}
