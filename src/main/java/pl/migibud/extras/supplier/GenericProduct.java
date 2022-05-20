package pl.migibud.extras.supplier;

import java.time.LocalDate;
import java.util.function.Supplier;

public class GenericProduct implements Product{

    private final Supplier<Double> priceSupplier;

    public GenericProduct(Supplier<Double> priceSupplier) {
        this.priceSupplier = priceSupplier;
    }

    @Override
    public Double getPrice() {
        return this.priceSupplier.get();
    }

    @Override
    public Boolean isAvailable(LocalDate localDate) {
        return null;
    }
}
