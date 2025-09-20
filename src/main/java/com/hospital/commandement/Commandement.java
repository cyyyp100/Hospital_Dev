package com.hospital.commandement;

import com.hospital.dac.BaseOperationnelle;
import com.hospital.dac.Equipement;
import com.hospital.damho.Hospitalisation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Service responsable du déploiement des unités DAC et DAMHO.
 */
public class Commandement {
    private final List<Equipement> equipementsDisponibles;
    private BaseOperationnelle baseOperationnelle;
    private Hospitalisation hospitalisation;

    public Commandement() {
        this.equipementsDisponibles = new ArrayList<>();
    }

    public void ajouterEquipement(Equipement equipement) {
        equipementsDisponibles.add(Objects.requireNonNull(equipement, "L'équipement ne peut pas être nul"));
    }

    public void deployer(ConfigurationType configuration) {
        Objects.requireNonNull(configuration, "La configuration est requise");
        baseOperationnelle = new BaseOperationnelle(
                "Emplacement DAC",
                configuration.getCapaciteDac(),
                equipementsDisponibles);
        hospitalisation = new Hospitalisation(
                "Emplacement DAMHO",
                configuration.getCapaciteDamho(),
                equipementsDisponibles);
    }

    public void rapporterInondation(int niveauInondation) {
        if (baseOperationnelle == null || hospitalisation == null) {
            throw new IllegalStateException("Les unités doivent être déployées avant de rapporter une inondation.");
        }
        baseOperationnelle.updateEquipements(niveauInondation);
        hospitalisation.updateEquipements(niveauInondation);
    }

    public BaseOperationnelle getBaseOperationnelle() {
        return baseOperationnelle;
    }

    public Hospitalisation getHospitalisation() {
        return hospitalisation;
    }

    public List<Equipement> getEquipementsDisponibles() {
        return Collections.unmodifiableList(equipementsDisponibles);
    }
}
