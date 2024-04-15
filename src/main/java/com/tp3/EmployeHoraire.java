package com.tp3;

public class EmployeHoraire extends Employe {
    private String nom, prenom;
    private float taux_horaire;
    private int nb_heures;

    public EmployeHoraire(String nom, String prenom, float taux_horaire, int nb_heures) {
        super(nom, prenom);
        this.taux_horaire = taux_horaire;
        this.nb_heures = nb_heures;
    }

    public void setNom(String nom) {
        super.setNom(nom);
    }

    public String getNom() {
        return super.getNom();
    }

    public void setPrenom(String prenom) {
        super.setPrenom(prenom);
    }

    public String getPrenom() {
        return super.getPrenom();
    }

    public float calcSalary() {
        return (this.taux_horaire * this.nb_heures);
    }

}