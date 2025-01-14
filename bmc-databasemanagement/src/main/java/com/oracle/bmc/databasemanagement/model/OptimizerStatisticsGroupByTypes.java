/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Indicates which type of Gather Optimizer Statistics Collection or Optimizer Statistics Advisor
 * tasks or its objects should be aggregated.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public enum OptimizerStatisticsGroupByTypes implements com.oracle.bmc.http.internal.BmcEnum {
    TaskStatus("TASK_STATUS"),
    TaskObjectsStatus("TASK_OBJECTS_STATUS"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OptimizerStatisticsGroupByTypes.class);

    private final String value;
    private static java.util.Map<String, OptimizerStatisticsGroupByTypes> map;

    static {
        map = new java.util.HashMap<>();
        for (OptimizerStatisticsGroupByTypes v : OptimizerStatisticsGroupByTypes.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    OptimizerStatisticsGroupByTypes(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static OptimizerStatisticsGroupByTypes create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'OptimizerStatisticsGroupByTypes', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
