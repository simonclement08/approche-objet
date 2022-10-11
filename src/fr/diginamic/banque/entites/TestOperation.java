package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Credit credit1 = new Credit("24/02/2019", 50.0);
		Credit credit2 = new Credit("27/12/2022", 150.99);

		Debit debit1 = new Debit("15/03/2020", 15.0);
		Debit debit2 = new Debit("07/11/2022", 89.99);
		
		Operation[] operations = {credit1,debit1,debit2,credit2};
		
		double total = 0;
		
		for (int i = 0; i < operations.length; i++) {
			System.out.println("Date : " + operations[i].getDate());
			System.out.println("Montant : " + operations[i].getMontant());
			System.out.println("Type : " + operations[i].getType());
			if(operations[i].getType() == "CREDIT") {
				total += operations[i].getMontant();
			} else if(operations[i].getType() == "DEBIT") {
				total -= operations[i].getMontant();
			}
		}
		System.out.println("Montant total : " + total);

	}

}
