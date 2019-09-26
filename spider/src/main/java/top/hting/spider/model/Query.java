package top.hting.spider.model;

import lombok.Data;

@Data
public class Query  {

    // 查询关键字
    private String keyword;
    // 地点编号代码
    private String cityCode;

    // 行业代码
    private String indtype_code;
    // 职能代码
    private String funtype_code;
    // 发布日期
    private String publishDateCode;
    // 月薪范围
    private String moneyCode;


    private String lang = "c";
    private String stype = "";
    private String postchannel = "0000";
    private String workyear = "99";
    private String cotype = "99";
    private String degreefrom = "99";
    private String jobterm = "99";
    private String companysize = "99";
    private String providesalary = "99";
    private String lonlat = "0,0";
    private String radius = "-1";
    private String ord_field = "0";
    private String confirmdate = "9";
    private String fromType = "";
    private String dibiaoid = "0";
    private String address = "";
    private String line = "";
    private String specialarea = "00";
    private String from = "";
    private String welfare = "";


}
