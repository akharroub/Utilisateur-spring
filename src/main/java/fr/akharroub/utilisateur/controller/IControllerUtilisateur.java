package fr.akharroub.utilisateur.controller;

import org.springframework.ui.Model;

import fr.akharroub.utilisateur.domain.Utilisateur;

public interface IControllerUtilisateur {
	
	public String allUtilisateur(Model model);
	
	public String infoUtilisateur(Model model,Integer id);
	
	public String supprimer(Model model,Integer id);
	
	public String ajouterutilisateur(Model model);
	
	public String ajouterutilisateurV(Model model, Utilisateur user);
	
	public String modifierformulaire(Model model, Integer id);
	
	public String validerutilisateur(Model model, Utilisateur u); 

}
