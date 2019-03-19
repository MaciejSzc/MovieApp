package pl.maciejszczesny.movie_app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.maciejszczesny.movie_app.models.repositories.MovieRepository;

@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/")
    public String movie(Model model){

        return "movie_show";
    }

    @GetMapping("/long")
    public String movieL(Model model){

        return "movie_show_long";
    }


}

