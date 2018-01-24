package com.cg.dao;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Photo extends AbstractPhotoDomainObject {
    private String id;
    private String owner;
    private String secret;
    private String server;
    private String title;
    private Boolean isPublic;
    private Boolean isFriend;
    private Boolean isFamily;
    private String tags;
    private GeoLocation geoLocation;
    private Boolean displayThis;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getFriend() {
        return isFriend;
    }

    public void setFriend(Boolean friend) {
        isFriend = friend;
    }

    public Boolean getFamily() {
        return isFamily;
    }

    public void setFamily(Boolean family) {
        isFamily = family;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }

    public Boolean getDisplayThis() {
        return displayThis;
    }

    public void setDisplayThis(Boolean displayThis) {
        this.displayThis = displayThis;
    }
}
