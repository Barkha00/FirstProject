package com.example.firstproject.RetrofitHelper;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MultipleResource {

    @SerializedName("product")
    public String product;
    @SerializedName("init")
    public Integer init;
    @SerializedName("dataseries")
    public List<Datum> dataseries = null;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getInit() {
        return init;
    }

    public void setInit(Integer init) {
        this.init = init;
    }

    public List<Datum> getDataseries() {
        return dataseries;
    }

    public void setDataseries(List<Datum> dataseries) {
        this.dataseries = dataseries;
    }

    public class Datum {

        @SerializedName("timepoint")
        public Integer timepoint;
        @SerializedName("cloudcover")
        public Integer cloudcover;
        @SerializedName("seeing")
        public Integer seeing;
        @SerializedName("transparency")
        public Integer transparency;
        @SerializedName("rh2m")
        public Integer rh2m;
        @SerializedName("wind10m")
        public Object wind10m;

        public Integer getTimepoint() {
            return timepoint;
        }

        public void setTimepoint(Integer timepoint) {
            this.timepoint = timepoint;
        }

        public Integer getCloudcover() {
            return cloudcover;
        }

        public void setCloudcover(Integer cloudcover) {
            this.cloudcover = cloudcover;
        }

        public Integer getSeeing() {
            return seeing;
        }

        public void setSeeing(Integer seeing) {
            this.seeing = seeing;
        }

        public Integer getTransparency() {
            return transparency;
        }

        public void setTransparency(Integer transparency) {
            this.transparency = transparency;
        }

        public Integer getRh2m() {
            return rh2m;
        }

        public void setRh2m(Integer rh2m) {
            this.rh2m = rh2m;
        }

        public Object getWind10m() {
            return wind10m;
        }

        public void setWind10m(Object wind10m) {
            this.wind10m = wind10m;
        }
    }

}