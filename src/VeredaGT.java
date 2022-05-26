public class VeredaGT implements Vehicle{

    private float energy;
    private static final float MAX_ENERGY = 3000f;
    private static final float energyDelta = 50f;
    private String matricula;
    private int movementCount = 0;

    public VeredaGT(float energy, String matricula) {
        this.energy = energy;
        this.matricula = matricula;
    }

    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        energy = MAX_ENERGY;
    }

    @Override
    public void move() {
        if (energy >= energyDelta) {
            energy = energy - energyDelta;
            System.out.println("Moving...");
            movementCount++;
        }else {
            System.out.println("El vehículo tiene " + energy + " energía, no es sufuciente...");
        }
    }

    @Override
    public String status() {
        String descripcion = "El matrícula: -"+ matricula +
                "- tiene un nivel de carga de: " + energy +
                " y se ha movido " + movementCount + " veces.";
        return descripcion;
    }
}