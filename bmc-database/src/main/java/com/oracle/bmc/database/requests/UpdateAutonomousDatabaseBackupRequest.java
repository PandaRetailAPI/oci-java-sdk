/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseBackupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAutonomousDatabaseBackupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAutonomousDatabaseBackupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Database backup.
     */
    private String autonomousDatabaseBackupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Database backup.
     */
    public String getAutonomousDatabaseBackupId() {
        return autonomousDatabaseBackupId;
    }
    /** Request to update an existing Autonomous Database backup. */
    private com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails
            updateAutonomousDatabaseBackupDetails;

    /** Request to update an existing Autonomous Database backup. */
    public com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails
            getUpdateAutonomousDatabaseBackupDetails() {
        return updateAutonomousDatabaseBackupDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails getBody$() {
        return updateAutonomousDatabaseBackupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutonomousDatabaseBackupRequest,
                    com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database backup.
         */
        private String autonomousDatabaseBackupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database backup.
         *
         * @param autonomousDatabaseBackupId the value to set
         * @return this builder instance
         */
        public Builder autonomousDatabaseBackupId(String autonomousDatabaseBackupId) {
            this.autonomousDatabaseBackupId = autonomousDatabaseBackupId;
            return this;
        }

        /** Request to update an existing Autonomous Database backup. */
        private com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails
                updateAutonomousDatabaseBackupDetails = null;

        /**
         * Request to update an existing Autonomous Database backup.
         *
         * @param updateAutonomousDatabaseBackupDetails the value to set
         * @return this builder instance
         */
        public Builder updateAutonomousDatabaseBackupDetails(
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails
                        updateAutonomousDatabaseBackupDetails) {
            this.updateAutonomousDatabaseBackupDetails = updateAutonomousDatabaseBackupDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(UpdateAutonomousDatabaseBackupRequest o) {
            autonomousDatabaseBackupId(o.getAutonomousDatabaseBackupId());
            updateAutonomousDatabaseBackupDetails(o.getUpdateAutonomousDatabaseBackupDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousDatabaseBackupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutonomousDatabaseBackupRequest
         */
        public UpdateAutonomousDatabaseBackupRequest build() {
            UpdateAutonomousDatabaseBackupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseBackupDetails body) {
            updateAutonomousDatabaseBackupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousDatabaseBackupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutonomousDatabaseBackupRequest
         */
        public UpdateAutonomousDatabaseBackupRequest buildWithoutInvocationCallback() {
            UpdateAutonomousDatabaseBackupRequest request =
                    new UpdateAutonomousDatabaseBackupRequest();
            request.autonomousDatabaseBackupId = autonomousDatabaseBackupId;
            request.updateAutonomousDatabaseBackupDetails = updateAutonomousDatabaseBackupDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAutonomousDatabaseBackupRequest(autonomousDatabaseBackupId,
            // updateAutonomousDatabaseBackupDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousDatabaseBackupId(autonomousDatabaseBackupId)
                .updateAutonomousDatabaseBackupDetails(updateAutonomousDatabaseBackupDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",autonomousDatabaseBackupId=")
                .append(String.valueOf(this.autonomousDatabaseBackupId));
        sb.append(",updateAutonomousDatabaseBackupDetails=")
                .append(String.valueOf(this.updateAutonomousDatabaseBackupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseBackupRequest)) {
            return false;
        }

        UpdateAutonomousDatabaseBackupRequest other = (UpdateAutonomousDatabaseBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousDatabaseBackupId, other.autonomousDatabaseBackupId)
                && java.util.Objects.equals(
                        this.updateAutonomousDatabaseBackupDetails,
                        other.updateAutonomousDatabaseBackupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseBackupId == null
                                ? 43
                                : this.autonomousDatabaseBackupId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAutonomousDatabaseBackupDetails == null
                                ? 43
                                : this.updateAutonomousDatabaseBackupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
