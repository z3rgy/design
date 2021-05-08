package com.company.design.proxy;

public class Browser implements IBrowser{

    private String url;

    public Browser(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        System.out.println("Browser loading HTML from : "+url);
        return new Html(url);
    }
}
