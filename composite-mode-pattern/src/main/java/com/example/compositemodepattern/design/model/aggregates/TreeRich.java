package com.example.compositemodepattern.design.model.aggregates;

import com.example.compositemodepattern.design.model.vo.TreeNode;
import com.example.compositemodepattern.design.model.vo.TreeRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:15
 * @phone 15524322169
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeRich {

    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;
}
