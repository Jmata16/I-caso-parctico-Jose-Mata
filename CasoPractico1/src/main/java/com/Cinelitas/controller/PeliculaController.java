package com.Cinelitas.controller;

import com.Cinelitas.entity.Sala;
import com.Cinelitas.entity.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.Cinelitas.service.ISalaService;
import com.Cinelitas.service.IPeliculaService;

/**
 *
 * @author jdmat
 */
@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    @Autowired
    private ISalaService salaService; 
    
    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAll();
        model.addAttribute("titulo", "Cinelitas Cartelera");
        model.addAttribute("peliculas", listaPelicula);
        return "peliculas";
    }   
    @GetMapping("/peliculaN")
    public String crearLugar(Model model) {
        List<Sala> listaSalas = salaService.listHall();
        model.addAttribute("pelicula", new Pelicula());
        model.addAttribute("salas", listaSalas);
        return "crear";
    }    
    @GetMapping("/delete/{id}")
    public String eliminarPelicula(@PathVariable("id") Long idPelicula) {
        peliculaService.delete(idPelicula);
        return "redirect:/pelicula";
    }    
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }    
    @GetMapping("/editPelicula/{id}")
    public String editPelicula(@PathVariable("id") Long idPelicula, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaById(idPelicula);
        List<Sala> listaSalas = salaService.listHall();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("salas", listaSalas);
        return "crear";
    }  
}
