package com.example.compositemodepattern.design.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:18
 * @phone 15524322169
 */
@Data
public class TreeNodeLink  implements Serializable {

    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private Integer ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]
    private String ruleLimitValue;  //限定值

}