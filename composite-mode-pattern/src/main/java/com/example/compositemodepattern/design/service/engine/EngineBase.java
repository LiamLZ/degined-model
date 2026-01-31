package com.example.compositemodepattern.design.service.engine;

import com.example.compositemodepattern.design.model.aggregates.TreeRich;
import com.example.compositemodepattern.design.model.vo.EngineResult;
import com.example.compositemodepattern.design.model.vo.TreeNode;
import com.example.compositemodepattern.design.model.vo.TreeRoot;
import com.example.compositemodepattern.design.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:35
 * @phone 15524322169
 */
public abstract class EngineBase extends EngineConfig implements IEngine{

    Logger logger= LoggerFactory.getLogger(EngineBase.class);

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);

    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();

        Long rootNodeId = treeRoot.getTreeRootNodeId();

        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);

        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);



        }

        return treeNodeInfo;

    }
}
