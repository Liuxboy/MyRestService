package com.github.liuxboy.rest.hello;

import java.io.Serializable;

/**
 * Package: hello <br>
 * Author: liuchundong <br>
 * Date: 2016/12/19 <br>
 * Time: 17:09 <br>
 * Desc:
 */
public class PostGreet implements Serializable {
    private static final long serialVersionUID = -7279670488824737721L;
    private String name;
    private String phoneNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
