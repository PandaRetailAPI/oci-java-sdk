/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/DownloadMaskingPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DownloadMaskingPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class DownloadMaskingPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails> {

    /** The OCID of the masking policy. */
    private String maskingPolicyId;

    /** The OCID of the masking policy. */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /** Details to download a masking policy file. */
    private com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails downloadMaskingPolicyDetails;

    /** Details to download a masking policy file. */
    public com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails
            getDownloadMaskingPolicyDetails() {
        return downloadMaskingPolicyDetails;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails getBody$() {
        return downloadMaskingPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DownloadMaskingPolicyRequest,
                    com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the masking policy. */
        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         *
         * @param maskingPolicyId the value to set
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }

        /** Details to download a masking policy file. */
        private com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails
                downloadMaskingPolicyDetails = null;

        /**
         * Details to download a masking policy file.
         *
         * @param downloadMaskingPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder downloadMaskingPolicyDetails(
                com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails
                        downloadMaskingPolicyDetails) {
            this.downloadMaskingPolicyDetails = downloadMaskingPolicyDetails;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(DownloadMaskingPolicyRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            downloadMaskingPolicyDetails(o.getDownloadMaskingPolicyDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DownloadMaskingPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DownloadMaskingPolicyRequest
         */
        public DownloadMaskingPolicyRequest build() {
            DownloadMaskingPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.DownloadMaskingPolicyDetails body) {
            downloadMaskingPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of DownloadMaskingPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DownloadMaskingPolicyRequest
         */
        public DownloadMaskingPolicyRequest buildWithoutInvocationCallback() {
            DownloadMaskingPolicyRequest request = new DownloadMaskingPolicyRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.downloadMaskingPolicyDetails = downloadMaskingPolicyDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DownloadMaskingPolicyRequest(maskingPolicyId, downloadMaskingPolicyDetails,
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
                .maskingPolicyId(maskingPolicyId)
                .downloadMaskingPolicyDetails(downloadMaskingPolicyDetails)
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
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",downloadMaskingPolicyDetails=")
                .append(String.valueOf(this.downloadMaskingPolicyDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadMaskingPolicyRequest)) {
            return false;
        }

        DownloadMaskingPolicyRequest other = (DownloadMaskingPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(
                        this.downloadMaskingPolicyDetails, other.downloadMaskingPolicyDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.downloadMaskingPolicyDetails == null
                                ? 43
                                : this.downloadMaskingPolicyDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
