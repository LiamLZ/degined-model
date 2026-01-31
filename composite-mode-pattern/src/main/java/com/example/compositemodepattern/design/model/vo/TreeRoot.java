package com.example.compositemodepattern.design.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:19
 * @phone 15524322169
 */
@Data
public class TreeRoot  implements Serializable {

    private Long treeId;         //规则树ID
    private Long treeRootNodeId; //规则树根ID
    private String treeName;     //规则树名称


}