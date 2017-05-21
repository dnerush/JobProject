package com.work.Addition;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sky_el on 02.05.2017.
 */
public class Parser {

    public List<FoundVacancy> getVacancies(String keyword, int page) throws IOException {
        List<String> links = getVacancyFromWEB(keyword, page);
        return getVacancyInformation(links);
    }

    //method for get all links to vacancies on one page (print links to vacancy)
    private List<String> getVacancyFromWEB(String keyword, int page) throws IOException {
        List<String> listOfVacanciesUrl = new ArrayList<>();
        String url = "https://www.work.ua/jobs-kharkiv-" + keyword + "/?page=" + page;
        Document doc = Jsoup.connect(url).get();
        Elements elementsByTag = doc.getElementsByTag("h2");

        for (Element element1 : elementsByTag) {
            if(!element1.getElementsByTag("a").attr("href").equals("")){
                listOfVacanciesUrl.add(element1.getElementsByTag("a").attr("abs:href"));
            }
        }
        return listOfVacanciesUrl;
    }

    //Method that returns prints full information of vacancy
    private List<FoundVacancy> getVacancyInformation(List<String> links) throws IOException {
        List<FoundVacancy> foundVacancies = new ArrayList<>();
        for(String link : links) {
            FoundVacancy foundVacancy = new FoundVacancy();
            String nameCompany = "";
            String name = "";
            String description = "";
            String logoPath = "";
            String date = "";

            Document doc = Jsoup.connect(link).get();
            Elements element = doc.getElementsByClass("card");

            // get description
            for (Element e : element) {
                Elements descript = e.getElementsByClass("overflow");

                for (Element d : descript) {
                    description = d.getAllElements().text();
                }

                // get company name
                Elements companyNameContainer = e.getElementsByTag("dd");
                for (Element companyName : companyNameContainer) {
                    if(!companyName.getElementsByTag("b").text().equals("")) {
                        nameCompany = companyName.getElementsByTag("b").text();
                    }
                }

                //get name
                if(!e.getElementsByTag("h1").text().equals("")){
                    name = e.getElementsByTag("h1").text();
                }

                // get logo
                Elements logo = doc.getElementsByClass("logo-job");
                for (Element logos : logo)
                {
                    Elements srcs = logos.select("[src]");
                    for (Element src : srcs) {
                        if (src.tagName().equals("img")) {
                            logoPath = src.attr("abs:src");
                        }
                    }
                }

                // get logo
                Elements addTop = doc.getElementsByClass("add-top");
                for (Element logos : addTop)
                {
                    Elements spans = logos.getElementsByTag("span");
                    //Elements spans = logos.select("[span]");
                    for (Element span : spans) {
                        Elements dates = span.getElementsByClass("text-muted");
                        for (Element _date : dates) {
                            date = _date.getAllElements().text();
                        }
                    }
                }
            }


            foundVacancy.setSourceLink(link);
            foundVacancy.setName(name);
            foundVacancy.setCompanyName(nameCompany);
            foundVacancy.setDescription((description.length() > 1200 ? description.substring(0, 1200) : description) + "...");
            foundVacancy.setLogoPath(logoPath);
            foundVacancy.setDate(date);
            // если в списке нет такой вакансии - добавляем в список
            if(!foundVacancies.contains(foundVacancy))
                foundVacancies.add(foundVacancy);
        }
        return foundVacancies;
    }
}







