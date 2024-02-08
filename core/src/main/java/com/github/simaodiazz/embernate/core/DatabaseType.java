package com.github.simaodiazz.embernate.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DatabaseType {

    MYSQL("com.mysql.cj.jdbc.Driver"),
    SQLITE("org.sqlite.JDBC"),
    MONGO("org.mongodb.driver.MongoClient");

    private final String driver;

}
