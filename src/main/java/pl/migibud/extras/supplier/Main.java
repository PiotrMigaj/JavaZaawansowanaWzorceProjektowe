package pl.migibud.extras.supplier;

public class Main {
    public static void main(String[] args) {

        GenericProduct genericProduct = new GenericProduct(()->20.0);
        System.out.println(genericProduct.getPrice());
        printDouble(()->25.0);


    }

    public static void printDouble(MyOwnDoubleSupplier f){
        System.out.println(f.getDouble());
    }
}
