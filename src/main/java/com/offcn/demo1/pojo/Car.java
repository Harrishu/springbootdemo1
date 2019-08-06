package com.offcn.demo1.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data //get set
@AllArgsConstructor //所有参数的有参构造函数
@NoArgsConstructor //无参构造函数
public class Car {
    private int id;
    private String name;
    private String color;

}
