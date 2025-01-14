/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdatePullRequestNotificationPreferenceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdatePullRequestNotificationPreferenceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class UpdatePullRequestNotificationPreferenceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails> {

    /** The information to be updated. */
    private com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails
            updatePullRequestNotificationPreferenceDetails;

    /** The information to be updated. */
    public com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails
            getUpdatePullRequestNotificationPreferenceDetails() {
        return updatePullRequestNotificationPreferenceDetails;
    }
    /** unique PullRequest identifier */
    private String pullRequestId;

    /** unique PullRequest identifier */
    public String getPullRequestId() {
        return pullRequestId;
    }
    /** Unique principal identifier. */
    private String principalId;

    /** Unique principal identifier. */
    public String getPrincipalId() {
        return principalId;
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
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
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
    public com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails getBody$() {
        return updatePullRequestNotificationPreferenceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePullRequestNotificationPreferenceRequest,
                    com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The information to be updated. */
        private com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails
                updatePullRequestNotificationPreferenceDetails = null;

        /**
         * The information to be updated.
         *
         * @param updatePullRequestNotificationPreferenceDetails the value to set
         * @return this builder instance
         */
        public Builder updatePullRequestNotificationPreferenceDetails(
                com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails
                        updatePullRequestNotificationPreferenceDetails) {
            this.updatePullRequestNotificationPreferenceDetails =
                    updatePullRequestNotificationPreferenceDetails;
            return this;
        }

        /** unique PullRequest identifier */
        private String pullRequestId = null;

        /**
         * unique PullRequest identifier
         *
         * @param pullRequestId the value to set
         * @return this builder instance
         */
        public Builder pullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        /** Unique principal identifier. */
        private String principalId = null;

        /**
         * Unique principal identifier.
         *
         * @param principalId the value to set
         * @return this builder instance
         */
        public Builder principalId(String principalId) {
            this.principalId = principalId;
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

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(UpdatePullRequestNotificationPreferenceRequest o) {
            updatePullRequestNotificationPreferenceDetails(
                    o.getUpdatePullRequestNotificationPreferenceDetails());
            pullRequestId(o.getPullRequestId());
            principalId(o.getPrincipalId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePullRequestNotificationPreferenceRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePullRequestNotificationPreferenceRequest
         */
        public UpdatePullRequestNotificationPreferenceRequest build() {
            UpdatePullRequestNotificationPreferenceRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.devops.model.UpdatePullRequestNotificationPreferenceDetails body) {
            updatePullRequestNotificationPreferenceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePullRequestNotificationPreferenceRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePullRequestNotificationPreferenceRequest
         */
        public UpdatePullRequestNotificationPreferenceRequest buildWithoutInvocationCallback() {
            UpdatePullRequestNotificationPreferenceRequest request =
                    new UpdatePullRequestNotificationPreferenceRequest();
            request.updatePullRequestNotificationPreferenceDetails =
                    updatePullRequestNotificationPreferenceDetails;
            request.pullRequestId = pullRequestId;
            request.principalId = principalId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // UpdatePullRequestNotificationPreferenceRequest(updatePullRequestNotificationPreferenceDetails, pullRequestId, principalId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updatePullRequestNotificationPreferenceDetails(
                        updatePullRequestNotificationPreferenceDetails)
                .pullRequestId(pullRequestId)
                .principalId(principalId)
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
        sb.append(",updatePullRequestNotificationPreferenceDetails=")
                .append(String.valueOf(this.updatePullRequestNotificationPreferenceDetails));
        sb.append(",pullRequestId=").append(String.valueOf(this.pullRequestId));
        sb.append(",principalId=").append(String.valueOf(this.principalId));
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
        if (!(o instanceof UpdatePullRequestNotificationPreferenceRequest)) {
            return false;
        }

        UpdatePullRequestNotificationPreferenceRequest other =
                (UpdatePullRequestNotificationPreferenceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updatePullRequestNotificationPreferenceDetails,
                        other.updatePullRequestNotificationPreferenceDetails)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(this.principalId, other.principalId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updatePullRequestNotificationPreferenceDetails == null
                                ? 43
                                : this.updatePullRequestNotificationPreferenceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.pullRequestId == null ? 43 : this.pullRequestId.hashCode());
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
