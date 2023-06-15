package com.ohyoung.bean;

import java.time.LocalDateTime;

/**
 * @author vince
 * @date 2023/6/15 11:36
 */
public class Family {

    private String fatherName;

    private String sonName;

    private String matherName;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public String getMatherName() {
        return matherName;
    }

    public void setMatherName(String matherName) {
        this.matherName = matherName;
    }
}
