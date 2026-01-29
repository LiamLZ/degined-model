package com.example.statepattern.pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/29 21:20
 * @phone 15524322169
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Result implements Serializable {

    /**
     * 编码
     */
    private String code;

    /**
     * 描述
     */
    private String info;
}
