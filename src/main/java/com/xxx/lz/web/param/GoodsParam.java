package com.xxx.lz.web.param;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class GoodsParam implements Serializable {

    private String tyid;

    public String getTyid() {
        return tyid;
    }

    public void setTyid(String tyid) {
        this.tyid = tyid;
    }
}
