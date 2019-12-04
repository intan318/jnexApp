package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataProductsTechnoloje {

    public static ArrayList<TechnolojeModel> generateDataTechnoloje() {
        ArrayList<TechnolojeModel> detailProductTechnoloje= new ArrayList<>();

        detailProductTechnoloje.add(new TechnolojeModel(
                "Digital Marketing",
                "We have particular depth of experience in startup, design and manufacturing environments, part marking and eBusiness processes, but our methods and services are applicable wherever computers, data and people come together to make a business run better.",
                R.drawable.digitalmarketing));
        detailProductTechnoloje.add(new TechnolojeModel(
                "Mobile Application Development",
                " With high skilled designers and workforce, Activteam is under the exhibition stands contractors with exhibition stand solutions, quality booth manufacturing for every industry, helping multinational companies and brands to make a successful presentation. Stand designers with expertise and the richness of ideas, our designers create unique custom stands and innovative concepts.",
                R.drawable.appdevelopment));
        return detailProductTechnoloje;
    }
}
