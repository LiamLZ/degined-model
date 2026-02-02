package com.design;

/**
 * @author lijiabin
 * @version 1.0
 * @date 2026/2/2 21:33
 * @phone 15524322169
 */
public class ConfigMemento {

    private ConfigFile configFile;


    public ConfigMemento(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }
}
