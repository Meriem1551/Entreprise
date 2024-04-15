package com.tp3;

public class EmployeCommission extends Employe {
    private String nom, prenom;
    private float salaire_base, ventes, pourcentage;

    public EmployeCommission(String nom, String prenom, float salaire_base, float ventes, float pourcentage) {
        super(nom, prenom);
        this.salaire_base = salaire_base;
        this.ventes = ventes;
        this.pourcentage = pourcentage / 100;
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
        return (this.salaire_base + this.ventes * this.pourcentage);
    }
}