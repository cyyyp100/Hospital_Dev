package com.hospital.damho;

import java.util.Objects;

/**
 * Patient pris en charge par le module d'hospitalisation mobile (DAMHO).
 */
public class Patient {
    private final int id;
    private final String nom;

    public Patient(int id, String nom) {
        this.id = id;
        this.nom = Objects.requireNonNull(nom, "Le nom du patient est requis");
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
}
