package com.juvenileexecutive.jnexapp.model;

import com.juvenileexecutive.jnexapp.R;

import java.util.ArrayList;

public class DataItemDetail {

    public static ArrayList<ItemDetailModel> generateData() {
        ArrayList<ItemDetailModel> detailItems = new ArrayList<>();

        detailItems.add(new ItemDetailModel(
                "Production (Event Collaterals)",
                " With high skilled designers and workforce, Activteam is under the exhibition stands contractors with exhibition stand solutions, quality booth manufacturing for every industry, helping multinational companies and brands to make a successful presentation. Stand designers with expertise and the richness of ideas, our designers create unique custom stands and innovative concepts.",
                R.drawable.productionevent));
        detailItems.add(new ItemDetailModel(
                "Concept & Ideation",
                "The creative process of generating, developing, and communicating new ideas, where and idea is understood as a basic element of thought that can be either visual, concrete, or abstract. JE comprises all stages of a thought cycle, from innovation to development, to actualization. Ideation can be conducted by individuals, organizations, or crowds. ",
                R.drawable.conceptideation));
        detailItems.add(new ItemDetailModel(
                "Communications Planning",
                "Your road map for getting your message delivered to your audience",
                R.drawable.communicationplanning));
        detailItems.add(new ItemDetailModel(
                "Content Strategy",
                "Content strategy focuses on the planning, creation, delivery,, and governance of content",
                R.drawable.creativestrategy));
        detailItems.add(new ItemDetailModel(
                "Brand Activation",
                "Help you increase brand awareness, increase consumer interest in trying products, and build customer relationships",
                R.drawable.brandactivation));
        detailItems.add(new ItemDetailModel(
                "Brand Voice Guide",
                "The most enduring companies have a strong personality and clear sense of purpose. Their message is delivered consistently everywhere they have a presence with an established brand voice. Developing brand recognition with consumers requires consistency and repetition.",
                R.drawable.brandvoiceguide));
        detailItems.add(new ItemDetailModel(
                "Brand Positioning",
                "Help you succeed in creating focus in the minds of consumers as well as strong reasons why consumers should buy products",
                R.drawable.brandpositioning));
        detailItems.add(new ItemDetailModel(
                "Business Modeling",
                "assist you in developing a strategy that will be implemented throughout the organization, process and system",
                R.drawable.businessmodeling));
        detailItems.add(new ItemDetailModel(
                "Company Intro",
                "Assist you in creating an attractive company profile in order to attract investors' attention",
                R.drawable.companyintro));
        detailItems.add(new ItemDetailModel(
                "Manpower",
                "Assisting you in workforce planning is a process of identifying, evaluating, and also planning the fulfillment of HR needs that will occupy certain positions in the company in accordance with predetermined needs standards.",
                R.drawable.manpower));
        detailItems.add(new ItemDetailModel(
                "Marketing Services",
                "Help you in attracting the attention of consumers, maintaining consumers who are all done to meet the needs and desires of a company that runs a business",
                R.drawable.marketingservices) );
        detailItems.add(new ItemDetailModel(
                "Event Management",
                "Help you organize an event from the very beginning and coordinate it with various parties involved in organizing the event so that it can provide success for all parties",
                R.drawable.evenmanagement));
        return detailItems;
    }
}
