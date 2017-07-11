package org.well.coolwearher.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zz on 2017/7/11.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
