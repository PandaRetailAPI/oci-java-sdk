/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.requests;

import com.oracle.bmc.rover.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RequestBundleRoverClusterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestBundleRoverClusterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RequestBundleRoverClusterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.rover.model.RequestRoverBundleDetails> {

    /** Request the rover bundle details. */
    private com.oracle.bmc.rover.model.RequestRoverBundleDetails requestRoverBundleDetails;

    /** Request the rover bundle details. */
    public com.oracle.bmc.rover.model.RequestRoverBundleDetails getRequestRoverBundleDetails() {
        return requestRoverBundleDetails;
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
    public com.oracle.bmc.rover.model.RequestRoverBundleDetails getBody$() {
        return requestRoverBundleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestBundleRoverClusterRequest,
                    com.oracle.bmc.rover.model.RequestRoverBundleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request the rover bundle details. */
        private com.oracle.bmc.rover.model.RequestRoverBundleDetails requestRoverBundleDetails =
                null;

        /**
         * Request the rover bundle details.
         *
         * @param requestRoverBundleDetails the value to set
         * @return this builder instance
         */
        public Builder requestRoverBundleDetails(
                com.oracle.bmc.rover.model.RequestRoverBundleDetails requestRoverBundleDetails) {
            this.requestRoverBundleDetails = requestRoverBundleDetails;
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
        public Builder copy(RequestBundleRoverClusterRequest o) {
            requestRoverBundleDetails(o.getRequestRoverBundleDetails());
            roverClusterId(o.getRoverClusterId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestBundleRoverClusterRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestBundleRoverClusterRequest
         */
        public RequestBundleRoverClusterRequest build() {
            RequestBundleRoverClusterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.rover.model.RequestRoverBundleDetails body) {
            requestRoverBundleDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestBundleRoverClusterRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestBundleRoverClusterRequest
         */
        public RequestBundleRoverClusterRequest buildWithoutInvocationCallback() {
            RequestBundleRoverClusterRequest request = new RequestBundleRoverClusterRequest();
            request.requestRoverBundleDetails = requestRoverBundleDetails;
            request.roverClusterId = roverClusterId;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestBundleRoverClusterRequest(requestRoverBundleDetails, roverClusterId,
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
                .requestRoverBundleDetails(requestRoverBundleDetails)
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
        sb.append(",requestRoverBundleDetails=")
                .append(String.valueOf(this.requestRoverBundleDetails));
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
        if (!(o instanceof RequestBundleRoverClusterRequest)) {
            return false;
        }

        RequestBundleRoverClusterRequest other = (RequestBundleRoverClusterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.requestRoverBundleDetails, other.requestRoverBundleDetails)
                && java.util.Objects.equals(this.roverClusterId, other.roverClusterId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.requestRoverBundleDetails == null
                                ? 43
                                : this.requestRoverBundleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.roverClusterId == null ? 43 : this.roverClusterId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
