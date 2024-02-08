package com.github.simaodiazz.embernate.core;

public interface Database {

    /**
     * Open connection to database
     */
    void open();

    /**
     * Close all connections
     */
    void close();

}
