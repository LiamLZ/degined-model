package com.example.compositemodepattern.design.service.engine.impl;

import com.example.compositemodepattern.design.model.aggregates.TreeRich;
import com.example.compositemodepattern.design.model.vo.EngineResult;
import com.example.compositemodepattern.design.model.vo.TreeNode;
import com.example.compositemodepattern.design.service.engine.EngineBase;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:44
 * @phone 15524322169
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());

    }
}
