package fr.akharroub.utilisateur.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.akharroub.utilisateur.domain.Utilisateur;
import fr.akharroub.utilisateur.repository.IRepositoryUtilisateur;
import fr.akharroub.utilisateur.service.IServiceUtilisateur;
@Service
public class ServiceUtilisateur implements IServiceUtilisateur{
	
    @Autowired
	IRepositoryUtilisateur repository ;
	
	@Override
	public List<Utilisateur> findAll() {
		List<Utilisateur> ListedsUsersDedb = repository.findAll();
		return ListedsUsersDedb;
	}

	@Override
	public Utilisateur findOne(Integer id) {
		Utilisateur u = repository.findOne(id);
		return u;
	}

	@Override
	public void supprimerUtilisateur(Integer id) {
		repository.delete(id);
		
	}

}
