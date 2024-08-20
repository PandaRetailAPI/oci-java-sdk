/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Task associated with the Job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExecutionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecutionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "taskRecordId",
        "stepName",
        "processReferenceId",
        "sequence",
        "status",
        "targetId",
        "timeStarted",
        "timeEnded",
        "systemTags"
    })
    public ExecutionSummary(
            String id,
            String taskRecordId,
            String stepName,
            String processReferenceId,
            String sequence,
            JobStatus status,
            String targetId,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.taskRecordId = taskRecordId;
        this.stepName = stepName;
        this.processReferenceId = processReferenceId;
        this.sequence = sequence;
        this.status = status;
        this.targetId = targetId;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique Id assocaited with the Task Execution */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique Id assocaited with the Task Execution
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of taskRecord */
        @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
        private String taskRecordId;

        /**
         * The OCID of taskRecord
         *
         * @param taskRecordId the value to set
         * @return this builder
         */
        public Builder taskRecordId(String taskRecordId) {
            this.taskRecordId = taskRecordId;
            this.__explicitlySet__.add("taskRecordId");
            return this;
        }
        /** Name of the Step */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Name of the Step
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** Unique process reference identifier returned by the execution client */
        @com.fasterxml.jackson.annotation.JsonProperty("processReferenceId")
        private String processReferenceId;

        /**
         * Unique process reference identifier returned by the execution client
         *
         * @param processReferenceId the value to set
         * @return this builder
         */
        public Builder processReferenceId(String processReferenceId) {
            this.processReferenceId = processReferenceId;
            this.__explicitlySet__.add("processReferenceId");
            return this;
        }
        /** The sequence of the task */
        @com.fasterxml.jackson.annotation.JsonProperty("sequence")
        private String sequence;

        /**
         * The sequence of the task
         *
         * @param sequence the value to set
         * @return this builder
         */
        public Builder sequence(String sequence) {
            this.sequence = sequence;
            this.__explicitlySet__.add("sequence");
            return this;
        }
        /** Status of the Task */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        /**
         * Status of the Task
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Target associated with the execution */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * Target associated with the execution
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The time the task started. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the task started. An RFC3339 formatted datetime string
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The time the task ended. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the task ended. An RFC3339 formatted datetime string
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecutionSummary build() {
            ExecutionSummary model =
                    new ExecutionSummary(
                            this.id,
                            this.taskRecordId,
                            this.stepName,
                            this.processReferenceId,
                            this.sequence,
                            this.status,
                            this.targetId,
                            this.timeStarted,
                            this.timeEnded,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecutionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("taskRecordId")) {
                this.taskRecordId(model.getTaskRecordId());
            }
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("processReferenceId")) {
                this.processReferenceId(model.getProcessReferenceId());
            }
            if (model.wasPropertyExplicitlySet("sequence")) {
                this.sequence(model.getSequence());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Unique Id assocaited with the Task Execution */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique Id assocaited with the Task Execution
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of taskRecord */
    @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
    private final String taskRecordId;

    /**
     * The OCID of taskRecord
     *
     * @return the value
     */
    public String getTaskRecordId() {
        return taskRecordId;
    }

    /** Name of the Step */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Name of the Step
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** Unique process reference identifier returned by the execution client */
    @com.fasterxml.jackson.annotation.JsonProperty("processReferenceId")
    private final String processReferenceId;

    /**
     * Unique process reference identifier returned by the execution client
     *
     * @return the value
     */
    public String getProcessReferenceId() {
        return processReferenceId;
    }

    /** The sequence of the task */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    private final String sequence;

    /**
     * The sequence of the task
     *
     * @return the value
     */
    public String getSequence() {
        return sequence;
    }

    /** Status of the Task */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final JobStatus status;

    /**
     * Status of the Task
     *
     * @return the value
     */
    public JobStatus getStatus() {
        return status;
    }

    /** Target associated with the execution */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * Target associated with the execution
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The time the task started. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the task started. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the task ended. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the task ended. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ExecutionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", taskRecordId=").append(String.valueOf(this.taskRecordId));
        sb.append(", stepName=").append(String.valueOf(this.stepName));
        sb.append(", processReferenceId=").append(String.valueOf(this.processReferenceId));
        sb.append(", sequence=").append(String.valueOf(this.sequence));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecutionSummary)) {
            return false;
        }

        ExecutionSummary other = (ExecutionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.taskRecordId, other.taskRecordId)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.processReferenceId, other.processReferenceId)
                && java.util.Objects.equals(this.sequence, other.sequence)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.taskRecordId == null ? 43 : this.taskRecordId.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.processReferenceId == null
                                ? 43
                                : this.processReferenceId.hashCode());
        result = (result * PRIME) + (this.sequence == null ? 43 : this.sequence.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
