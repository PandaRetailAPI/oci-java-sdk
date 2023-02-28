/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The data entity object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = DataEntity.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataEntityFromTable.class,
            name = "TABLE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataEntityFromDataStore.class,
            name = "DATA_STORE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataEntityFromView.class,
            name = "VIEW_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataEntityFromSql.class,
            name = "SQL_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataEntityFromFile.class,
            name = "FILE_ENTITY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DerivedEntity.class,
            name = "DERIVED_ENTITY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class DataEntity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"entityProperties", "metadata"})
    protected DataEntity(java.util.Map<String, String> entityProperties, ObjectMetadata metadata) {
        super();
        this.entityProperties = entityProperties;
        this.metadata = metadata;
    }

    /** Map<String, String> for entity properties */
    @com.fasterxml.jackson.annotation.JsonProperty("entityProperties")
    private final java.util.Map<String, String> entityProperties;

    /**
     * Map<String, String> for entity properties
     *
     * @return the value
     */
    public java.util.Map<String, String> getEntityProperties() {
        return entityProperties;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
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
        sb.append("DataEntity(");
        sb.append("super=").append(super.toString());
        sb.append("entityProperties=").append(String.valueOf(this.entityProperties));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataEntity)) {
            return false;
        }

        DataEntity other = (DataEntity) o;
        return java.util.Objects.equals(this.entityProperties, other.entityProperties)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.entityProperties == null ? 43 : this.entityProperties.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The data entity type. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        ViewEntity("VIEW_ENTITY"),
        TableEntity("TABLE_ENTITY"),
        FileEntity("FILE_ENTITY"),
        DataStoreEntity("DATA_STORE_ENTITY"),
        SqlEntity("SQL_ENTITY"),
        DerivedEntity("DERIVED_ENTITY"),
        MessageEntity("MESSAGE_ENTITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
