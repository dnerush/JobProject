package com.work.web;

import com.work.Addition.FoundVacancy;
import com.work.Addition.Parser;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        List<FoundVacancy> list =  new Parser().getVacancies("Manager", 1);

        list.forEach(System.out::println);
    }
}



