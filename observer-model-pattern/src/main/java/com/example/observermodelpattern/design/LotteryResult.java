package com.example.observermodelpattern.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/1 20:39
 * @phone 15524322169
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LotteryResult {

    private String uId;    // 用户ID
    private String msg;    // 摇号信息
    private Date dateTime; // 业务时间

}
