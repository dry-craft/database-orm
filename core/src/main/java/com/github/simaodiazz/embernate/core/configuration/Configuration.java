package com.github.simaodiazz.embernate.core.configuration;

import com.github.simaodiazz.embernate.core.DatabaseType;
import lombok.Data;

@Data
public abstract class Configuration {

    private DatabaseType type;
    private String url;
    private String username;
    private String password;

    private boolean testOnBorrow;
    private boolean testConnection;

}
