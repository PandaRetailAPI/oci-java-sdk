/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Create Migration resource parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMySqlMigrationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMySqlMigrationDetails extends CreateMigrationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
        private String sourceDatabaseConnectionId;

        public Builder sourceDatabaseConnectionId(String sourceDatabaseConnectionId) {
            this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
            this.__explicitlySet__.add("sourceDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
        private String targetDatabaseConnectionId;

        public Builder targetDatabaseConnectionId(String targetDatabaseConnectionId) {
            this.targetDatabaseConnectionId = targetDatabaseConnectionId;
            this.__explicitlySet__.add("targetDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
        private CreateMySqlDataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                CreateMySqlDataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
        private CreateMySqlInitialLoadSettings initialLoadSettings;

        public Builder initialLoadSettings(CreateMySqlInitialLoadSettings initialLoadSettings) {
            this.initialLoadSettings = initialLoadSettings;
            this.__explicitlySet__.add("initialLoadSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
        private CreateMySqlAdvisorSettings advisorSettings;

        public Builder advisorSettings(CreateMySqlAdvisorSettings advisorSettings) {
            this.advisorSettings = advisorSettings;
            this.__explicitlySet__.add("advisorSettings");
            return this;
        }
        /**
         * Database objects to exclude from migration, cannot be specified alongside
         * 'includeObjects'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<MySqlDatabaseObject> excludeObjects;

        /**
         * Database objects to exclude from migration, cannot be specified alongside
         * 'includeObjects'
         *
         * @param excludeObjects the value to set
         * @return this builder
         */
        public Builder excludeObjects(java.util.List<MySqlDatabaseObject> excludeObjects) {
            this.excludeObjects = excludeObjects;
            this.__explicitlySet__.add("excludeObjects");
            return this;
        }
        /**
         * Database objects to include from migration, cannot be specified alongside
         * 'excludeObjects'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
        private java.util.List<MySqlDatabaseObject> includeObjects;

        /**
         * Database objects to include from migration, cannot be specified alongside
         * 'excludeObjects'
         *
         * @param includeObjects the value to set
         * @return this builder
         */
        public Builder includeObjects(java.util.List<MySqlDatabaseObject> includeObjects) {
            this.includeObjects = includeObjects;
            this.__explicitlySet__.add("includeObjects");
            return this;
        }
        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
        private String bulkIncludeExcludeData;

        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         *
         * @param bulkIncludeExcludeData the value to set
         * @return this builder
         */
        public Builder bulkIncludeExcludeData(String bulkIncludeExcludeData) {
            this.bulkIncludeExcludeData = bulkIncludeExcludeData;
            this.__explicitlySet__.add("bulkIncludeExcludeData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
        private CreateGoldenGateHubDetails hubDetails;

        public Builder hubDetails(CreateGoldenGateHubDetails hubDetails) {
            this.hubDetails = hubDetails;
            this.__explicitlySet__.add("hubDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
        private CreateMySqlGgsDeploymentDetails ggsDetails;

        public Builder ggsDetails(CreateMySqlGgsDeploymentDetails ggsDetails) {
            this.ggsDetails = ggsDetails;
            this.__explicitlySet__.add("ggsDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMySqlMigrationDetails build() {
            CreateMySqlMigrationDetails model =
                    new CreateMySqlMigrationDetails(
                            this.description,
                            this.compartmentId,
                            this.type,
                            this.displayName,
                            this.sourceDatabaseConnectionId,
                            this.targetDatabaseConnectionId,
                            this.freeformTags,
                            this.definedTags,
                            this.dataTransferMediumDetails,
                            this.initialLoadSettings,
                            this.advisorSettings,
                            this.excludeObjects,
                            this.includeObjects,
                            this.bulkIncludeExcludeData,
                            this.hubDetails,
                            this.ggsDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMySqlMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnectionId")) {
                this.sourceDatabaseConnectionId(model.getSourceDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnectionId")) {
                this.targetDatabaseConnectionId(model.getTargetDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dataTransferMediumDetails")) {
                this.dataTransferMediumDetails(model.getDataTransferMediumDetails());
            }
            if (model.wasPropertyExplicitlySet("initialLoadSettings")) {
                this.initialLoadSettings(model.getInitialLoadSettings());
            }
            if (model.wasPropertyExplicitlySet("advisorSettings")) {
                this.advisorSettings(model.getAdvisorSettings());
            }
            if (model.wasPropertyExplicitlySet("excludeObjects")) {
                this.excludeObjects(model.getExcludeObjects());
            }
            if (model.wasPropertyExplicitlySet("includeObjects")) {
                this.includeObjects(model.getIncludeObjects());
            }
            if (model.wasPropertyExplicitlySet("bulkIncludeExcludeData")) {
                this.bulkIncludeExcludeData(model.getBulkIncludeExcludeData());
            }
            if (model.wasPropertyExplicitlySet("hubDetails")) {
                this.hubDetails(model.getHubDetails());
            }
            if (model.wasPropertyExplicitlySet("ggsDetails")) {
                this.ggsDetails(model.getGgsDetails());
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

    @Deprecated
    public CreateMySqlMigrationDetails(
            String description,
            String compartmentId,
            MigrationTypes type,
            String displayName,
            String sourceDatabaseConnectionId,
            String targetDatabaseConnectionId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            CreateMySqlDataTransferMediumDetails dataTransferMediumDetails,
            CreateMySqlInitialLoadSettings initialLoadSettings,
            CreateMySqlAdvisorSettings advisorSettings,
            java.util.List<MySqlDatabaseObject> excludeObjects,
            java.util.List<MySqlDatabaseObject> includeObjects,
            String bulkIncludeExcludeData,
            CreateGoldenGateHubDetails hubDetails,
            CreateMySqlGgsDeploymentDetails ggsDetails) {
        super(
                description,
                compartmentId,
                type,
                displayName,
                sourceDatabaseConnectionId,
                targetDatabaseConnectionId,
                freeformTags,
                definedTags);
        this.dataTransferMediumDetails = dataTransferMediumDetails;
        this.initialLoadSettings = initialLoadSettings;
        this.advisorSettings = advisorSettings;
        this.excludeObjects = excludeObjects;
        this.includeObjects = includeObjects;
        this.bulkIncludeExcludeData = bulkIncludeExcludeData;
        this.hubDetails = hubDetails;
        this.ggsDetails = ggsDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    private final CreateMySqlDataTransferMediumDetails dataTransferMediumDetails;

    public CreateMySqlDataTransferMediumDetails getDataTransferMediumDetails() {
        return dataTransferMediumDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
    private final CreateMySqlInitialLoadSettings initialLoadSettings;

    public CreateMySqlInitialLoadSettings getInitialLoadSettings() {
        return initialLoadSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    private final CreateMySqlAdvisorSettings advisorSettings;

    public CreateMySqlAdvisorSettings getAdvisorSettings() {
        return advisorSettings;
    }

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    private final java.util.List<MySqlDatabaseObject> excludeObjects;

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     *
     * @return the value
     */
    public java.util.List<MySqlDatabaseObject> getExcludeObjects() {
        return excludeObjects;
    }

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
    private final java.util.List<MySqlDatabaseObject> includeObjects;

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     *
     * @return the value
     */
    public java.util.List<MySqlDatabaseObject> getIncludeObjects() {
        return includeObjects;
    }

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
    private final String bulkIncludeExcludeData;

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     *
     * @return the value
     */
    public String getBulkIncludeExcludeData() {
        return bulkIncludeExcludeData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
    private final CreateGoldenGateHubDetails hubDetails;

    public CreateGoldenGateHubDetails getHubDetails() {
        return hubDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
    private final CreateMySqlGgsDeploymentDetails ggsDetails;

    public CreateMySqlGgsDeploymentDetails getGgsDetails() {
        return ggsDetails;
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
        sb.append("CreateMySqlMigrationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataTransferMediumDetails=")
                .append(String.valueOf(this.dataTransferMediumDetails));
        sb.append(", initialLoadSettings=").append(String.valueOf(this.initialLoadSettings));
        sb.append(", advisorSettings=").append(String.valueOf(this.advisorSettings));
        sb.append(", excludeObjects=").append(String.valueOf(this.excludeObjects));
        sb.append(", includeObjects=").append(String.valueOf(this.includeObjects));
        sb.append(", bulkIncludeExcludeData=").append(String.valueOf(this.bulkIncludeExcludeData));
        sb.append(", hubDetails=").append(String.valueOf(this.hubDetails));
        sb.append(", ggsDetails=").append(String.valueOf(this.ggsDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMySqlMigrationDetails)) {
            return false;
        }

        CreateMySqlMigrationDetails other = (CreateMySqlMigrationDetails) o;
        return java.util.Objects.equals(
                        this.dataTransferMediumDetails, other.dataTransferMediumDetails)
                && java.util.Objects.equals(this.initialLoadSettings, other.initialLoadSettings)
                && java.util.Objects.equals(this.advisorSettings, other.advisorSettings)
                && java.util.Objects.equals(this.excludeObjects, other.excludeObjects)
                && java.util.Objects.equals(this.includeObjects, other.includeObjects)
                && java.util.Objects.equals(
                        this.bulkIncludeExcludeData, other.bulkIncludeExcludeData)
                && java.util.Objects.equals(this.hubDetails, other.hubDetails)
                && java.util.Objects.equals(this.ggsDetails, other.ggsDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dataTransferMediumDetails == null
                                ? 43
                                : this.dataTransferMediumDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.initialLoadSettings == null
                                ? 43
                                : this.initialLoadSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorSettings == null ? 43 : this.advisorSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeObjects == null ? 43 : this.excludeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.includeObjects == null ? 43 : this.includeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkIncludeExcludeData == null
                                ? 43
                                : this.bulkIncludeExcludeData.hashCode());
        result = (result * PRIME) + (this.hubDetails == null ? 43 : this.hubDetails.hashCode());
        result = (result * PRIME) + (this.ggsDetails == null ? 43 : this.ggsDetails.hashCode());
        return result;
    }
}
