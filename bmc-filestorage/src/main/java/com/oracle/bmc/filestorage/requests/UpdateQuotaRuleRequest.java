/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/UpdateQuotaRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateQuotaRuleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class UpdateQuotaRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails> {

    /** Details for editing a quota rule. */
    private com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails updateQuotaRuleDetails;

    /** Details for editing a quota rule. */
    public com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails getUpdateQuotaRuleDetails() {
        return updateQuotaRuleDetails;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     */
    private String fileSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    /**
     * The identifier of the quota rule. It is the base64 encoded string of the tuple <principalId,
     * principalType, isHardQuota>.
     */
    private String quotaRuleId;

    /**
     * The identifier of the quota rule. It is the base64 encoded string of the tuple <principalId,
     * principalType, isHardQuota>.
     */
    public String getQuotaRuleId() {
        return quotaRuleId;
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
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
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
    public com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails getBody$() {
        return updateQuotaRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateQuotaRuleRequest,
                    com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for editing a quota rule. */
        private com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails updateQuotaRuleDetails =
                null;

        /**
         * Details for editing a quota rule.
         *
         * @param updateQuotaRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateQuotaRuleDetails(
                com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails updateQuotaRuleDetails) {
            this.updateQuotaRuleDetails = updateQuotaRuleDetails;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         */
        private String fileSystemId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         *
         * @param fileSystemId the value to set
         * @return this builder instance
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The identifier of the quota rule. It is the base64 encoded string of the tuple
         * <principalId, principalType, isHardQuota>.
         */
        private String quotaRuleId = null;

        /**
         * The identifier of the quota rule. It is the base64 encoded string of the tuple
         * <principalId, principalType, isHardQuota>.
         *
         * @param quotaRuleId the value to set
         * @return this builder instance
         */
        public Builder quotaRuleId(String quotaRuleId) {
            this.quotaRuleId = quotaRuleId;
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
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(UpdateQuotaRuleRequest o) {
            updateQuotaRuleDetails(o.getUpdateQuotaRuleDetails());
            fileSystemId(o.getFileSystemId());
            quotaRuleId(o.getQuotaRuleId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateQuotaRuleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateQuotaRuleRequest
         */
        public UpdateQuotaRuleRequest build() {
            UpdateQuotaRuleRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.filestorage.model.UpdateQuotaRuleDetails body) {
            updateQuotaRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateQuotaRuleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateQuotaRuleRequest
         */
        public UpdateQuotaRuleRequest buildWithoutInvocationCallback() {
            UpdateQuotaRuleRequest request = new UpdateQuotaRuleRequest();
            request.updateQuotaRuleDetails = updateQuotaRuleDetails;
            request.fileSystemId = fileSystemId;
            request.quotaRuleId = quotaRuleId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateQuotaRuleRequest(updateQuotaRuleDetails, fileSystemId, quotaRuleId,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateQuotaRuleDetails(updateQuotaRuleDetails)
                .fileSystemId(fileSystemId)
                .quotaRuleId(quotaRuleId)
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
        sb.append(",updateQuotaRuleDetails=").append(String.valueOf(this.updateQuotaRuleDetails));
        sb.append(",fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(",quotaRuleId=").append(String.valueOf(this.quotaRuleId));
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
        if (!(o instanceof UpdateQuotaRuleRequest)) {
            return false;
        }

        UpdateQuotaRuleRequest other = (UpdateQuotaRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateQuotaRuleDetails, other.updateQuotaRuleDetails)
                && java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.quotaRuleId, other.quotaRuleId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateQuotaRuleDetails == null
                                ? 43
                                : this.updateQuotaRuleDetails.hashCode());
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result = (result * PRIME) + (this.quotaRuleId == null ? 43 : this.quotaRuleId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
