package com.tp3;

public class Test {
    public static void main(String[] args) {
        EmployeCommission e1 = new EmployeCommission("Boussaid", "Meriem", 15000, 20, 50);
        EmployeFixe e2 = new EmployeFixe("Omar", "Hafsa", 25000);
        EmployeHoraire e3 = new EmployeHoraire("Boutheldja", "Kaouther", 40, 8);
        System.out.println("\nFirst employee is: " + e1.getNom() + " " + e1.getPrenom());
        System.out.println("Salary of the first employee: " + e1.calcSalary() + "DA");
        System.out.println("\nSecond employee is :" + e2.getNom() + " " + e2.getPrenom());
        System.out.println("Salary of the second employee: " + e2.calcSalary() + " DA");
        System.out.println("\nThird employee is:" + e3.getNom() + " " + e3.getPrenom());
        System.out.println("Salary of the third employee: " + e3.calcSalary() + " DA");

        Entreprise entreprise = new Entreprise();
        Employe[] tab_Employes = new Employe[3];
        tab_Employes[0] = e1;
        tab_Employes[1] = e2;
        tab_Employes[2] = e3;

        System.out.println("\nSalaire moyenne est: " + entreprise.moyenne(tab_Employes) + " DA");
    }
}
