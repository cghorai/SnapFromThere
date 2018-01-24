package com.cg.generators;

import com.cg.dao.Photo;
import com.cg.webservices.comsumers.FlickrWebServiceConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RecommendationGenerator {
    private static final Logger LOGGER = LoggerFactory.getLogger(RecommendationGenerator.class);


    public List<Photo> generatePhotosBasedOnTag(String tag){
        List<Photo> filteredPhotos = new ArrayList<Photo>();
        filteredPhotos = filterPhotos(new FlickrWebServiceConsumer().getAllPhotosUsingTag(tag).getPhoto());
        return filteredPhotos;
    }

    /**
     * This method will contain the business logic to filter the result
     */
    private static List<Photo> filterPhotos(List<Photo> bulkPhotos){
        return bulkPhotos;
    }

}
