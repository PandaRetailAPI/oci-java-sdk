/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Infomation to create a new Maintenance Window. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMaintenanceWindowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMaintenanceWindowDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description", "resources", "schedule"})
    public UpdateMaintenanceWindowDetails(
            String description,
            java.util.List<CreateMaintenanceWindowResourceDetails> resources,
            MaintenanceWindowSchedule schedule) {
        super();
        this.description = description;
        this.resources = resources;
        this.schedule = schedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Maintenance Window description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Maintenance Window description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** List of resource Ids which are part of the Maintenance Window */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<CreateMaintenanceWindowResourceDetails> resources;

        /**
         * List of resource Ids which are part of the Maintenance Window
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<CreateMaintenanceWindowResourceDetails> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schedule")
        private MaintenanceWindowSchedule schedule;

        public Builder schedule(MaintenanceWindowSchedule schedule) {
            this.schedule = schedule;
            this.__explicitlySet__.add("schedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMaintenanceWindowDetails build() {
            UpdateMaintenanceWindowDetails model =
                    new UpdateMaintenanceWindowDetails(
                            this.description, this.resources, this.schedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMaintenanceWindowDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("schedule")) {
                this.schedule(model.getSchedule());
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

    /** Maintenance Window description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Maintenance Window description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** List of resource Ids which are part of the Maintenance Window */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<CreateMaintenanceWindowResourceDetails> resources;

    /**
     * List of resource Ids which are part of the Maintenance Window
     *
     * @return the value
     */
    public java.util.List<CreateMaintenanceWindowResourceDetails> getResources() {
        return resources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("schedule")
    private final MaintenanceWindowSchedule schedule;

    public MaintenanceWindowSchedule getSchedule() {
        return schedule;
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
        sb.append("UpdateMaintenanceWindowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", schedule=").append(String.valueOf(this.schedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMaintenanceWindowDetails)) {
            return false;
        }

        UpdateMaintenanceWindowDetails other = (UpdateMaintenanceWindowDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.schedule, other.schedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.schedule == null ? 43 : this.schedule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
