package com.example.compositemodepattern.design.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:18
 * @phone 15524322169
 */
@Data
public class TreeNode implements Serializable {

    private Long treeId;            //规则树ID
    private Long treeNodeId;        //规则树节点ID
    private Integer nodeType;       //节点类型；1子叶、2果实
    private String nodeValue;       //节点值[nodeType=2]；果实值
    private String ruleKey;         //规则Key
    private String ruleDesc;        //规则描述
    private List<TreeNodeLink> treeNodeLinkList; //节点链路

}
