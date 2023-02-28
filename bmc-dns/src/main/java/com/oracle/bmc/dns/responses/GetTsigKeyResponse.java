/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.responses;

import com.oracle.bmc.dns.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetTsigKeyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The current version of the resource, ending with a representation-specific suffix. This value
     * may be used in If-Match and If-None-Match headers for later requests of the same resource.
     */
    private String eTag;

    /**
     * The current version of the resource, ending with a representation-specific suffix. This value
     * may be used in If-Match and If-None-Match headers for later requests of the same resource.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
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
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned TsigKey instance, or null if {@link #isNotModified()} is true. */
    private com.oracle.bmc.dns.model.TsigKey tsigKey;

    /**
     * The returned TsigKey instance, or null if {@link #isNotModified()} is true.
     *
     * @return the value
     */
    public com.oracle.bmc.dns.model.TsigKey getTsigKey() {
        return tsigKey;
    }

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     *
     * @param true if the object was not modified
     */
    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "eTag",
        "opcRequestId",
        "tsigKey",
        "isNotModified"
    })
    private GetTsigKeyResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String eTag,
            String opcRequestId,
            com.oracle.bmc.dns.model.TsigKey tsigKey,
            boolean isNotModified) {
        super(__httpStatusCode__, headers);
        this.eTag = eTag;
        this.opcRequestId = opcRequestId;
        this.tsigKey = tsigKey;
        this.isNotModified = isNotModified;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetTsigKeyResponse> {
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
         * The current version of the resource, ending with a representation-specific suffix. This
         * value may be used in If-Match and If-None-Match headers for later requests of the same
         * resource.
         */
        private String eTag;

        /**
         * The current version of the resource, ending with a representation-specific suffix. This
         * value may be used in If-Match and If-None-Match headers for later requests of the same
         * resource.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
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

        /** The returned TsigKey instance, or null if {@link #isNotModified()} is true. */
        private com.oracle.bmc.dns.model.TsigKey tsigKey;

        /**
         * The returned TsigKey instance, or null if {@link #isNotModified()} is true.
         *
         * @param tsigKey the value to set
         * @return this builder
         */
        public Builder tsigKey(com.oracle.bmc.dns.model.TsigKey tsigKey) {
            this.tsigKey = tsigKey;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         *
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetTsigKeyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            eTag(o.getETag());
            opcRequestId(o.getOpcRequestId());
            tsigKey(o.getTsigKey());
            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetTsigKeyResponse build() {
            return new GetTsigKeyResponse(
                    __httpStatusCode__, headers, eTag, opcRequestId, tsigKey, isNotModified);
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
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",tsigKey=").append(String.valueOf(tsigKey));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTsigKeyResponse)) {
            return false;
        }

        GetTsigKeyResponse other = (GetTsigKeyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.tsigKey, other.tsigKey)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.tsigKey == null ? 43 : this.tsigKey.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
