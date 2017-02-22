package com.bwie.store;

/**
 * 1. 类的用途
 * 2. @author：liqingyi
 * 3. @date：2017/2/20 21:23
 */

public class Urls {

    public static final String BASE_API_URL = "http://service.alinq.cn:2800/UserServices/";
    public static final String GetAdvertItems = BASE_API_URL + "Site/Home/GetAdvertItems";

    /**
     * http://service.alinq.cn:2800/AdminServices/Shop/Images/Editor/96cd99231d704809b03bd7986028f602_360_360.jpeg?application-token=58424776034ff82470d06d3d&storeId=58401d1906c02a2b8877bd13
     *
     * @param url
     * @return
     */
    public static String getImageUrl(String url) {
        return "http://service.alinq.cn:2800/AdminServices/Shop/" + url + "?application-token=58424776034ff82470d06d3d&storeId=58401d1906c02a2b8877bd13";
    }

}
