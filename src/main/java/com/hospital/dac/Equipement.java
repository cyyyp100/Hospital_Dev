package com.hospital.dac;

import java.util.Objects;

/**
 * Représente un matériel utilisable par les unités DAC ou DAMHO.
 */
public class Equipement {
    private final String nom;
    private final String type;
    private final int quantiteDisponible;
    private final String conditionCritiqueRequise;
    private final boolean flottable;
    private final boolean enBonEtat;

    public Equipement(
            String nom,
            String type,
            int quantiteDisponible,
            String conditionCritiqueRequise,
            boolean flottable,
            boolean enBonEtat) {
        this.nom = Objects.requireNonNull(nom, "Le nom de l'équipement est requis");
        this.type = Objects.requireNonNull(type, "Le type d'équipement est requis");
        this.quantiteDisponible = quantiteDisponible;
        this.conditionCritiqueRequise = Objects.requireNonNull(
                conditionCritiqueRequise,
                "La condition critique est requise");
        this.flottable = flottable;
        this.enBonEtat = enBonEtat;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getQuantiteDisponible() {
        return quantiteDisponible;
    }

    public String getConditionCritiqueRequise() {
        return conditionCritiqueRequise;
    }

    public boolean isFlottable() {
        return flottable;
    }

    public boolean isEnBonEtat() {
        return enBonEtat;
    }

    @Override
    public String toString() {
        return "%s (%s) - %d unités".formatted(nom, type, quantiteDisponible);
    }
}
