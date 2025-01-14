/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.responses;

import com.oracle.bmc.delegateaccesscontrol.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class UpdateDelegationSubscriptionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** URI of the resource */
    private String contentLocation;

    /**
     * URI of the resource
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code DelegationSubscription} instance. */
    private com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
            delegationSubscription;

    /**
     * The returned {@code DelegationSubscription} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
            getDelegationSubscription() {
        return delegationSubscription;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcWorkRequestId",
        "contentLocation",
        "etag",
        "delegationSubscription"
    })
    private UpdateDelegationSubscriptionResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcWorkRequestId,
            String contentLocation,
            String etag,
            com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
                    delegationSubscription) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.delegationSubscription = delegationSubscription;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateDelegationSubscriptionResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the asynchronous work request. Use GetWorkRequest with this ID to track the status of
         * the request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the asynchronous work request. Use GetWorkRequest with this ID to track the status of
         * the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** URI of the resource */
        private String contentLocation;

        /**
         * URI of the resource
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code DelegationSubscription} instance. */
        private com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
                delegationSubscription;

        /**
         * The returned {@code DelegationSubscription} instance.
         *
         * @param delegationSubscription the value to set
         * @return this builder
         */
        public Builder delegationSubscription(
                com.oracle.bmc.delegateaccesscontrol.model.DelegationSubscription
                        delegationSubscription) {
            this.delegationSubscription = delegationSubscription;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateDelegationSubscriptionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            delegationSubscription(o.getDelegationSubscription());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateDelegationSubscriptionResponse build() {
            return new UpdateDelegationSubscriptionResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcWorkRequestId,
                    contentLocation,
                    etag,
                    delegationSubscription);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",delegationSubscription=").append(String.valueOf(delegationSubscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDelegationSubscriptionResponse)) {
            return false;
        }

        UpdateDelegationSubscriptionResponse other = (UpdateDelegationSubscriptionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.delegationSubscription, other.delegationSubscription);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.delegationSubscription == null
                                ? 43
                                : this.delegationSubscription.hashCode());
        return result;
    }
}
