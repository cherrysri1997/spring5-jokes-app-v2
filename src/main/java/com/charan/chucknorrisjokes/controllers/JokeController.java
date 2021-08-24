package com.charan.chucknorrisjokes.controllers;

import com.charan.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public ModelAndView getJoke(ModelAndView mv) {
        mv.addObject("joke", jokeService.generateJoke());
        mv.setViewName("index");
        return mv;
    }

}
