/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateMlApplicationImplementationVersionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateMlApplicationImplementationVersionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class UpdateMlApplicationImplementationVersionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails> {

    /** unique MlApplicationImplementationVersion identifier */
    private String mlApplicationImplementationVersionId;

    /** unique MlApplicationImplementationVersion identifier */
    public String getMlApplicationImplementationVersionId() {
        return mlApplicationImplementationVersionId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails
            updateMlApplicationImplementationVersionDetails;

    /** The information to be updated. */
    public com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails
            getUpdateMlApplicationImplementationVersionDetails() {
        return updateMlApplicationImplementationVersionDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
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
    public com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails
            getBody$() {
        return updateMlApplicationImplementationVersionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMlApplicationImplementationVersionRequest,
                    com.oracle.bmc.datascience.model
                            .UpdateMlApplicationImplementationVersionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique MlApplicationImplementationVersion identifier */
        private String mlApplicationImplementationVersionId = null;

        /**
         * unique MlApplicationImplementationVersion identifier
         *
         * @param mlApplicationImplementationVersionId the value to set
         * @return this builder instance
         */
        public Builder mlApplicationImplementationVersionId(
                String mlApplicationImplementationVersionId) {
            this.mlApplicationImplementationVersionId = mlApplicationImplementationVersionId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails
                updateMlApplicationImplementationVersionDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateMlApplicationImplementationVersionDetails the value to set
         * @return this builder instance
         */
        public Builder updateMlApplicationImplementationVersionDetails(
                com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails
                        updateMlApplicationImplementationVersionDetails) {
            this.updateMlApplicationImplementationVersionDetails =
                    updateMlApplicationImplementationVersionDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
        public Builder copy(UpdateMlApplicationImplementationVersionRequest o) {
            mlApplicationImplementationVersionId(o.getMlApplicationImplementationVersionId());
            updateMlApplicationImplementationVersionDetails(
                    o.getUpdateMlApplicationImplementationVersionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMlApplicationImplementationVersionRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMlApplicationImplementationVersionRequest
         */
        public UpdateMlApplicationImplementationVersionRequest build() {
            UpdateMlApplicationImplementationVersionRequest request =
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
                com.oracle.bmc.datascience.model.UpdateMlApplicationImplementationVersionDetails
                        body) {
            updateMlApplicationImplementationVersionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMlApplicationImplementationVersionRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMlApplicationImplementationVersionRequest
         */
        public UpdateMlApplicationImplementationVersionRequest buildWithoutInvocationCallback() {
            UpdateMlApplicationImplementationVersionRequest request =
                    new UpdateMlApplicationImplementationVersionRequest();
            request.mlApplicationImplementationVersionId = mlApplicationImplementationVersionId;
            request.updateMlApplicationImplementationVersionDetails =
                    updateMlApplicationImplementationVersionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // UpdateMlApplicationImplementationVersionRequest(mlApplicationImplementationVersionId,
            // updateMlApplicationImplementationVersionDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mlApplicationImplementationVersionId(mlApplicationImplementationVersionId)
                .updateMlApplicationImplementationVersionDetails(
                        updateMlApplicationImplementationVersionDetails)
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
        sb.append(",mlApplicationImplementationVersionId=")
                .append(String.valueOf(this.mlApplicationImplementationVersionId));
        sb.append(",updateMlApplicationImplementationVersionDetails=")
                .append(String.valueOf(this.updateMlApplicationImplementationVersionDetails));
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
        if (!(o instanceof UpdateMlApplicationImplementationVersionRequest)) {
            return false;
        }

        UpdateMlApplicationImplementationVersionRequest other =
                (UpdateMlApplicationImplementationVersionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationVersionId,
                        other.mlApplicationImplementationVersionId)
                && java.util.Objects.equals(
                        this.updateMlApplicationImplementationVersionDetails,
                        other.updateMlApplicationImplementationVersionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationVersionId == null
                                ? 43
                                : this.mlApplicationImplementationVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMlApplicationImplementationVersionDetails == null
                                ? 43
                                : this.updateMlApplicationImplementationVersionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
