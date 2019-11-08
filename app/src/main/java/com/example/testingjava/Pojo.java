package com.example.testingjava;

public class Pojo {
    public String name, salary, img;
    int img1;
    public Pojo()
    {

    }

    public Pojo(String name, String salary, int img1) {
        this.name = name;
        this.salary = salary;
        //this.img = img;
        this.img1 = img1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getImg1() {
        return img1;
    }

    public void setImg1(int img1) {
        this.img1 = img1;
    }
}
