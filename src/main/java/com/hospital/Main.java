package com.hospital;

import com.hospital.commandement.Commandement;
import com.hospital.commandement.ConfigurationType;
import com.hospital.dac.Equipement;
import com.hospital.damho.Patient;

/**
 * Petit scénario de démonstration pour présenter le fonctionnement du projet.
 */
public final class Main {
    private Main() {
        // Utility class
    }

    public static void main(String[] args) {
        Commandement commandement = new Commandement();
        commandement.ajouterEquipement(new Equipement(
                "Kit médical de base",
                "Santé",
                15,
                "Stock initial",
                false,
                true));
        commandement.ajouterEquipement(new Equipement(
                "Générateur électrique",
                "Énergie",
                2,
                "Autonomie de la base",
                false,
                true));

        commandement.deployer(ConfigurationType.CONFIGURATION_BASE);
        commandement.rapporterInondation(7);

        boolean admis = commandement.getHospitalisation().admettrePatient(new Patient(1, "Alice"));
        if (admis) {
            System.out.println("Patient admis avec succès dans la DAMHO.");
        }

        System.out.println("Capacité DAC : " + commandement.getBaseOperationnelle().getCapacite());
        System.out.println("Capacité DAMHO : " + commandement.getHospitalisation().getCapacite());
        System.out.println("Équipements disponibles : " + commandement.getEquipementsDisponibles());
    }
}
