/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.requests;

import com.oracle.bmc.rover.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RetrieveBundleStatusRoverClusterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RetrieveBundleStatusRoverClusterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RetrieveBundleStatusRoverClusterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.rover.model.RoverBundleStatusDetails> {

    /** Provide the rover bundle details that requires to retrieve its status. */
    private com.oracle.bmc.rover.model.RoverBundleStatusDetails roverBundleStatusDetails;

    /** Provide the rover bundle details that requires to retrieve its status. */
    public com.oracle.bmc.rover.model.RoverBundleStatusDetails getRoverBundleStatusDetails() {
        return roverBundleStatusDetails;
    }
    /** Unique RoverCluster identifier */
    private String roverClusterId;

    /** Unique RoverCluster identifier */
    public String getRoverClusterId() {
        return roverClusterId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.rover.model.RoverBundleStatusDetails getBody$() {
        return roverBundleStatusDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RetrieveBundleStatusRoverClusterRequest,
                    com.oracle.bmc.rover.model.RoverBundleStatusDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Provide the rover bundle details that requires to retrieve its status. */
        private com.oracle.bmc.rover.model.RoverBundleStatusDetails roverBundleStatusDetails = null;

        /**
         * Provide the rover bundle details that requires to retrieve its status.
         *
         * @param roverBundleStatusDetails the value to set
         * @return this builder instance
         */
        public Builder roverBundleStatusDetails(
                com.oracle.bmc.rover.model.RoverBundleStatusDetails roverBundleStatusDetails) {
            this.roverBundleStatusDetails = roverBundleStatusDetails;
            return this;
        }

        /** Unique RoverCluster identifier */
        private String roverClusterId = null;

        /**
         * Unique RoverCluster identifier
         *
         * @param roverClusterId the value to set
         * @return this builder instance
         */
        public Builder roverClusterId(String roverClusterId) {
            this.roverClusterId = roverClusterId;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(RetrieveBundleStatusRoverClusterRequest o) {
            roverBundleStatusDetails(o.getRoverBundleStatusDetails());
            roverClusterId(o.getRoverClusterId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RetrieveBundleStatusRoverClusterRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RetrieveBundleStatusRoverClusterRequest
         */
        public RetrieveBundleStatusRoverClusterRequest build() {
            RetrieveBundleStatusRoverClusterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.rover.model.RoverBundleStatusDetails body) {
            roverBundleStatusDetails(body);
            return this;
        }

        /**
         * Build the instance of RetrieveBundleStatusRoverClusterRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RetrieveBundleStatusRoverClusterRequest
         */
        public RetrieveBundleStatusRoverClusterRequest buildWithoutInvocationCallback() {
            RetrieveBundleStatusRoverClusterRequest request =
                    new RetrieveBundleStatusRoverClusterRequest();
            request.roverBundleStatusDetails = roverBundleStatusDetails;
            request.roverClusterId = roverClusterId;
            request.opcRequestId = opcRequestId;
            return request;
            // new RetrieveBundleStatusRoverClusterRequest(roverBundleStatusDetails, roverClusterId,
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
                .roverBundleStatusDetails(roverBundleStatusDetails)
                .roverClusterId(roverClusterId)
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
        sb.append(",roverBundleStatusDetails=")
                .append(String.valueOf(this.roverBundleStatusDetails));
        sb.append(",roverClusterId=").append(String.valueOf(this.roverClusterId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrieveBundleStatusRoverClusterRequest)) {
            return false;
        }

        RetrieveBundleStatusRoverClusterRequest other = (RetrieveBundleStatusRoverClusterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.roverBundleStatusDetails, other.roverBundleStatusDetails)
                && java.util.Objects.equals(this.roverClusterId, other.roverClusterId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.roverBundleStatusDetails == null
                                ? 43
                                : this.roverBundleStatusDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.roverClusterId == null ? 43 : this.roverClusterId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
