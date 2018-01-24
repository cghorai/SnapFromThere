package com.cg.webservices.comsumers;

import com.cg.dao.Photos;
import com.cg.utilities.PropertyUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class FlickrWebServiceConsumer implements WebServiceConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlickrWebServiceConsumer.class);
    private static final String FLICKR_WS_URI = "http://www.flickr.com/services/rest?method=";

    public Photos  getAllPhotosUsingTag(String tag) {
        String url = buildPhotoSearchUrlWithMethodTag("flickr.photos.search", tag);
        RestTemplate restTemplate = new RestTemplate();
        Photos photos = restTemplate.getForObject(url, Photos.class);
        return photos;
    }

    public String buildPhotoSearchUrlWithMethodTag(String method,String tag) {

        PropertyUtil propertyUtil = new PropertyUtil("app.properties");
        String apiKey = "";
        try {
            apiKey = propertyUtil.getValue("flickr.api.key");
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder(FLICKR_WS_URI)
                .append(method)
                .append("&api+key=").append(apiKey)
                .append("&tags=").append(tag)
                .append("&per_page=").append("10");
        return sb.toString();
    }


    public String buildPhotoSearchUrlWithLatLong(String method, String apiKey, String latitude, String longitude, String radius, String searchText, String contentType) {
        return "";
    }
}
