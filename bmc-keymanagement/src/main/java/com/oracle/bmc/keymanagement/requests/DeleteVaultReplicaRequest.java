/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/DeleteVaultReplicaExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteVaultReplicaRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class DeleteVaultReplicaRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails> {

    /** The OCID of the vault. */
    private String vaultId;

    /** The OCID of the vault. */
    public String getVaultId() {
        return vaultId;
    }
    /** DeleteVaultReplicaDetails */
    private com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails deleteVaultReplicaDetails;

    /** DeleteVaultReplicaDetails */
    public com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails
            getDeleteVaultReplicaDetails() {
        return deleteVaultReplicaDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails getBody$() {
        return deleteVaultReplicaDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteVaultReplicaRequest,
                    com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the vault. */
        private String vaultId = null;

        /**
         * The OCID of the vault.
         *
         * @param vaultId the value to set
         * @return this builder instance
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        /** DeleteVaultReplicaDetails */
        private com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails
                deleteVaultReplicaDetails = null;

        /**
         * DeleteVaultReplicaDetails
         *
         * @param deleteVaultReplicaDetails the value to set
         * @return this builder instance
         */
        public Builder deleteVaultReplicaDetails(
                com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails
                        deleteVaultReplicaDetails) {
            this.deleteVaultReplicaDetails = deleteVaultReplicaDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(DeleteVaultReplicaRequest o) {
            vaultId(o.getVaultId());
            deleteVaultReplicaDetails(o.getDeleteVaultReplicaDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteVaultReplicaRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteVaultReplicaRequest
         */
        public DeleteVaultReplicaRequest build() {
            DeleteVaultReplicaRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.keymanagement.model.DeleteVaultReplicaDetails body) {
            deleteVaultReplicaDetails(body);
            return this;
        }

        /**
         * Build the instance of DeleteVaultReplicaRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteVaultReplicaRequest
         */
        public DeleteVaultReplicaRequest buildWithoutInvocationCallback() {
            DeleteVaultReplicaRequest request = new DeleteVaultReplicaRequest();
            request.vaultId = vaultId;
            request.deleteVaultReplicaDetails = deleteVaultReplicaDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new DeleteVaultReplicaRequest(vaultId, deleteVaultReplicaDetails, ifMatch,
            // opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .vaultId(vaultId)
                .deleteVaultReplicaDetails(deleteVaultReplicaDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",vaultId=").append(String.valueOf(this.vaultId));
        sb.append(",deleteVaultReplicaDetails=")
                .append(String.valueOf(this.deleteVaultReplicaDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteVaultReplicaRequest)) {
            return false;
        }

        DeleteVaultReplicaRequest other = (DeleteVaultReplicaRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.deleteVaultReplicaDetails, other.deleteVaultReplicaDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteVaultReplicaDetails == null
                                ? 43
                                : this.deleteVaultReplicaDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
