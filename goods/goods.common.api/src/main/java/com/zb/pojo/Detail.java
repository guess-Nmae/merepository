package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Detail implements Serializable {
    //
    private Integer id;
    //
    private Sort sortId;
    //
    private String name;
    //
    private String address;
    //
    private Double price;
    //
    private Date createDate;
    //
    private Integer remaining;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setSortId (Sort  sortId){
        this.sortId=sortId;
    }
    public  Sort getSortId(){
        return this.sortId;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setPrice (Double  price){
        this.price=price;
    }
    public  Double getPrice(){
        return this.price;
    }
    public void setCreateDate (Date  createDate){
        this.createDate=createDate;
    }
    public  Date getCreateDate(){
        return this.createDate;
    }
    public void setRemaining (Integer  remaining){
        this.remaining=remaining;
    }
    public  Integer getRemaining(){
        return this.remaining;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", sortId=" + sortId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", createDate=" + createDate +
                ", remaining=" + remaining +
                '}';
    }
}
