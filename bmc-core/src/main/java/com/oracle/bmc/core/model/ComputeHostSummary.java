/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for a compute host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeHostSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeHostSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "id",
        "faultDomain",
        "hpcIslandId",
        "networkBlockId",
        "localBlockId",
        "gpuMemoryFabricId",
        "instanceId",
        "shape",
        "health",
        "lifecycleState",
        "capacityReservationId",
        "hasImpactedComponents",
        "timeCreated",
        "timeUpdated",
        "definedTags",
        "displayName",
        "freeformTags"
    })
    public ComputeHostSummary(
            String availabilityDomain,
            String compartmentId,
            String id,
            String faultDomain,
            String hpcIslandId,
            String networkBlockId,
            String localBlockId,
            String gpuMemoryFabricId,
            String instanceId,
            String shape,
            ComputeHost.Health health,
            ComputeHost.LifecycleState lifecycleState,
            String capacityReservationId,
            Boolean hasImpactedComponents,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.id = id;
        this.faultDomain = faultDomain;
        this.hpcIslandId = hpcIslandId;
        this.networkBlockId = networkBlockId;
        this.localBlockId = localBlockId;
        this.gpuMemoryFabricId = gpuMemoryFabricId;
        this.instanceId = instanceId;
        this.shape = shape;
        this.health = health;
        this.lifecycleState = lifecycleState;
        this.capacityReservationId = capacityReservationId;
        this.hasImpactedComponents = hasImpactedComponents;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the compute host.
         *
         * <p>Example: {@code Uocm:US-CHICAGO-1-AD-2}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the compute host.
         *
         * <p>Example: {@code Uocm:US-CHICAGO-1-AD-2}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * compartment. This should always be the root compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * compartment. This should always be the root compartment.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Customer-unique host
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Customer-unique host
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>This field is the Fault domain of the host
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * A fault domain is a grouping of hardware and infrastructure within an availability
         * domain. Each availability domain contains three fault domains. Fault domains let you
         * distribute your instances so that they are not on the same physical hardware within a
         * single availability domain. A hardware failure or Compute hardware maintenance that
         * affects one fault domain does not affect instances in other fault domains.
         *
         * <p>This field is the Fault domain of the host
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique HPC Island
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
        private String hpcIslandId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique HPC Island
         *
         * @param hpcIslandId the value to set
         * @return this builder
         */
        public Builder hpcIslandId(String hpcIslandId) {
            this.hpcIslandId = hpcIslandId;
            this.__explicitlySet__.add("hpcIslandId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Network Block
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkBlockId")
        private String networkBlockId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Network Block
         *
         * @param networkBlockId the value to set
         * @return this builder
         */
        public Builder networkBlockId(String networkBlockId) {
            this.networkBlockId = networkBlockId;
            this.__explicitlySet__.add("networkBlockId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Local Block
         */
        @com.fasterxml.jackson.annotation.JsonProperty("localBlockId")
        private String localBlockId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique Local Block
         *
         * @param localBlockId the value to set
         * @return this builder
         */
        public Builder localBlockId(String localBlockId) {
            this.localBlockId = localBlockId;
            this.__explicitlySet__.add("localBlockId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique GPU Memory Fabric
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuMemoryFabricId")
        private String gpuMemoryFabricId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * Customer-unique GPU Memory Fabric
         *
         * @param gpuMemoryFabricId the value to set
         * @return this builder
         */
        public Builder gpuMemoryFabricId(String gpuMemoryFabricId) {
            this.gpuMemoryFabricId = gpuMemoryFabricId;
            this.__explicitlySet__.add("gpuMemoryFabricId");
            return this;
        }
        /**
         * The public [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the Virtual Machine or Bare Metal instance
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The public [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * for the Virtual Machine or Bare Metal instance
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The shape of host */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of host
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The heathy state of the host */
        @com.fasterxml.jackson.annotation.JsonProperty("health")
        private ComputeHost.Health health;

        /**
         * The heathy state of the host
         *
         * @param health the value to set
         * @return this builder
         */
        public Builder health(ComputeHost.Health health) {
            this.health = health;
            this.__explicitlySet__.add("health");
            return this;
        }
        /** The lifecycle state of the host */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ComputeHost.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the host
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(ComputeHost.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Capacity Reserver that is currently on host
         */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * Capacity Reserver that is currently on host
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }
        /**
         * While listing a host the user will know if they have an impacted component or not. The
         * user will have to issue a get host to see details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hasImpactedComponents")
        private Boolean hasImpactedComponents;

        /**
         * While listing a host the user will know if they have an impacted component or not. The
         * user will have to issue a get host to see details.
         *
         * @param hasImpactedComponents the value to set
         * @return this builder
         */
        public Builder hasImpactedComponents(Boolean hasImpactedComponents) {
            this.hasImpactedComponents = hasImpactedComponents;
            this.__explicitlySet__.add("hasImpactedComponents");
            return this;
        }
        /**
         * The date and time that the compute host record was created, in the format defined by
         * [RFC3339](https://tools .ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the compute host record was created, in the format defined by
         * [RFC3339](https://tools .ietf.org/html/rfc3339).
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
        /**
         * The date and time that the compute host record was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the compute host record was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeHostSummary build() {
            ComputeHostSummary model =
                    new ComputeHostSummary(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.id,
                            this.faultDomain,
                            this.hpcIslandId,
                            this.networkBlockId,
                            this.localBlockId,
                            this.gpuMemoryFabricId,
                            this.instanceId,
                            this.shape,
                            this.health,
                            this.lifecycleState,
                            this.capacityReservationId,
                            this.hasImpactedComponents,
                            this.timeCreated,
                            this.timeUpdated,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeHostSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("hpcIslandId")) {
                this.hpcIslandId(model.getHpcIslandId());
            }
            if (model.wasPropertyExplicitlySet("networkBlockId")) {
                this.networkBlockId(model.getNetworkBlockId());
            }
            if (model.wasPropertyExplicitlySet("localBlockId")) {
                this.localBlockId(model.getLocalBlockId());
            }
            if (model.wasPropertyExplicitlySet("gpuMemoryFabricId")) {
                this.gpuMemoryFabricId(model.getGpuMemoryFabricId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("health")) {
                this.health(model.getHealth());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
            }
            if (model.wasPropertyExplicitlySet("hasImpactedComponents")) {
                this.hasImpactedComponents(model.getHasImpactedComponents());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * The availability domain of the compute host.
     *
     * <p>Example: {@code Uocm:US-CHICAGO-1-AD-2}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the compute host.
     *
     * <p>Example: {@code Uocm:US-CHICAGO-1-AD-2}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * compartment. This should always be the root compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * compartment. This should always be the root compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Customer-unique host
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Customer-unique host
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>This field is the Fault domain of the host
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * A fault domain is a grouping of hardware and infrastructure within an availability domain.
     * Each availability domain contains three fault domains. Fault domains let you distribute your
     * instances so that they are not on the same physical hardware within a single availability
     * domain. A hardware failure or Compute hardware maintenance that affects one fault domain does
     * not affect instances in other fault domains.
     *
     * <p>This field is the Fault domain of the host
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique HPC Island
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hpcIslandId")
    private final String hpcIslandId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique HPC Island
     *
     * @return the value
     */
    public String getHpcIslandId() {
        return hpcIslandId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Network Block
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkBlockId")
    private final String networkBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Network Block
     *
     * @return the value
     */
    public String getNetworkBlockId() {
        return networkBlockId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Local Block
     */
    @com.fasterxml.jackson.annotation.JsonProperty("localBlockId")
    private final String localBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique Local Block
     *
     * @return the value
     */
    public String getLocalBlockId() {
        return localBlockId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique GPU Memory Fabric
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuMemoryFabricId")
    private final String gpuMemoryFabricId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * Customer-unique GPU Memory Fabric
     *
     * @return the value
     */
    public String getGpuMemoryFabricId() {
        return gpuMemoryFabricId;
    }

    /**
     * The public [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the Virtual Machine or Bare Metal instance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The public [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
     * the Virtual Machine or Bare Metal instance
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The shape of host */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of host
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The heathy state of the host */
    @com.fasterxml.jackson.annotation.JsonProperty("health")
    private final ComputeHost.Health health;

    /**
     * The heathy state of the host
     *
     * @return the value
     */
    public ComputeHost.Health getHealth() {
        return health;
    }

    /** The lifecycle state of the host */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ComputeHost.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the host
     *
     * @return the value
     */
    public ComputeHost.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Capacity Reserver that is currently on host
     */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * Capacity Reserver that is currently on host
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * While listing a host the user will know if they have an impacted component or not. The user
     * will have to issue a get host to see details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hasImpactedComponents")
    private final Boolean hasImpactedComponents;

    /**
     * While listing a host the user will know if they have an impacted component or not. The user
     * will have to issue a get host to see details.
     *
     * @return the value
     */
    public Boolean getHasImpactedComponents() {
        return hasImpactedComponents;
    }

    /**
     * The date and time that the compute host record was created, in the format defined by
     * [RFC3339](https://tools .ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the compute host record was created, in the format defined by
     * [RFC3339](https://tools .ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the compute host record was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the compute host record was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("ComputeHostSummary(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", hpcIslandId=").append(String.valueOf(this.hpcIslandId));
        sb.append(", networkBlockId=").append(String.valueOf(this.networkBlockId));
        sb.append(", localBlockId=").append(String.valueOf(this.localBlockId));
        sb.append(", gpuMemoryFabricId=").append(String.valueOf(this.gpuMemoryFabricId));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", health=").append(String.valueOf(this.health));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(", hasImpactedComponents=").append(String.valueOf(this.hasImpactedComponents));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeHostSummary)) {
            return false;
        }

        ComputeHostSummary other = (ComputeHostSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.hpcIslandId, other.hpcIslandId)
                && java.util.Objects.equals(this.networkBlockId, other.networkBlockId)
                && java.util.Objects.equals(this.localBlockId, other.localBlockId)
                && java.util.Objects.equals(this.gpuMemoryFabricId, other.gpuMemoryFabricId)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.health, other.health)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && java.util.Objects.equals(this.hasImpactedComponents, other.hasImpactedComponents)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.hpcIslandId == null ? 43 : this.hpcIslandId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkBlockId == null ? 43 : this.networkBlockId.hashCode());
        result = (result * PRIME) + (this.localBlockId == null ? 43 : this.localBlockId.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuMemoryFabricId == null ? 43 : this.gpuMemoryFabricId.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.health == null ? 43 : this.health.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result =
                (result * PRIME)
                        + (this.hasImpactedComponents == null
                                ? 43
                                : this.hasImpactedComponents.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
