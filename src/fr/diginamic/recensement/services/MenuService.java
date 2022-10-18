package fr.diginamic.recensement.services;

import java.util.Scanner;

import fr.diginamic.recensement.components.Recensement;

public abstract class MenuService {
	
	public abstract void traiter(Recensement recensement, Scanner scanner);
	
}