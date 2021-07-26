package vaccination;

import java.util.HashSet;
import java.util.Set;

public class VaccinationCenter {
    private String name;
    private Integer nVacunados;
    private Integer nCompletamenteVacunados;
    private Set<String> vacunados = new HashSet<>();
    private Set<String> completamente = new HashSet<>();

    public boolean compare(String name) {
        return this.name.equals(name);
    }

    public VaccinationCenter(String name) {
        this.name = name;
        this.nVacunados = 0;
        this.nCompletamenteVacunados = 0;
    }

    public void registrarVacunado(String dni) {
        if (vacunados.contains(dni)) {
            completamente.add(dni);
        } else {
            vacunados.add(dni);
        }
    }

    public String getName() {
        return name;
    }
}
