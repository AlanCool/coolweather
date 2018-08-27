package gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ZVT-110 on 2018/8/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
