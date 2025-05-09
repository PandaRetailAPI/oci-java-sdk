/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Summary information for a file system. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FileSystemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FileSystemSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "meteredBytes",
        "compartmentId",
        "displayName",
        "id",
        "lifecycleState",
        "timeCreated",
        "locks",
        "freeformTags",
        "definedTags",
        "systemTags",
        "replicationSourceCount",
        "kmsKeyId",
        "sourceDetails",
        "isCloneParent",
        "isHydrated",
        "lifecycleDetails",
        "cloneAttachStatus",
        "quotaEnforcementState"
    })
    public FileSystemSummary(
            String availabilityDomain,
            Long meteredBytes,
            String compartmentId,
            String displayName,
            String id,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.List<ResourceLock> locks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Integer replicationSourceCount,
            String kmsKeyId,
            SourceDetails sourceDetails,
            Boolean isCloneParent,
            Boolean isHydrated,
            String lifecycleDetails,
            CloneAttachStatus cloneAttachStatus,
            QuotaEnforcementState quotaEnforcementState) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.meteredBytes = meteredBytes;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.locks = locks;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.replicationSourceCount = replicationSourceCount;
        this.kmsKeyId = kmsKeyId;
        this.sourceDetails = sourceDetails;
        this.isCloneParent = isCloneParent;
        this.isHydrated = isHydrated;
        this.lifecycleDetails = lifecycleDetails;
        this.cloneAttachStatus = cloneAttachStatus;
        this.quotaEnforcementState = quotaEnforcementState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the file system is in. May be unset as a blank or NULL value.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The number of bytes consumed by the file system, including any snapshots. This number
         * reflects the metered size of the file system and is updated asynchronously with respect
         * to updates to the file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("meteredBytes")
        private Long meteredBytes;

        /**
         * The number of bytes consumed by the file system, including any snapshots. This number
         * reflects the metered size of the file system and is updated asynchronously with respect
         * to updates to the file system.
         *
         * @param meteredBytes the value to set
         * @return this builder
         */
        public Builder meteredBytes(Long meteredBytes) {
            this.meteredBytes = meteredBytes;
            this.__explicitlySet__.add("meteredBytes");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the file system.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My file system}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My file system}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current state of the file system. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the file system.
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
         * The date and time the file system was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the file system was created, expressed in [RFC
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. System tags are applied to resources by internal OCI
         * services.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. System tags are applied to resources by internal OCI
         * services.
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** Specifies the total number of replications for which this file system is a source. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationSourceCount")
        private Integer replicationSourceCount;

        /**
         * Specifies the total number of replications for which this file system is a source.
         *
         * @param replicationSourceCount the value to set
         * @return this builder
         */
        public Builder replicationSourceCount(Integer replicationSourceCount) {
            this.replicationSourceCount = replicationSourceCount;
            this.__explicitlySet__.add("replicationSourceCount");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KMS key used to encrypt the encryption keys associated with this file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KMS key used to encrypt the encryption keys associated with this file system.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
        private SourceDetails sourceDetails;

        public Builder sourceDetails(SourceDetails sourceDetails) {
            this.sourceDetails = sourceDetails;
            this.__explicitlySet__.add("sourceDetails");
            return this;
        }
        /**
         * Specifies whether the file system has been cloned. See [Cloning a File
         * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCloneParent")
        private Boolean isCloneParent;

        /**
         * Specifies whether the file system has been cloned. See [Cloning a File
         * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
         *
         * @param isCloneParent the value to set
         * @return this builder
         */
        public Builder isCloneParent(Boolean isCloneParent) {
            this.isCloneParent = isCloneParent;
            this.__explicitlySet__.add("isCloneParent");
            return this;
        }
        /**
         * Specifies whether the data has finished copying from the source to the clone. Hydration
         * can take up to several hours to complete depending on the size of the source. The source
         * and clone remain available during hydration, but there may be some performance impact.
         * See [Cloning a File
         * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm#hydration).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
        private Boolean isHydrated;

        /**
         * Specifies whether the data has finished copying from the source to the clone. Hydration
         * can take up to several hours to complete depending on the size of the source. The source
         * and clone remain available during hydration, but there may be some performance impact.
         * See [Cloning a File
         * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm#hydration).
         *
         * @param isHydrated the value to set
         * @return this builder
         */
        public Builder isHydrated(Boolean isHydrated) {
            this.isHydrated = isHydrated;
            this.__explicitlySet__.add("isHydrated");
            return this;
        }
        /** Additional information about the current 'lifecycleState'. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current 'lifecycleState'.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Specifies whether the file system is attached to its parent file system. */
        @com.fasterxml.jackson.annotation.JsonProperty("cloneAttachStatus")
        private CloneAttachStatus cloneAttachStatus;

        /**
         * Specifies whether the file system is attached to its parent file system.
         *
         * @param cloneAttachStatus the value to set
         * @return this builder
         */
        public Builder cloneAttachStatus(CloneAttachStatus cloneAttachStatus) {
            this.cloneAttachStatus = cloneAttachStatus;
            this.__explicitlySet__.add("cloneAttachStatus");
            return this;
        }
        /** Displays the state of enforcement of quota rules on the file system. */
        @com.fasterxml.jackson.annotation.JsonProperty("quotaEnforcementState")
        private QuotaEnforcementState quotaEnforcementState;

        /**
         * Displays the state of enforcement of quota rules on the file system.
         *
         * @param quotaEnforcementState the value to set
         * @return this builder
         */
        public Builder quotaEnforcementState(QuotaEnforcementState quotaEnforcementState) {
            this.quotaEnforcementState = quotaEnforcementState;
            this.__explicitlySet__.add("quotaEnforcementState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FileSystemSummary build() {
            FileSystemSummary model =
                    new FileSystemSummary(
                            this.availabilityDomain,
                            this.meteredBytes,
                            this.compartmentId,
                            this.displayName,
                            this.id,
                            this.lifecycleState,
                            this.timeCreated,
                            this.locks,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.replicationSourceCount,
                            this.kmsKeyId,
                            this.sourceDetails,
                            this.isCloneParent,
                            this.isHydrated,
                            this.lifecycleDetails,
                            this.cloneAttachStatus,
                            this.quotaEnforcementState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileSystemSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("meteredBytes")) {
                this.meteredBytes(model.getMeteredBytes());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("replicationSourceCount")) {
                this.replicationSourceCount(model.getReplicationSourceCount());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("sourceDetails")) {
                this.sourceDetails(model.getSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("isCloneParent")) {
                this.isCloneParent(model.getIsCloneParent());
            }
            if (model.wasPropertyExplicitlySet("isHydrated")) {
                this.isHydrated(model.getIsHydrated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("cloneAttachStatus")) {
                this.cloneAttachStatus(model.getCloneAttachStatus());
            }
            if (model.wasPropertyExplicitlySet("quotaEnforcementState")) {
                this.quotaEnforcementState(model.getQuotaEnforcementState());
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
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the file system is in. May be unset as a blank or NULL value.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The number of bytes consumed by the file system, including any snapshots. This number
     * reflects the metered size of the file system and is updated asynchronously with respect to
     * updates to the file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meteredBytes")
    private final Long meteredBytes;

    /**
     * The number of bytes consumed by the file system, including any snapshots. This number
     * reflects the metered size of the file system and is updated asynchronously with respect to
     * updates to the file system.
     *
     * @return the value
     */
    public Long getMeteredBytes() {
        return meteredBytes;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the file system.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My file system}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My file system}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of the file system. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the file system. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the file system.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the file system was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the file system was created, expressed in [RFC
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. System tags are applied to resources by internal OCI services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. System tags are applied to resources by internal OCI services.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** Specifies the total number of replications for which this file system is a source. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationSourceCount")
    private final Integer replicationSourceCount;

    /**
     * Specifies the total number of replications for which this file system is a source.
     *
     * @return the value
     */
    public Integer getReplicationSourceCount() {
        return replicationSourceCount;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the KMS
     * key used to encrypt the encryption keys associated with this file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the KMS
     * key used to encrypt the encryption keys associated with this file system.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceDetails")
    private final SourceDetails sourceDetails;

    public SourceDetails getSourceDetails() {
        return sourceDetails;
    }

    /**
     * Specifies whether the file system has been cloned. See [Cloning a File
     * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCloneParent")
    private final Boolean isCloneParent;

    /**
     * Specifies whether the file system has been cloned. See [Cloning a File
     * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm).
     *
     * @return the value
     */
    public Boolean getIsCloneParent() {
        return isCloneParent;
    }

    /**
     * Specifies whether the data has finished copying from the source to the clone. Hydration can
     * take up to several hours to complete depending on the size of the source. The source and
     * clone remain available during hydration, but there may be some performance impact. See
     * [Cloning a File
     * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm#hydration).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHydrated")
    private final Boolean isHydrated;

    /**
     * Specifies whether the data has finished copying from the source to the clone. Hydration can
     * take up to several hours to complete depending on the size of the source. The source and
     * clone remain available during hydration, but there may be some performance impact. See
     * [Cloning a File
     * System](https://docs.oracle.com/iaas/Content/File/Tasks/cloningFS.htm#hydration).
     *
     * @return the value
     */
    public Boolean getIsHydrated() {
        return isHydrated;
    }

    /** Additional information about the current 'lifecycleState'. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current 'lifecycleState'.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Specifies whether the file system is attached to its parent file system. */
    public enum CloneAttachStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CloneAttachStatus.class);

        private final String value;
        private static java.util.Map<String, CloneAttachStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (CloneAttachStatus v : CloneAttachStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CloneAttachStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CloneAttachStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CloneAttachStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether the file system is attached to its parent file system. */
    @com.fasterxml.jackson.annotation.JsonProperty("cloneAttachStatus")
    private final CloneAttachStatus cloneAttachStatus;

    /**
     * Specifies whether the file system is attached to its parent file system.
     *
     * @return the value
     */
    public CloneAttachStatus getCloneAttachStatus() {
        return cloneAttachStatus;
    }

    /** Displays the state of enforcement of quota rules on the file system. */
    public enum QuotaEnforcementState implements com.oracle.bmc.http.internal.BmcEnum {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        Disabled("DISABLED"),
        Syncing("SYNCING"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(QuotaEnforcementState.class);

        private final String value;
        private static java.util.Map<String, QuotaEnforcementState> map;

        static {
            map = new java.util.HashMap<>();
            for (QuotaEnforcementState v : QuotaEnforcementState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        QuotaEnforcementState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static QuotaEnforcementState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'QuotaEnforcementState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Displays the state of enforcement of quota rules on the file system. */
    @com.fasterxml.jackson.annotation.JsonProperty("quotaEnforcementState")
    private final QuotaEnforcementState quotaEnforcementState;

    /**
     * Displays the state of enforcement of quota rules on the file system.
     *
     * @return the value
     */
    public QuotaEnforcementState getQuotaEnforcementState() {
        return quotaEnforcementState;
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
        sb.append("FileSystemSummary(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", meteredBytes=").append(String.valueOf(this.meteredBytes));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", replicationSourceCount=").append(String.valueOf(this.replicationSourceCount));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", sourceDetails=").append(String.valueOf(this.sourceDetails));
        sb.append(", isCloneParent=").append(String.valueOf(this.isCloneParent));
        sb.append(", isHydrated=").append(String.valueOf(this.isHydrated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", cloneAttachStatus=").append(String.valueOf(this.cloneAttachStatus));
        sb.append(", quotaEnforcementState=").append(String.valueOf(this.quotaEnforcementState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileSystemSummary)) {
            return false;
        }

        FileSystemSummary other = (FileSystemSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.meteredBytes, other.meteredBytes)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.replicationSourceCount, other.replicationSourceCount)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.sourceDetails, other.sourceDetails)
                && java.util.Objects.equals(this.isCloneParent, other.isCloneParent)
                && java.util.Objects.equals(this.isHydrated, other.isHydrated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.cloneAttachStatus, other.cloneAttachStatus)
                && java.util.Objects.equals(this.quotaEnforcementState, other.quotaEnforcementState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.meteredBytes == null ? 43 : this.meteredBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationSourceCount == null
                                ? 43
                                : this.replicationSourceCount.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDetails == null ? 43 : this.sourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isCloneParent == null ? 43 : this.isCloneParent.hashCode());
        result = (result * PRIME) + (this.isHydrated == null ? 43 : this.isHydrated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.cloneAttachStatus == null ? 43 : this.cloneAttachStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.quotaEnforcementState == null
                                ? 43
                                : this.quotaEnforcementState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
