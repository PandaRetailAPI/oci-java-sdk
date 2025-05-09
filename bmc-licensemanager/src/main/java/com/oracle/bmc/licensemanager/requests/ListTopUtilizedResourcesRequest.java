/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.requests;

import com.oracle.bmc.licensemanager.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/licensemanager/ListTopUtilizedResourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListTopUtilizedResourcesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class ListTopUtilizedResourcesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * used for the license record, product license, and configuration.
     */
    private String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * used for the license record, product license, and configuration.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Indicates if the given compartment is the root compartment. */
    private Boolean isCompartmentIdInSubtree;

    /** Indicates if the given compartment is the root compartment. */
    public Boolean getIsCompartmentIdInSubtree() {
        return isCompartmentIdInSubtree;
    }
    /** A filter to return only resources whose unit matches the given resource unit. */
    private com.oracle.bmc.licensemanager.model.ResourceUnit resourceUnitType;

    /** A filter to return only resources whose unit matches the given resource unit. */
    public com.oracle.bmc.licensemanager.model.ResourceUnit getResourceUnitType() {
        return resourceUnitType;
    }
    /** The sort order to use, whether {@code ASC} or {@code DESC}. */
    private SortOrder sortOrder;

    /** The sort order to use, whether {@code ASC} or {@code DESC}. */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, whether {@code ASC} or {@code DESC}. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the attribute with which to sort the rules.
     *
     * <p>Default: {@code totalUnits}
     *
     * <p>**totalUnits:** Sorts by totalUnits consumed by resource.
     */
    private SortBy sortBy;

    /**
     * Specifies the attribute with which to sort the rules.
     *
     * <p>Default: {@code totalUnits}
     *
     * <p>**totalUnits:** Sorts by totalUnits consumed by resource.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TotalUnits("totalUnits"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * Specifies the attribute with which to sort the rules.
     *
     * <p>Default: {@code totalUnits}
     *
     * <p>**totalUnits:** Sorts by totalUnits consumed by resource.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTopUtilizedResourcesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) used for
         * the license record, product license, and configuration.
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) used for
         * the license record, product license, and configuration.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Indicates if the given compartment is the root compartment. */
        private Boolean isCompartmentIdInSubtree = null;

        /**
         * Indicates if the given compartment is the root compartment.
         *
         * @param isCompartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder isCompartmentIdInSubtree(Boolean isCompartmentIdInSubtree) {
            this.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            return this;
        }

        /** A filter to return only resources whose unit matches the given resource unit. */
        private com.oracle.bmc.licensemanager.model.ResourceUnit resourceUnitType = null;

        /**
         * A filter to return only resources whose unit matches the given resource unit.
         *
         * @param resourceUnitType the value to set
         * @return this builder instance
         */
        public Builder resourceUnitType(
                com.oracle.bmc.licensemanager.model.ResourceUnit resourceUnitType) {
            this.resourceUnitType = resourceUnitType;
            return this;
        }

        /** The sort order to use, whether {@code ASC} or {@code DESC}. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, whether {@code ASC} or {@code DESC}.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies the attribute with which to sort the rules.
         *
         * <p>Default: {@code totalUnits}
         *
         * <p>**totalUnits:** Sorts by totalUnits consumed by resource.
         */
        private SortBy sortBy = null;

        /**
         * Specifies the attribute with which to sort the rules.
         *
         * <p>Default: {@code totalUnits}
         *
         * <p>**totalUnits:** Sorts by totalUnits consumed by resource.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListTopUtilizedResourcesRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            isCompartmentIdInSubtree(o.getIsCompartmentIdInSubtree());
            resourceUnitType(o.getResourceUnitType());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTopUtilizedResourcesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListTopUtilizedResourcesRequest
         */
        public ListTopUtilizedResourcesRequest build() {
            ListTopUtilizedResourcesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTopUtilizedResourcesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTopUtilizedResourcesRequest
         */
        public ListTopUtilizedResourcesRequest buildWithoutInvocationCallback() {
            ListTopUtilizedResourcesRequest request = new ListTopUtilizedResourcesRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            request.resourceUnitType = resourceUnitType;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListTopUtilizedResourcesRequest(compartmentId, limit, page, opcRequestId,
            // isCompartmentIdInSubtree, resourceUnitType, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .isCompartmentIdInSubtree(isCompartmentIdInSubtree)
                .resourceUnitType(resourceUnitType)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isCompartmentIdInSubtree=")
                .append(String.valueOf(this.isCompartmentIdInSubtree));
        sb.append(",resourceUnitType=").append(String.valueOf(this.resourceUnitType));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTopUtilizedResourcesRequest)) {
            return false;
        }

        ListTopUtilizedResourcesRequest other = (ListTopUtilizedResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.isCompartmentIdInSubtree, other.isCompartmentIdInSubtree)
                && java.util.Objects.equals(this.resourceUnitType, other.resourceUnitType)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isCompartmentIdInSubtree == null
                                ? 43
                                : this.isCompartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceUnitType == null ? 43 : this.resourceUnitType.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
