package com.parallel.scrapping;

import bigdata.ConsumerReview;
import bigdata.JsonOutputView;


import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import webscrapper.AmazonWebScrapper;

public class WorkerThread implements Runnable {

    private Logger LOGGER = Logger.getLogger(WorkerThread.class);

    private final ObjectMapper mapper = new ObjectMapper();

    private String jsonObject;
    private String filename;
    
    public WorkerThread(String s, String filename) {
    	this.filename=filename;
        this.jsonObject = s;
    }

    @Override
    public void run() {
        try {
        	String categoryname=filename;
            ConsumerReview consumerReview = mapper.readValue(jsonObject, ConsumerReview.class);
            String region= new AmazonWebScrapper().getCustomerLocationByProfileId(consumerReview.getReviewerID());
            if(region!=null) {
            int fin = region.indexOf("|");
            if (fin != -1) {
                region = region.substring(fin + 2, region.length());
            }
            consumerReview.setRegion(region);
            JsonOutputView res = new JsonOutputView();
            res.setRegion(region);
            res.setCategoryname(categoryname);
            res.setOverall(consumerReview.getOverall());
            res.setReviewerID(consumerReview.getReviewerID());
            res.setReviewTime(consumerReview.getReviewTime());
            res.setReviewText(consumerReview.getReviewText());
            res.setSummary(consumerReview.getSummary());
            res.setUnixReviewTime(consumerReview.getUnixReviewTime());
            LOGGER.info(mapper.writeValueAsString(res));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    @Override
    public String toString() {
        return this.jsonObject;
    }
}