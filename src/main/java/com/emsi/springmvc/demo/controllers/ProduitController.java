package com.emsi.springmvc.demo.controllers;


import com.emsi.springmvc.demo.entities.Produit;
import com.emsi.springmvc.demo.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProduitController {

    @Autowired
    ProduitRepository produitRepository;

    @GetMapping("/produits")
    public String listProduits(Model model){

        List<Produit> produits = produitRepository.findAll();
        model.addAttribute("listProduits",produits);
        return "vue";

    }
}
