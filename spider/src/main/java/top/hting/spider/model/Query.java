package top.hting.spider.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.hting.spider.util.UrlUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Query {

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

    // 页码
    private int page = 1;


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


    public String url() {
        String prefix = "https://search.51job.com/list/";


        StringBuilder query = new StringBuilder("?1=1");
        query.append("&lang=").append(lang);
        query.append("&stype=").append(stype);
        query.append("&postchannel=").append(postchannel);
        query.append("&workyear=").append(workyear);
        query.append("&degreefrom=").append(degreefrom);
        query.append("&jobterm=").append(jobterm);
        query.append("&companysize=").append(companysize);
        query.append("&providesalary=").append(providesalary);
        query.append("&lonlat=").append(lonlat);
        query.append("&radius=").append(radius);
        query.append("&ord_field=").append(ord_field);
        query.append("&confirmdate=").append(confirmdate);
        query.append("&fromType=").append(fromType);
        query.append("&dibiaoid=").append(dibiaoid);
        query.append("&address=").append(address);
        query.append("&line=").append(line);
        query.append("&specialarea=").append(specialarea);
        query.append("&from=").append(from);
        query.append("&welfare=").append(welfare);


        String m = String.format("%s,000000,0000,00,9,99,%s,2,%d.html",
                UrlUtils.urlEncodeTwice(cityCode),UrlUtils.urlEncodeTwice(keyword), page);

        return prefix + m + query.toString();

    }


}
