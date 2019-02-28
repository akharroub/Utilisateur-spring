package fr.akharroub.utilisateur.service;


import java.util.List;

import fr.akharroub.utilisateur.domain.Utilisateur;

public interface IServiceUtilisateur {
	public List<Utilisateur> findAll();
	public Utilisateur findOne(Integer id);
	public void  supprimerUtilisateur(Integer id);

}
