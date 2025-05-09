/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The output destination for the command. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "outputType",
        defaultImpl = InstanceAgentCommandOutputDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceAgentCommandOutputViaObjectStorageUriDetails.class,
            name = "OBJECT_STORAGE_URI"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceAgentCommandOutputViaObjectStorageTupleDetails.class,
            name = "OBJECT_STORAGE_TUPLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = InstanceAgentCommandOutputViaTextDetails.class,
            name = "TEXT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class InstanceAgentCommandOutputDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected InstanceAgentCommandOutputDetails() {
        super();
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceAgentCommandOutputDetails(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandOutputDetails)) {
            return false;
        }

        InstanceAgentCommandOutputDetails other = (InstanceAgentCommandOutputDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The output type for the command. The following values are supported:
     *
     * <p>- {@code TEXT} - the command output is returned as plain text. - {@code
     * OBJECT_STORAGE_URI} - the command output is saved to an Object Storage URL. - {@code
     * OBJECT_STORAGE_TUPLE} - the command output is saved to an Object Storage bucket.
     *
     * <p>For background information about Object Storage buckets and URLs, see [Overview of Object
     * Storage](https://docs.oracle.com/iaas/Content/Object/Concepts/objectstorageoverview.htm).
     */
    public enum OutputType implements com.oracle.bmc.http.internal.BmcEnum {
        Text("TEXT"),
        ObjectStorageUri("OBJECT_STORAGE_URI"),
        ObjectStorageTuple("OBJECT_STORAGE_TUPLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OutputType.class);

        private final String value;
        private static java.util.Map<String, OutputType> map;

        static {
            map = new java.util.HashMap<>();
            for (OutputType v : OutputType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OutputType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OutputType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OutputType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
