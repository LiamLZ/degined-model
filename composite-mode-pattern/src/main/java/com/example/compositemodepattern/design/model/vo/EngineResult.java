package com.example.compositemodepattern.design.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:11
 * @phone 15524322169
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineResult implements Serializable {


    private boolean isSuccess; //执行结果
    private String userId;   //用户ID
    private Long treeId;     //规则树ID
    private Long nodeId;   //果实节点ID
    private String nodeValue;//果实节点值


    public EngineResult(String userId, Long treeId, Long treeNodeId, String nodeValue) {

    }
}
