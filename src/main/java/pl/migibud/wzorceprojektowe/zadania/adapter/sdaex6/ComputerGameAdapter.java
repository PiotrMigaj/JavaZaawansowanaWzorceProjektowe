package pl.migibud.wzorceprojektowe.zadania.adapter.sdaex6;

public class ComputerGameAdapter implements PCGame{

    private final ComputerGame computerGame;

    public ComputerGameAdapter(final ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return this.computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (this.computerGame.getPegiAgeRating()){
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
        }
        throw new RuntimeException("Unsupported PEGI rating");
    }

    @Override
    public boolean isTripleAGame() {
        return this.computerGame.getBudgetInMillionsOfDollars()>50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements.RequirementsBuilder()
                .gpuGb(computerGame.getMinimumGpuMemoryInMegabytes() / 1024)
                .HDDGb(computerGame.getDiskSpaceNeededInGB())
                .RAMGb(computerGame.getRamNeededInGb())
                .cpuGhz(computerGame.getCoreSpeedInGhz())
                .coresNum(computerGame.getCoresNeeded())
                .build();
    }
}
