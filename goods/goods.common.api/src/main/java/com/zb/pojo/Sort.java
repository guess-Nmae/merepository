package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Sort implements Serializable {
    //
    private Integer id;
    //
    private String name;
    //get set 方法
    public void setId (Integer  id){
        this.id=id;
    }
    public  Integer getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Sort{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
