package com.cg.webservices.controllers;

import com.cg.dao.Photo;
import com.cg.dao.Photos;
import com.cg.generators.RecommendationGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoRestController {

    @RequestMapping(method = RequestMethod.GET, value = "/tags" )
    public @ResponseBody List<Photo> flickrPhotosWithTags(String tag){
        RecommendationGenerator generator = new RecommendationGenerator();
        return generator.generatePhotosBasedOnTag(tag);
    }
/*
    @RequestMapping(method = RequestMethod.GET, value = "/text" )
    public @ResponseBody List<Photo> flickrPhotosWithText(String text){

    }

    @RequestMapping(method = RequestMethod.GET, value = "/geoloc" )
    public @ResponseBody List<Photo> flickrPhotosWithLatLon(String latitude, String longitude){

    }*/
}