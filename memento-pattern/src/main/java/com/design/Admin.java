package com.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/2 21:36
 * @phone 15524322169
 */
public class Admin {

    private int cursorIdx=0;

    private List<ConfigMemento> mementoList=new ArrayList<>();
    private Map<String,ConfigMemento> mementoMap=new ConcurrentHashMap<>();


    public void append(ConfigMemento memento)
    {
        mementoList.add(memento);

        mementoMap.put(memento.getConfigFile().getVersionNo(),memento);

        cursorIdx++;
    }

    public ConfigMemento undo()
    {
        if((cursorIdx-1)<=0)
        {
            return mementoList.get(cursorIdx);
        }
        return mementoList.get(--cursorIdx);
    }

    public ConfigMemento redo()
    {
        if((cursorIdx+1)>=mementoList.size())
        {
            return mementoList.get(cursorIdx);
        }
        return mementoList.get(++cursorIdx);
    }


    public ConfigMemento get(String versionNo)
    {
        return mementoMap.get(versionNo);
    }





}
