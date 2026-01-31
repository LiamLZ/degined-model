package com.example.compositemodepattern.design.service.logic;

import com.example.compositemodepattern.design.model.vo.TreeNodeLink;

import javax.swing.tree.TreeNode;
import java.util.List;
import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:23
 * @phone 15524322169
 */
public abstract class BaseLogic implements LogicFilter {


    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treNodeLineInfoList) {
        for (TreeNodeLink nodeLink : treNodeLineInfoList)
        {
            if (decisionLogic(matterValue, nodeLink)) {
                return nodeLink.getNodeIdTo();
            }
        }
        return 0L;
    }

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return null;
    }


    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }

    }
}
