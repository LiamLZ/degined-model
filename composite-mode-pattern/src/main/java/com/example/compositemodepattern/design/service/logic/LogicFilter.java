package com.example.compositemodepattern.design.service.logic;

import com.example.compositemodepattern.design.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:23
 * @phone 15524322169
 */
public interface LogicFilter {


    Long filter(String matterValue, List<TreeNodeLink> treNodeLineInfoList);


    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
