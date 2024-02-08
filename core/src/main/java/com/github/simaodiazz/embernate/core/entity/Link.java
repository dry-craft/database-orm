package com.github.simaodiazz.embernate.core.entity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Link is used for linking entities like Relationships
 * But you don't need to specify type of link
 * Depend on data type of field you can specify type of relationship
 *
 * @author simaodiazz
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Link { }
