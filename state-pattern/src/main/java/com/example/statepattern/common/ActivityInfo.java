package com.example.statepattern.common;

import com.example.statepattern.enums.Status;
import lombok.Data;

import java.util.Date;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/29 21:31
 * @phone 15524322169
 */
@Data
public class ActivityInfo {

    private String activityId;    // 活动ID
    private String activityName;  // 活动名称
    private Enum<Status> status;  // 活动状态
    private Date beginTime;       // 开始时间
    private Date endTime;         // 结束时间
}
