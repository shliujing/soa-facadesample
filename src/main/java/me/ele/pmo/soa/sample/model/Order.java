package me.ele.pmo.soa.sample.model;

/**
 * Created by leo on 06/02/2017.
 */

public class Order {
    private int id;
    private String name;
    private int code;

    public Order(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public Order() {

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

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
