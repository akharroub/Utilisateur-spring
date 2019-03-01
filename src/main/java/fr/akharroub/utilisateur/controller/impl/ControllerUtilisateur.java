package fr.akharroub.utilisateur.controller.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.akharroub.utilisateur.controller.IControllerUtilisateur;
import fr.akharroub.utilisateur.domain.Utilisateur;
import fr.akharroub.utilisateur.service.impl.ServiceUtilisateur;
@Controller
public class ControllerUtilisateur implements IControllerUtilisateur{
	@Autowired
	ServiceUtilisateur service ;
	
	@Override
	@RequestMapping("/utilisateurs")
	public String allUtilisateur(Model model) {
		List<Utilisateur> liste = service.findAll();
		model.addAttribute("utilisateur", liste);
		return "utilisateur";
	}

	@Override
	@RequestMapping("/utilisateur-info")
	public String infoUtilisateur(Model model,Integer id) {
		Utilisateur user = service.findOne(id);
		model.addAttribute("utilisateur", user);
		return "utilisateur-info";
	}

	@Override
	@RequestMapping("/supprimer")
	public String supprimer(Model model,@RequestParam("id") Integer id) {
		service.supprimerUtilisateur(id);
		return "redirect:/utilisateurs";
	}

	@Override
	@GetMapping("/ajouter")
	public String ajouterutilisateur(Model model) {
		Utilisateur m = new Utilisateur();
		model.addAttribute("u", m);
		return "ajouter-utilisateu-f";
	}

	@Override
	@PostMapping("ajouter-user")
	public String ajouterutilisateurV(Model model,@ModelAttribute Utilisateur u) {
		service.ajouterutilisateur(u);
		return "redirect:/utilisateurs";
	}

	@Override
	@GetMapping("/modifier")
	public String modifierformulaire(Model model,@RequestParam("id") Integer id) {
		Utilisateur m = service.findOne(id);
		model.addAttribute("u", m);
		
		return "modifier-utilisateur-formulaire";
	}

	@Override
	@PostMapping("/modifier-user")
	public String validerutilisateur(Model model,@ModelAttribute Utilisateur u) {
		service.modefierutilisateur(u);
		return "redirect:/utilisateurs";
	}

}
