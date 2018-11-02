package com.charles.jsp;

import java.io.Serializable;

public class Survey implements Serializable{
    private String[] languages;
    private String[] ides;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String[] getIdes() {
        return ides;
    }

    public void setIdes(String[] ides) {
        this.ides = ides;
    }
}
