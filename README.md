# Hospital Dev

Projet Java décrivant l'organisation d'une base opérationnelle (DAC) et d'un module d'hospitalisation mobile (DAMHO).
L'objectif est de proposer un dépôt facile à prendre en main et prêt à l'emploi pour exécuter un scénario de démonstration.

## Structure du projet

```
Hospital_Dev/
├── pom.xml
├── README.md
└── src
    └── main
        └── java
            └── com
                └── hospital
                    ├── Main.java
                    ├── commandement
                    │   ├── Commandement.java
                    │   └── ConfigurationType.java
                    ├── dac
                    │   ├── BaseOperationnelle.java
                    │   └── Equipement.java
                    └── damho
                        ├── Hospitalisation.java
                        └── Patient.java
```

## Prérequis

* Java 17 ou version supérieure
* Apache Maven 3.8+

## Compilation

```bash
mvn clean package
```

Cette commande produit un fichier JAR exécutable dans `target/hospital-dev-1.0.0.jar`.

## Exécution du scénario de démonstration

```bash
java -jar target/hospital-dev-1.0.0.jar
```

La sortie illustre un déploiement en configuration de base, la gestion d'une inondation et l'admission d'un patient.

## Personnalisation

* Modifiez `Main.java` pour tester différents scénarios de déploiement.
* Ajoutez de nouveaux équipements via `Commandement#ajouterEquipement`.
* Ajoutez des règles métiers dans `BaseOperationnelle` ou `Hospitalisation` selon vos besoins opérationnels.

## Licence

Ce projet est fourni à titre d'exemple pédagogique.
