package fr.akharroub.utilisateur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.akharroub.utilisateur.domain.Utilisateur;

@Repository
public interface IRepositoryUtilisateur extends JpaRepository<Utilisateur, Integer>{

}
