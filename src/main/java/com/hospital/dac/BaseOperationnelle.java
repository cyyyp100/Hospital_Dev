package com.hospital.dac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Unité de déploiement avancée (DAC) responsable des opérations sur le terrain.
 */
public class BaseOperationnelle {
    private final String emplacement;
    private final int capacite;
    private final List<Equipement> equipements;
    private boolean operationnelle;

    public BaseOperationnelle(String emplacement, int capacite, List<Equipement> equipements) {
        this.emplacement = emplacement;
        this.capacite = capacite;
        this.equipements = new ArrayList<>(equipements);
        this.operationnelle = true;
    }

    public void updateEquipements(int niveauInondation) {
        if (niveauInondation > 5) {
            equipements.add(new Equipement(
                    "Pompe haute puissance",
                    "Urgence",
                    2,
                    "Gestion des eaux hautes",
                    true,
                    true));
            equipements.add(new Equipement(
                    "Bateau gonflable",
                    "Transport",
                    1,
                    "Navigation en zone inondée",
                    true,
                    true));
        } else {
            equipements.add(new Equipement(
                    "Barrières anti-inondation",
                    "Prévention",
                    10,
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

    public List<Equipement> getEquipements() {
        return Collections.unmodifiableList(equipements);
    }

    public boolean isOperationnelle() {
        return operationnelle;
    }

    public void setOperationnelle(boolean operationnelle) {
        this.operationnelle = operationnelle;
    }
}
