package pl.migibud.wzorceprojektowe.zadania.templatemethod;

public class StandardComputerBuilder extends ComputerBuilder{
    @Override
    protected void addProcessor() {
        computerParts.put("processor","standard processor");
    }

    @Override
    protected void setUpMotherBoard() {
        System.out.println("setting mother board");
    }

    @Override
    protected void addMotherBoard() {
        computerParts.put("motherboard","standard motherboard");
    }
}
