package top.hting.spider.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UrlPath implements Serializable {

    private String url;

    private String company;

    private String publishDate;




}
