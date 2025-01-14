/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.requests;

import com.oracle.bmc.artifacts.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/UpdateContainerImageSignatureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateContainerImageSignatureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateContainerImageSignatureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the container image signature.
     *
     * <p>Example: {@code ocid1.containersignature.oc1..exampleuniqueID}
     */
    private String imageSignatureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the container image signature.
     *
     * <p>Example: {@code ocid1.containersignature.oc1..exampleuniqueID}
     */
    public String getImageSignatureId() {
        return imageSignatureId;
    }
    /** Update container image signature details. */
    private com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails
            updateContainerImageSignatureDetails;

    /** Update container image signature details. */
    public com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails
            getUpdateContainerImageSignatureDetails() {
        return updateContainerImageSignatureDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails getBody$() {
        return updateContainerImageSignatureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateContainerImageSignatureRequest,
                    com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the container image signature.
         *
         * <p>Example: {@code ocid1.containersignature.oc1..exampleuniqueID}
         */
        private String imageSignatureId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the container image signature.
         *
         * <p>Example: {@code ocid1.containersignature.oc1..exampleuniqueID}
         *
         * @param imageSignatureId the value to set
         * @return this builder instance
         */
        public Builder imageSignatureId(String imageSignatureId) {
            this.imageSignatureId = imageSignatureId;
            return this;
        }

        /** Update container image signature details. */
        private com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails
                updateContainerImageSignatureDetails = null;

        /**
         * Update container image signature details.
         *
         * @param updateContainerImageSignatureDetails the value to set
         * @return this builder instance
         */
        public Builder updateContainerImageSignatureDetails(
                com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails
                        updateContainerImageSignatureDetails) {
            this.updateContainerImageSignatureDetails = updateContainerImageSignatureDetails;
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
        public Builder copy(UpdateContainerImageSignatureRequest o) {
            imageSignatureId(o.getImageSignatureId());
            updateContainerImageSignatureDetails(o.getUpdateContainerImageSignatureDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateContainerImageSignatureRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateContainerImageSignatureRequest
         */
        public UpdateContainerImageSignatureRequest build() {
            UpdateContainerImageSignatureRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.artifacts.model.UpdateContainerImageSignatureDetails body) {
            updateContainerImageSignatureDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateContainerImageSignatureRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateContainerImageSignatureRequest
         */
        public UpdateContainerImageSignatureRequest buildWithoutInvocationCallback() {
            UpdateContainerImageSignatureRequest request =
                    new UpdateContainerImageSignatureRequest();
            request.imageSignatureId = imageSignatureId;
            request.updateContainerImageSignatureDetails = updateContainerImageSignatureDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateContainerImageSignatureRequest(imageSignatureId,
            // updateContainerImageSignatureDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .imageSignatureId(imageSignatureId)
                .updateContainerImageSignatureDetails(updateContainerImageSignatureDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",imageSignatureId=").append(String.valueOf(this.imageSignatureId));
        sb.append(",updateContainerImageSignatureDetails=")
                .append(String.valueOf(this.updateContainerImageSignatureDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateContainerImageSignatureRequest)) {
            return false;
        }

        UpdateContainerImageSignatureRequest other = (UpdateContainerImageSignatureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.imageSignatureId, other.imageSignatureId)
                && java.util.Objects.equals(
                        this.updateContainerImageSignatureDetails,
                        other.updateContainerImageSignatureDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.imageSignatureId == null ? 43 : this.imageSignatureId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateContainerImageSignatureDetails == null
                                ? 43
                                : this.updateContainerImageSignatureDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
