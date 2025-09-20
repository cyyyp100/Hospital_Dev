package com.hospital.damho;

import com.hospital.dac.Equipement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Module d'hospitalisation mobile (DAMHO).
 */
public class Hospitalisation {
    private final String emplacement;
    private final int capacite;
    private final List<Patient> patients;
    private final List<Equipement> equipements;

    public Hospitalisation(String emplacement, int capacite, List<Equipement> equipements) {
        this.emplacement = emplacement;
        this.capacite = capacite;
        this.equipements = new ArrayList<>(equipements);
        this.patients = new ArrayList<>();
    }

    public boolean admettrePatient(Patient patient) {
        if (patients.size() >= capacite) {
            return false;
        }
        return patients.add(patient);
    }

    public boolean evacuerPatient(String nomPatient) {
        Iterator<Patient> iterator = patients.iterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            if (patient.getNom().equalsIgnoreCase(nomPatient)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void updateEquipements(int niveauInondation) {
        if (niveauInondation > 5) {
            equipements.add(new Equipement(
                    "Pompe haute puissance",
                    "Urgence",
                    1,
                    "Gestion des eaux hautes",
                    false,
                    true));
            equipements.add(new Equipement(
                    "Bateau gonflable",
                    "Transport",
                    1,
                    "Navigation en zone inondée",
                    false,
                    true));
        } else {
            equipements.add(new Equipement(
                    "Barrières anti-inondation",
                    "Prévention",
                    6,
                    "Contrôle des eaux basses",
                    false,
                    true));
        }
    }

    public String getEmplacement() {
        return emplacement;
    }

    public int getCapacite() {
        return capacite;
    }

    public List<Patient> getPatients() {
        return Collections.unmodifiableList(patients);
    }

    public List<Equipement> getEquipements() {
        return Collections.unmodifiableList(equipements);
    }
}
