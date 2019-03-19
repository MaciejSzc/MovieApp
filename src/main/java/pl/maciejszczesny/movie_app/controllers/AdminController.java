package pl.maciejszczesny.movie_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.maciejszczesny.movie_app.models.forms.MovieForm;
import pl.maciejszczesny.movie_app.models.repositories.MovieRepository;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/admin")
    public String admin(@Valid MovieForm movieForm, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("warn", "Wprowadź poprawne dane.");
            return "admin";
        }
            return "admin";
    }

    @PostMapping("/admin")
    public String addMovie(Model model){


        return "admin";
    }

}
