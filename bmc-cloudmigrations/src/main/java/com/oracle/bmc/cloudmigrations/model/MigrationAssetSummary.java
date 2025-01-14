/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Summary of the migration asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrationAssetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MigrationAssetSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "displayName",
        "compartmentId",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "migrationId",
        "snapshots",
        "parentSnapshot",
        "snapshotInfo",
        "sourceAssetData",
        "notifications",
        "sourceAssetId",
        "dependedOnBy",
        "dependsOn",
        "replicationScheduleId",
        "tenancyId"
    })
    public MigrationAssetSummary(
            String id,
            String type,
            String displayName,
            String compartmentId,
            MigrationAsset.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String migrationId,
            java.util.Map<String, HydratedVolume> snapshots,
            String parentSnapshot,
            String snapshotInfo,
            java.util.Map<String, Object> sourceAssetData,
            java.util.List<Notifications> notifications,
            String sourceAssetId,
            java.util.List<String> dependedOnBy,
            java.util.List<String> dependsOn,
            String replicationScheduleId,
            String tenancyId) {
        super();
        this.id = id;
        this.type = type;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.migrationId = migrationId;
        this.snapshots = snapshots;
        this.parentSnapshot = parentSnapshot;
        this.snapshotInfo = snapshotInfo;
        this.sourceAssetData = sourceAssetData;
        this.notifications = notifications;
        this.sourceAssetId = sourceAssetId;
        this.dependedOnBy = dependedOnBy;
        this.dependsOn = dependsOn;
        this.replicationScheduleId = replicationScheduleId;
        this.tenancyId = tenancyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The asset ID generated by the mirgration service. It is used in the migration service
         * pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The asset ID generated by the mirgration service. It is used in the migration service
         * pipeline.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The type of asset referenced for an inventory. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of asset referenced for an inventory.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The current state of the migration asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MigrationAsset.LifecycleState lifecycleState;

        /**
         * The current state of the migration asset.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(MigrationAsset.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The time when the migration asset was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the migration asset was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time when the migration asset was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the migration asset was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** OCID of the associated migration. */
        @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
        private String migrationId;

        /**
         * OCID of the associated migration.
         *
         * @param migrationId the value to set
         * @return this builder
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            this.__explicitlySet__.add("migrationId");
            return this;
        }
        /**
         * Key-value pair representing disk's ID that is mapped to the OCIDs of replicated/hydration
         * server volume snapshots. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshots")
        private java.util.Map<String, HydratedVolume> snapshots;

        /**
         * Key-value pair representing disk's ID that is mapped to the OCIDs of replicated/hydration
         * server volume snapshots. Example: {@code {"bar-key": "value"}}
         *
         * @param snapshots the value to set
         * @return this builder
         */
        public Builder snapshots(java.util.Map<String, HydratedVolume> snapshots) {
            this.snapshots = snapshots;
            this.__explicitlySet__.add("snapshots");
            return this;
        }
        /** The parent snapshot of the mgration asset to be used by the replication task. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentSnapshot")
        private String parentSnapshot;

        /**
         * The parent snapshot of the mgration asset to be used by the replication task.
         *
         * @param parentSnapshot the value to set
         * @return this builder
         */
        public Builder parentSnapshot(String parentSnapshot) {
            this.parentSnapshot = parentSnapshot;
            this.__explicitlySet__.add("parentSnapshot");
            return this;
        }
        /** The snapshot information. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotInfo")
        private String snapshotInfo;

        /**
         * The snapshot information.
         *
         * @param snapshotInfo the value to set
         * @return this builder
         */
        public Builder snapshotInfo(String snapshotInfo) {
            this.snapshotInfo = snapshotInfo;
            this.__explicitlySet__.add("snapshotInfo");
            return this;
        }
        /**
         * Key-value pair representing asset metadata keys and values scoped to a namespace.
         * Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceAssetData")
        private java.util.Map<String, Object> sourceAssetData;

        /**
         * Key-value pair representing asset metadata keys and values scoped to a namespace.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param sourceAssetData the value to set
         * @return this builder
         */
        public Builder sourceAssetData(java.util.Map<String, Object> sourceAssetData) {
            this.sourceAssetData = sourceAssetData;
            this.__explicitlySet__.add("sourceAssetData");
            return this;
        }
        /** List of notifications. */
        @com.fasterxml.jackson.annotation.JsonProperty("notifications")
        private java.util.List<Notifications> notifications;

        /**
         * List of notifications.
         *
         * @param notifications the value to set
         * @return this builder
         */
        public Builder notifications(java.util.List<Notifications> notifications) {
            this.notifications = notifications;
            this.__explicitlySet__.add("notifications");
            return this;
        }
        /** OCID that is referenced to an asset, for an inventory. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceAssetId")
        private String sourceAssetId;

        /**
         * OCID that is referenced to an asset, for an inventory.
         *
         * @param sourceAssetId the value to set
         * @return this builder
         */
        public Builder sourceAssetId(String sourceAssetId) {
            this.sourceAssetId = sourceAssetId;
            this.__explicitlySet__.add("sourceAssetId");
            return this;
        }
        /** List of migration assets that depend on this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependedOnBy")
        private java.util.List<String> dependedOnBy;

        /**
         * List of migration assets that depend on this asset.
         *
         * @param dependedOnBy the value to set
         * @return this builder
         */
        public Builder dependedOnBy(java.util.List<String> dependedOnBy) {
            this.dependedOnBy = dependedOnBy;
            this.__explicitlySet__.add("dependedOnBy");
            return this;
        }
        /** List of migration assets that depend on this asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
        private java.util.List<String> dependsOn;

        /**
         * List of migration assets that depend on this asset.
         *
         * @param dependsOn the value to set
         * @return this builder
         */
        public Builder dependsOn(java.util.List<String> dependsOn) {
            this.dependsOn = dependsOn;
            this.__explicitlySet__.add("dependsOn");
            return this;
        }
        /** Replication schedule identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationScheduleId")
        private String replicationScheduleId;

        /**
         * Replication schedule identifier
         *
         * @param replicationScheduleId the value to set
         * @return this builder
         */
        public Builder replicationScheduleId(String replicationScheduleId) {
            this.replicationScheduleId = replicationScheduleId;
            this.__explicitlySet__.add("replicationScheduleId");
            return this;
        }
        /** Tenancy Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * Tenancy Identifier
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationAssetSummary build() {
            MigrationAssetSummary model =
                    new MigrationAssetSummary(
                            this.id,
                            this.type,
                            this.displayName,
                            this.compartmentId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.migrationId,
                            this.snapshots,
                            this.parentSnapshot,
                            this.snapshotInfo,
                            this.sourceAssetData,
                            this.notifications,
                            this.sourceAssetId,
                            this.dependedOnBy,
                            this.dependsOn,
                            this.replicationScheduleId,
                            this.tenancyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationAssetSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("migrationId")) {
                this.migrationId(model.getMigrationId());
            }
            if (model.wasPropertyExplicitlySet("snapshots")) {
                this.snapshots(model.getSnapshots());
            }
            if (model.wasPropertyExplicitlySet("parentSnapshot")) {
                this.parentSnapshot(model.getParentSnapshot());
            }
            if (model.wasPropertyExplicitlySet("snapshotInfo")) {
                this.snapshotInfo(model.getSnapshotInfo());
            }
            if (model.wasPropertyExplicitlySet("sourceAssetData")) {
                this.sourceAssetData(model.getSourceAssetData());
            }
            if (model.wasPropertyExplicitlySet("notifications")) {
                this.notifications(model.getNotifications());
            }
            if (model.wasPropertyExplicitlySet("sourceAssetId")) {
                this.sourceAssetId(model.getSourceAssetId());
            }
            if (model.wasPropertyExplicitlySet("dependedOnBy")) {
                this.dependedOnBy(model.getDependedOnBy());
            }
            if (model.wasPropertyExplicitlySet("dependsOn")) {
                this.dependsOn(model.getDependsOn());
            }
            if (model.wasPropertyExplicitlySet("replicationScheduleId")) {
                this.replicationScheduleId(model.getReplicationScheduleId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
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
     * The asset ID generated by the mirgration service. It is used in the migration service
     * pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The asset ID generated by the mirgration service. It is used in the migration service
     * pipeline.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The type of asset referenced for an inventory. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of asset referenced for an inventory.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current state of the migration asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MigrationAsset.LifecycleState lifecycleState;

    /**
     * The current state of the migration asset.
     *
     * @return the value
     */
    public MigrationAsset.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The time when the migration asset was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the migration asset was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time when the migration asset was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the migration asset was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the associated migration. */
    @com.fasterxml.jackson.annotation.JsonProperty("migrationId")
    private final String migrationId;

    /**
     * OCID of the associated migration.
     *
     * @return the value
     */
    public String getMigrationId() {
        return migrationId;
    }

    /**
     * Key-value pair representing disk's ID that is mapped to the OCIDs of replicated/hydration
     * server volume snapshots. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshots")
    private final java.util.Map<String, HydratedVolume> snapshots;

    /**
     * Key-value pair representing disk's ID that is mapped to the OCIDs of replicated/hydration
     * server volume snapshots. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, HydratedVolume> getSnapshots() {
        return snapshots;
    }

    /** The parent snapshot of the mgration asset to be used by the replication task. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSnapshot")
    private final String parentSnapshot;

    /**
     * The parent snapshot of the mgration asset to be used by the replication task.
     *
     * @return the value
     */
    public String getParentSnapshot() {
        return parentSnapshot;
    }

    /** The snapshot information. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotInfo")
    private final String snapshotInfo;

    /**
     * The snapshot information.
     *
     * @return the value
     */
    public String getSnapshotInfo() {
        return snapshotInfo;
    }

    /**
     * Key-value pair representing asset metadata keys and values scoped to a namespace. Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAssetData")
    private final java.util.Map<String, Object> sourceAssetData;

    /**
     * Key-value pair representing asset metadata keys and values scoped to a namespace. Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, Object> getSourceAssetData() {
        return sourceAssetData;
    }

    /** */
    public enum Notifications implements com.oracle.bmc.http.internal.BmcEnum {
        OutOfDate("OUT_OF_DATE"),
        SourceRemoved("SOURCE_REMOVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Notifications.class);

        private final String value;
        private static java.util.Map<String, Notifications> map;

        static {
            map = new java.util.HashMap<>();
            for (Notifications v : Notifications.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Notifications(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Notifications create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Notifications', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** List of notifications. */
    @com.fasterxml.jackson.annotation.JsonProperty("notifications")
    private final java.util.List<Notifications> notifications;

    /**
     * List of notifications.
     *
     * @return the value
     */
    public java.util.List<Notifications> getNotifications() {
        return notifications;
    }

    /** OCID that is referenced to an asset, for an inventory. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAssetId")
    private final String sourceAssetId;

    /**
     * OCID that is referenced to an asset, for an inventory.
     *
     * @return the value
     */
    public String getSourceAssetId() {
        return sourceAssetId;
    }

    /** List of migration assets that depend on this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependedOnBy")
    private final java.util.List<String> dependedOnBy;

    /**
     * List of migration assets that depend on this asset.
     *
     * @return the value
     */
    public java.util.List<String> getDependedOnBy() {
        return dependedOnBy;
    }

    /** List of migration assets that depend on this asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
    private final java.util.List<String> dependsOn;

    /**
     * List of migration assets that depend on this asset.
     *
     * @return the value
     */
    public java.util.List<String> getDependsOn() {
        return dependsOn;
    }

    /** Replication schedule identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationScheduleId")
    private final String replicationScheduleId;

    /**
     * Replication schedule identifier
     *
     * @return the value
     */
    public String getReplicationScheduleId() {
        return replicationScheduleId;
    }

    /** Tenancy Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * Tenancy Identifier
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
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
        sb.append("MigrationAssetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", migrationId=").append(String.valueOf(this.migrationId));
        sb.append(", snapshots=").append(String.valueOf(this.snapshots));
        sb.append(", parentSnapshot=").append(String.valueOf(this.parentSnapshot));
        sb.append(", snapshotInfo=").append(String.valueOf(this.snapshotInfo));
        sb.append(", sourceAssetData=").append(String.valueOf(this.sourceAssetData));
        sb.append(", notifications=").append(String.valueOf(this.notifications));
        sb.append(", sourceAssetId=").append(String.valueOf(this.sourceAssetId));
        sb.append(", dependedOnBy=").append(String.valueOf(this.dependedOnBy));
        sb.append(", dependsOn=").append(String.valueOf(this.dependsOn));
        sb.append(", replicationScheduleId=").append(String.valueOf(this.replicationScheduleId));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationAssetSummary)) {
            return false;
        }

        MigrationAssetSummary other = (MigrationAssetSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(this.snapshots, other.snapshots)
                && java.util.Objects.equals(this.parentSnapshot, other.parentSnapshot)
                && java.util.Objects.equals(this.snapshotInfo, other.snapshotInfo)
                && java.util.Objects.equals(this.sourceAssetData, other.sourceAssetData)
                && java.util.Objects.equals(this.notifications, other.notifications)
                && java.util.Objects.equals(this.sourceAssetId, other.sourceAssetId)
                && java.util.Objects.equals(this.dependedOnBy, other.dependedOnBy)
                && java.util.Objects.equals(this.dependsOn, other.dependsOn)
                && java.util.Objects.equals(this.replicationScheduleId, other.replicationScheduleId)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result = (result * PRIME) + (this.snapshots == null ? 43 : this.snapshots.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSnapshot == null ? 43 : this.parentSnapshot.hashCode());
        result = (result * PRIME) + (this.snapshotInfo == null ? 43 : this.snapshotInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceAssetData == null ? 43 : this.sourceAssetData.hashCode());
        result =
                (result * PRIME)
                        + (this.notifications == null ? 43 : this.notifications.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceAssetId == null ? 43 : this.sourceAssetId.hashCode());
        result = (result * PRIME) + (this.dependedOnBy == null ? 43 : this.dependedOnBy.hashCode());
        result = (result * PRIME) + (this.dependsOn == null ? 43 : this.dependsOn.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationScheduleId == null
                                ? 43
                                : this.replicationScheduleId.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
