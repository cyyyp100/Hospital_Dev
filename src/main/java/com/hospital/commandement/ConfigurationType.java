package com.hospital.commandement;

/**
 * Liste des configurations prévues pour le déploiement.
 */
public enum ConfigurationType {
    CONFIGURATION_BASE(12, 42),
    CONFIGURATION_COMPLETE(20, 80);

    private final int capaciteDac;
    private final int capaciteDamho;

    ConfigurationType(int capaciteDac, int capaciteDamho) {
        this.capaciteDac = capaciteDac;
        this.capaciteDamho = capaciteDamho;
    }

    public int getCapaciteDac() {
        return capaciteDac;
    }

    public int getCapaciteDamho() {
        return capaciteDamho;
    }
}
