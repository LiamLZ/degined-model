package com.example.compositemodepattern.design.service.engine;

import com.example.compositemodepattern.design.service.logic.LogicFilter;
import com.example.compositemodepattern.design.service.logic.impl.UserAgeFilter;
import com.example.compositemodepattern.design.service.logic.impl.UserGenderFilter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/1/31 20:33
 * @phone 15524322169
 */
public class EngineConfig {

   static  final Map<String, LogicFilter> logicFilterMap= new HashMap<String, LogicFilter>();

   static
   {
       logicFilterMap.put("userAge", new UserAgeFilter());
       logicFilterMap.put("userGender", new UserGenderFilter());
   }



}
