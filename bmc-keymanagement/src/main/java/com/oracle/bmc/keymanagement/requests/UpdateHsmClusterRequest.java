/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/UpdateHsmClusterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateHsmClusterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class UpdateHsmClusterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails> {

    /** The OCID of the HSM Cluster. This is a unique identifier assigned to each hsmCluster. */
    private String hsmClusterId;

    /** The OCID of the HSM Cluster. This is a unique identifier assigned to each hsmCluster. */
    public String getHsmClusterId() {
        return hsmClusterId;
    }
    /** Details of the HsmCluster Resource */
    private com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails updateHsmClusterDetails;

    /** Details of the HsmCluster Resource */
    public com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails getUpdateHsmClusterDetails() {
        return updateHsmClusterDetails;
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
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
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
    public com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails getBody$() {
        return updateHsmClusterDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateHsmClusterRequest,
                    com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the HSM Cluster. This is a unique identifier assigned to each hsmCluster. */
        private String hsmClusterId = null;

        /**
         * The OCID of the HSM Cluster. This is a unique identifier assigned to each hsmCluster.
         *
         * @param hsmClusterId the value to set
         * @return this builder instance
         */
        public Builder hsmClusterId(String hsmClusterId) {
            this.hsmClusterId = hsmClusterId;
            return this;
        }

        /** Details of the HsmCluster Resource */
        private com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails updateHsmClusterDetails =
                null;

        /**
         * Details of the HsmCluster Resource
         *
         * @param updateHsmClusterDetails the value to set
         * @return this builder instance
         */
        public Builder updateHsmClusterDetails(
                com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails
                        updateHsmClusterDetails) {
            this.updateHsmClusterDetails = updateHsmClusterDetails;
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
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
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
        public Builder copy(UpdateHsmClusterRequest o) {
            hsmClusterId(o.getHsmClusterId());
            updateHsmClusterDetails(o.getUpdateHsmClusterDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateHsmClusterRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateHsmClusterRequest
         */
        public UpdateHsmClusterRequest build() {
            UpdateHsmClusterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.keymanagement.model.UpdateHsmClusterDetails body) {
            updateHsmClusterDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateHsmClusterRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateHsmClusterRequest
         */
        public UpdateHsmClusterRequest buildWithoutInvocationCallback() {
            UpdateHsmClusterRequest request = new UpdateHsmClusterRequest();
            request.hsmClusterId = hsmClusterId;
            request.updateHsmClusterDetails = updateHsmClusterDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateHsmClusterRequest(hsmClusterId, updateHsmClusterDetails, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .hsmClusterId(hsmClusterId)
                .updateHsmClusterDetails(updateHsmClusterDetails)
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
        sb.append(",hsmClusterId=").append(String.valueOf(this.hsmClusterId));
        sb.append(",updateHsmClusterDetails=").append(String.valueOf(this.updateHsmClusterDetails));
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
        if (!(o instanceof UpdateHsmClusterRequest)) {
            return false;
        }

        UpdateHsmClusterRequest other = (UpdateHsmClusterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.hsmClusterId, other.hsmClusterId)
                && java.util.Objects.equals(
                        this.updateHsmClusterDetails, other.updateHsmClusterDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.hsmClusterId == null ? 43 : this.hsmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateHsmClusterDetails == null
                                ? 43
                                : this.updateHsmClusterDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
