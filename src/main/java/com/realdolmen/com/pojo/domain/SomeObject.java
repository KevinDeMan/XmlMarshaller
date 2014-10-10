package com.realdolmen.com.pojo.domain;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by KDAAU95 on 10/10/2014.
 */
@XmlRootElement(name="student")
@XmlAccessorType(XmlAccessType.NONE)
public class SomeObject {

    @XmlAttribute(name="id")
    private int id;
    @XmlElement(name="name")
    private String name;
    @XmlElement(name="surName")
    private String surName;

    public SomeObject() {
    }

    public SomeObject(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public SomeObject(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
