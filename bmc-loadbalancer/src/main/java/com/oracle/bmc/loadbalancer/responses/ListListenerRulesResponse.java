/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class ListListenerRulesResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Reflects the current version of the load balancer and the resources it contains. The value
     * only changes when the load balancer or an associated resource is created, updated, or delete
     *
     * <p>For optimistic concurrency control. See {@code if-match}.
     */
    private String eTag;

    /**
     * Reflects the current version of the load balancer and the resources it contains. The value
     * only changes when the load balancer or an associated resource is created, updated, or delete
     *
     * <p>For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /** A list of com.oracle.bmc.loadbalancer.model.ListenerRuleSummary instances. */
    private java.util.List<com.oracle.bmc.loadbalancer.model.ListenerRuleSummary> items;

    /**
     * A list of com.oracle.bmc.loadbalancer.model.ListenerRuleSummary instances.
     *
     * @return the value
     */
    public java.util.List<com.oracle.bmc.loadbalancer.model.ListenerRuleSummary> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "eTag",
        "items"
    })
    private ListListenerRulesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String eTag,
            java.util.List<com.oracle.bmc.loadbalancer.model.ListenerRuleSummary> items) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.items = items;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListListenerRulesResponse> {
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
         * Reflects the current version of the load balancer and the resources it contains. The
         * value only changes when the load balancer or an associated resource is created, updated,
         * or delete
         *
         * <p>For optimistic concurrency control. See {@code if-match}.
         */
        private String eTag;

        /**
         * Reflects the current version of the load balancer and the resources it contains. The
         * value only changes when the load balancer or an associated resource is created, updated,
         * or delete
         *
         * <p>For optimistic concurrency control. See {@code if-match}.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /** A list of com.oracle.bmc.loadbalancer.model.ListenerRuleSummary instances. */
        private java.util.List<com.oracle.bmc.loadbalancer.model.ListenerRuleSummary> items;

        /**
         * A list of com.oracle.bmc.loadbalancer.model.ListenerRuleSummary instances.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(
                java.util.List<com.oracle.bmc.loadbalancer.model.ListenerRuleSummary> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListListenerRulesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            items(o.getItems());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListListenerRulesResponse build() {
            return new ListListenerRulesResponse(
                    __httpStatusCode__, headers, opcRequestId, eTag, items);
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
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",items=").append(String.valueOf(items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListListenerRulesResponse)) {
            return false;
        }

        ListListenerRulesResponse other = (ListListenerRulesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
