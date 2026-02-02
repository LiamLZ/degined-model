package com.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/2 21:26
 * @phone 15524322169
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConfigFile {

    private String versionNo; // 版本号
    private String content;   // 内容
    private Date dateTime;    // 时间
    private String operator;  // 操作人
}
