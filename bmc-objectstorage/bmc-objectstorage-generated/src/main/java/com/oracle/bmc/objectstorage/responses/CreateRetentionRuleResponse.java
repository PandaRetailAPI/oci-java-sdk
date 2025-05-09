/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateRetentionRuleResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when
     * debugging.
     *
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /** The entity tag (ETag) for the retention rule that was created. */
    private String etag;

    /**
     * The entity tag (ETag) for the retention rule that was created.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code RetentionRule} instance. */
    private com.oracle.bmc.objectstorage.model.RetentionRule retentionRule;

    /**
     * The returned {@code RetentionRule} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.objectstorage.model.RetentionRule getRetentionRule() {
        return retentionRule;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcClientRequestId",
        "etag",
        "retentionRule"
    })
    private CreateRetentionRuleResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcClientRequestId,
            String etag,
            com.oracle.bmc.objectstorage.model.RetentionRule retentionRule) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.etag = etag;
        this.retentionRule = retentionRule;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateRetentionRuleResponse> {
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
         * particular request, provide this request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when
         * debugging.
         *
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /** The entity tag (ETag) for the retention rule that was created. */
        private String etag;

        /**
         * The entity tag (ETag) for the retention rule that was created.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code RetentionRule} instance. */
        private com.oracle.bmc.objectstorage.model.RetentionRule retentionRule;

        /**
         * The returned {@code RetentionRule} instance.
         *
         * @param retentionRule the value to set
         * @return this builder
         */
        public Builder retentionRule(
                com.oracle.bmc.objectstorage.model.RetentionRule retentionRule) {
            this.retentionRule = retentionRule;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateRetentionRuleResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            etag(o.getEtag());
            retentionRule(o.getRetentionRule());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateRetentionRuleResponse build() {
            return new CreateRetentionRuleResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcClientRequestId,
                    etag,
                    retentionRule);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",retentionRule=").append(String.valueOf(retentionRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRetentionRuleResponse)) {
            return false;
        }

        CreateRetentionRuleResponse other = (CreateRetentionRuleResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.retentionRule, other.retentionRule);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionRule == null ? 43 : this.retentionRule.hashCode());
        return result;
    }
}
