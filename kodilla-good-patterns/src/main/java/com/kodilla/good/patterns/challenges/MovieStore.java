package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStore {

    public static void main(String[] args) {
        String text = getMovies()
                .entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(text);
    }

    public static Map<String, List<String>> getMovies() {

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        Map<String, List<String>> movieTitlesWithTranslations = new HashMap<>();
        movieTitlesWithTranslations.put("IM", ironManTranslations);
        movieTitlesWithTranslations.put("AV", avengersTranslations);
        movieTitlesWithTranslations.put("FL", flashTranslations);

        return movieTitlesWithTranslations;
    }
}
