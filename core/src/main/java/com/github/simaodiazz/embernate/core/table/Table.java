package com.github.simaodiazz.embernate.core.table;

import com.github.simaodiazz.embernate.core.column.Column;

public interface Table {

    String getName();

    Class<?> getEntity();

    Column[] getColumns();

}
