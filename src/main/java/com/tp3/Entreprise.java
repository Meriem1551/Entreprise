package com.tp3;

public class Entreprise {

    public float moyenne(Employe[] employes) {
        float sum_salaire = 0;
        for (Employe e : employes) {
            if (e != null) {
                sum_salaire += e.calcSalary();
            }
        }
        return (sum_salaire / employes.length);
    }
}