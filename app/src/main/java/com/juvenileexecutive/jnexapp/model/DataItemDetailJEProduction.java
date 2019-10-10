package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataItemDetailJEProduction {

    public static ArrayList<ItemDetailModel> generateData() {
        ArrayList<ItemDetailModel> detailItems = new ArrayList<>();

        detailItems.add(new ItemDetailModel(
                "Booth for Exhibition/Event",
                " With high skilled designers and workforce, Activteam is under the exhibition stands contractors with exhibition stand solutions, quality booth manufacturing for every industry, helping multinational companies and brands to make a successful presentation. Stand designers with expertise and the richness of ideas, our designers create unique custom stands and innovative concepts.",
                R.drawable.ic_launcher_background));
        detailItems.add(new ItemDetailModel(
                "Concept & Ideation",
                "The creative process of generating, developing, and communicating new ideas, where and idea is understood as a basic element of thought that can be either visual, concrete, or abstract. JE comprises all stages of a thought cycle, from innovation to development, to actualization. Ideation can be conducted by individuals, organizations, or crowds. ",
                R.drawable.ic_launcher_background));
        detailItems.add(new ItemDetailModel(
                "Communications Planning",
                "Your road map for getting your message delivered to your audience",
                R.drawable.ic_launcher_background));
        detailItems.add(new ItemDetailModel(
                "Content Strategy",
                "Content strategy focuses on the planning, creation, delivery,, and governance of content",
                R.drawable.ic_launcher_background));

        return detailItems;
    }
}
