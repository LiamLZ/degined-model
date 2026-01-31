package com.example.compositemodepattern.design.service.engine;

import com.example.compositemodepattern.design.model.aggregates.TreeRich;
import com.example.compositemodepattern.design.model.vo.EngineResult;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:33
 * @phone 15524322169
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
