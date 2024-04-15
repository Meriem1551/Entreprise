package com.tp3;

public class EmployeFixe extends Employe {
    private String nom, prenom;
    private float salaire;

    public EmployeFixe(String nom, String prenom, float salaire) {
        super(nom, prenom);
        this.salaire = salaire;
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
        return this.salaire;
    }
}