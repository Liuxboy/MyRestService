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
    private Long id;
    private String name;
    private String phone;
    private String sex;
    private String address;
    private String code;
    private Long did;
    private Long pid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}
