package com.example.statepattern.enums;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/29 21:28
 * @phone 15524322169
 */

public enum Status {
    /**
     * 1创建编辑
     */
    Editing,

    /**
     * 2待审核
     */
    Check,

    /**
     * 3审核通过(任务扫描成活动中)
     */
    Pass,

    /**
     * 4审核拒绝(可以撤审到编辑状态)
     */
    Refuse,

    /**
     * 5活动中
     */
    Doing,

    /**
     * 6活动关闭
     */
    Close,

    /**
     * 7活动开启(任务扫描成活动中)
     */
    Open,
}
