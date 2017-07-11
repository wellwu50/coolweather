package org.well.coolwearher.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zz on 2017/7/11.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
