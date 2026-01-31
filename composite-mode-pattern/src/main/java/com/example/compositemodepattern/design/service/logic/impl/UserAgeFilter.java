package com.example.compositemodepattern.design.service.logic.impl;

import com.example.compositemodepattern.design.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:23
 * @phone 15524322169
 */

public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
