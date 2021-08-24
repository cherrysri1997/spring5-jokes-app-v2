package com.charan.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String generateJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
