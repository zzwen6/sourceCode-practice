package top.hting.spider.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class JobEntity implements Serializable {

    private String url;

    private String company;

    private String jobName;

    private String publishDate;

    private String money;

    private String jobInfo;


}
