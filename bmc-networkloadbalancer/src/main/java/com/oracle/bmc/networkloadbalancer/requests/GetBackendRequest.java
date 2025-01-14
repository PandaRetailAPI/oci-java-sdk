/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.requests;

import com.oracle.bmc.networkloadbalancer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkloadbalancer/GetBackendExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBackendRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class GetBackendRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer to update.
     */
    private String networkLoadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer to update.
     */
    public String getNetworkLoadBalancerId() {
        return networkLoadBalancerId;
    }
    /**
     * The name of the backend set that includes the backend server.
     *
     * <p>Example: {@code example_backend_set}
     */
    private String backendSetName;

    /**
     * The name of the backend set that includes the backend server.
     *
     * <p>Example: {@code example_backend_set}
     */
    public String getBackendSetName() {
        return backendSetName;
    }
    /**
     * The name of the backend server to retrieve. If the backend was created with an explicitly
     * specified name, that name should be used here. If the backend was created without explicitly
     * specifying the name, but was created using ipAddress, this is specified as
     * <ipAddress>:<port>. If the backend was created without explicitly specifying the name, but
     * was created using targetId, this is specified as <targetId>:<port>.
     *
     * <p>Example: {@code 10.0.0.3:8080} or {@code
     * ocid1.privateip..oc1.<var>&lt;unique_ID&gt;</var>:8080}
     */
    private String backendName;

    /**
     * The name of the backend server to retrieve. If the backend was created with an explicitly
     * specified name, that name should be used here. If the backend was created without explicitly
     * specifying the name, but was created using ipAddress, this is specified as
     * <ipAddress>:<port>. If the backend was created without explicitly specifying the name, but
     * was created using targetId, this is specified as <targetId>:<port>.
     *
     * <p>Example: {@code 10.0.0.3:8080} or {@code
     * ocid1.privateip..oc1.<var>&lt;unique_ID&gt;</var>:8080}
     */
    public String getBackendName() {
        return backendName;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The system returns the requested resource, with a 200 status, only if the resource has no
     * etag matching the one specified. If the condition fails for the GET and HEAD methods, then
     * the system returns the HTTP status code {@code 304 (Not Modified)}.
     *
     * <p>Example: {@code example-etag}
     */
    private String ifNoneMatch;

    /**
     * The system returns the requested resource, with a 200 status, only if the resource has no
     * etag matching the one specified. If the condition fails for the GET and HEAD methods, then
     * the system returns the HTTP status code {@code 304 (Not Modified)}.
     *
     * <p>Example: {@code example-etag}
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBackendRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer to update.
         */
        private String networkLoadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer to update.
         *
         * @param networkLoadBalancerId the value to set
         * @return this builder instance
         */
        public Builder networkLoadBalancerId(String networkLoadBalancerId) {
            this.networkLoadBalancerId = networkLoadBalancerId;
            return this;
        }

        /**
         * The name of the backend set that includes the backend server.
         *
         * <p>Example: {@code example_backend_set}
         */
        private String backendSetName = null;

        /**
         * The name of the backend set that includes the backend server.
         *
         * <p>Example: {@code example_backend_set}
         *
         * @param backendSetName the value to set
         * @return this builder instance
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            return this;
        }

        /**
         * The name of the backend server to retrieve. If the backend was created with an explicitly
         * specified name, that name should be used here. If the backend was created without
         * explicitly specifying the name, but was created using ipAddress, this is specified as
         * <ipAddress>:<port>. If the backend was created without explicitly specifying the name,
         * but was created using targetId, this is specified as <targetId>:<port>.
         *
         * <p>Example: {@code 10.0.0.3:8080} or {@code
         * ocid1.privateip..oc1.<var>&lt;unique_ID&gt;</var>:8080}
         */
        private String backendName = null;

        /**
         * The name of the backend server to retrieve. If the backend was created with an explicitly
         * specified name, that name should be used here. If the backend was created without
         * explicitly specifying the name, but was created using ipAddress, this is specified as
         * <ipAddress>:<port>. If the backend was created without explicitly specifying the name,
         * but was created using targetId, this is specified as <targetId>:<port>.
         *
         * <p>Example: {@code 10.0.0.3:8080} or {@code
         * ocid1.privateip..oc1.<var>&lt;unique_ID&gt;</var>:8080}
         *
         * @param backendName the value to set
         * @return this builder instance
         */
        public Builder backendName(String backendName) {
            this.backendName = backendName;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The system returns the requested resource, with a 200 status, only if the resource has no
         * etag matching the one specified. If the condition fails for the GET and HEAD methods,
         * then the system returns the HTTP status code {@code 304 (Not Modified)}.
         *
         * <p>Example: {@code example-etag}
         */
        private String ifNoneMatch = null;

        /**
         * The system returns the requested resource, with a 200 status, only if the resource has no
         * etag matching the one specified. If the condition fails for the GET and HEAD methods,
         * then the system returns the HTTP status code {@code 304 (Not Modified)}.
         *
         * <p>Example: {@code example-etag}
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
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
        public Builder copy(GetBackendRequest o) {
            networkLoadBalancerId(o.getNetworkLoadBalancerId());
            backendSetName(o.getBackendSetName());
            backendName(o.getBackendName());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBackendRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetBackendRequest
         */
        public GetBackendRequest build() {
            GetBackendRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetBackendRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetBackendRequest
         */
        public GetBackendRequest buildWithoutInvocationCallback() {
            GetBackendRequest request = new GetBackendRequest();
            request.networkLoadBalancerId = networkLoadBalancerId;
            request.backendSetName = backendSetName;
            request.backendName = backendName;
            request.opcRequestId = opcRequestId;
            request.ifNoneMatch = ifNoneMatch;
            return request;
            // new GetBackendRequest(networkLoadBalancerId, backendSetName, backendName,
            // opcRequestId, ifNoneMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkLoadBalancerId(networkLoadBalancerId)
                .backendSetName(backendSetName)
                .backendName(backendName)
                .opcRequestId(opcRequestId)
                .ifNoneMatch(ifNoneMatch);
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
        sb.append(",networkLoadBalancerId=").append(String.valueOf(this.networkLoadBalancerId));
        sb.append(",backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(",backendName=").append(String.valueOf(this.backendName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBackendRequest)) {
            return false;
        }

        GetBackendRequest other = (GetBackendRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkLoadBalancerId, other.networkLoadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && java.util.Objects.equals(this.backendName, other.backendName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerId == null
                                ? 43
                                : this.networkLoadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + (this.backendName == null ? 43 : this.backendName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        return result;
    }
}
