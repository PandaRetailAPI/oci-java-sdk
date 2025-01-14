/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Summary information for an export. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exportSetId",
        "fileSystemId",
        "id",
        "lifecycleState",
        "path",
        "isIdmapGroupsForSysAuth",
        "timeCreated",
        "locks"
    })
    public ExportSummary(
            String exportSetId,
            String fileSystemId,
            String id,
            LifecycleState lifecycleState,
            String path,
            Boolean isIdmapGroupsForSysAuth,
            java.util.Date timeCreated,
            java.util.List<ResourceLock> locks) {
        super();
        this.exportSetId = exportSetId;
        this.fileSystemId = fileSystemId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.path = path;
        this.isIdmapGroupsForSysAuth = isIdmapGroupsForSysAuth;
        this.timeCreated = timeCreated;
        this.locks = locks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's export set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
        private String exportSetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's export set.
         *
         * @param exportSetId the value to set
         * @return this builder
         */
        public Builder exportSetId(String exportSetId) {
            this.exportSetId = exportSetId;
            this.__explicitlySet__.add("exportSetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
        private String fileSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export's file system.
         *
         * @param fileSystemId the value to set
         * @return this builder
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            this.__explicitlySet__.add("fileSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * this export.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of this export. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of this export.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Path used to access the associated file system.
         *
         * <p>Avoid entering confidential information.
         *
         * <p>Example: {@code /mediafiles}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Path used to access the associated file system.
         *
         * <p>Avoid entering confidential information.
         *
         * <p>Example: {@code /mediafiles}
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Whether or not the export should use ID mapping for Unix groups rather than the group
         * list provided within an NFS request's RPC header. When this flag is true the Unix UID
         * from the RPC header is used to retrieve the list of secondary groups from a the ID
         * mapping subsystem. The primary GID is always taken from the RPC header. If ID mapping is
         * not configured, incorrectly configured, unavailable, or cannot be used to determine a
         * list of secondary groups then an empty secondary group list is used for authorization. If
         * the number of groups exceeds the limit of 256 groups, the list retrieved from LDAP is
         * truncated to the first 256 groups read.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIdmapGroupsForSysAuth")
        private Boolean isIdmapGroupsForSysAuth;

        /**
         * Whether or not the export should use ID mapping for Unix groups rather than the group
         * list provided within an NFS request's RPC header. When this flag is true the Unix UID
         * from the RPC header is used to retrieve the list of secondary groups from a the ID
         * mapping subsystem. The primary GID is always taken from the RPC header. If ID mapping is
         * not configured, incorrectly configured, unavailable, or cannot be used to determine a
         * list of secondary groups then an empty secondary group list is used for authorization. If
         * the number of groups exceeds the limit of 256 groups, the list retrieved from LDAP is
         * truncated to the first 256 groups read.
         *
         * @param isIdmapGroupsForSysAuth the value to set
         * @return this builder
         */
        public Builder isIdmapGroupsForSysAuth(Boolean isIdmapGroupsForSysAuth) {
            this.isIdmapGroupsForSysAuth = isIdmapGroupsForSysAuth;
            this.__explicitlySet__.add("isIdmapGroupsForSysAuth");
            return this;
        }
        /**
         * The date and time the export was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the export was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportSummary build() {
            ExportSummary model =
                    new ExportSummary(
                            this.exportSetId,
                            this.fileSystemId,
                            this.id,
                            this.lifecycleState,
                            this.path,
                            this.isIdmapGroupsForSysAuth,
                            this.timeCreated,
                            this.locks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportSummary model) {
            if (model.wasPropertyExplicitlySet("exportSetId")) {
                this.exportSetId(model.getExportSetId());
            }
            if (model.wasPropertyExplicitlySet("fileSystemId")) {
                this.fileSystemId(model.getFileSystemId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("isIdmapGroupsForSysAuth")) {
                this.isIdmapGroupsForSysAuth(model.getIsIdmapGroupsForSysAuth());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's export set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportSetId")
    private final String exportSetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's export set.
     *
     * @return the value
     */
    public String getExportSetId() {
        return exportSetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fileSystemId")
    private final String fileSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export's file system.
     *
     * @return the value
     */
    public String getFileSystemId() {
        return fileSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of this
     * export.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of this export. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of this export. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of this export.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Path used to access the associated file system.
     *
     * <p>Avoid entering confidential information.
     *
     * <p>Example: {@code /mediafiles}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Path used to access the associated file system.
     *
     * <p>Avoid entering confidential information.
     *
     * <p>Example: {@code /mediafiles}
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * Whether or not the export should use ID mapping for Unix groups rather than the group list
     * provided within an NFS request's RPC header. When this flag is true the Unix UID from the RPC
     * header is used to retrieve the list of secondary groups from a the ID mapping subsystem. The
     * primary GID is always taken from the RPC header. If ID mapping is not configured, incorrectly
     * configured, unavailable, or cannot be used to determine a list of secondary groups then an
     * empty secondary group list is used for authorization. If the number of groups exceeds the
     * limit of 256 groups, the list retrieved from LDAP is truncated to the first 256 groups read.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIdmapGroupsForSysAuth")
    private final Boolean isIdmapGroupsForSysAuth;

    /**
     * Whether or not the export should use ID mapping for Unix groups rather than the group list
     * provided within an NFS request's RPC header. When this flag is true the Unix UID from the RPC
     * header is used to retrieve the list of secondary groups from a the ID mapping subsystem. The
     * primary GID is always taken from the RPC header. If ID mapping is not configured, incorrectly
     * configured, unavailable, or cannot be used to determine a list of secondary groups then an
     * empty secondary group list is used for authorization. If the number of groups exceeds the
     * limit of 256 groups, the list retrieved from LDAP is truncated to the first 256 groups read.
     *
     * @return the value
     */
    public Boolean getIsIdmapGroupsForSysAuth() {
        return isIdmapGroupsForSysAuth;
    }

    /**
     * The date and time the export was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the export was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("ExportSummary(");
        sb.append("super=").append(super.toString());
        sb.append("exportSetId=").append(String.valueOf(this.exportSetId));
        sb.append(", fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", isIdmapGroupsForSysAuth=")
                .append(String.valueOf(this.isIdmapGroupsForSysAuth));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportSummary)) {
            return false;
        }

        ExportSummary other = (ExportSummary) o;
        return java.util.Objects.equals(this.exportSetId, other.exportSetId)
                && java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(
                        this.isIdmapGroupsForSysAuth, other.isIdmapGroupsForSysAuth)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exportSetId == null ? 43 : this.exportSetId.hashCode());
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.isIdmapGroupsForSysAuth == null
                                ? 43
                                : this.isIdmapGroupsForSysAuth.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
