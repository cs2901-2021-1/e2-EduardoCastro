package vaccination;

public class VaccinationCenter {
    private String name;
    private Integer nVacunados;
    private Integer nCompletamenteVacunados;

    public boolean compare(String name) {
        return this.name.equals(name);
    }

    public VaccinationCenter(String name) {
        this.name = name;
        this.nVacunados = 0;
        this.nCompletamenteVacunados = 0;
    }

    public String getName() {
        return name;
    }
}
