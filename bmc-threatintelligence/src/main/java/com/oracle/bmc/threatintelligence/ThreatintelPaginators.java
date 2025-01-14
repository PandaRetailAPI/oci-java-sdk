/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence;

import com.oracle.bmc.threatintelligence.requests.*;
import com.oracle.bmc.threatintelligence.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Threatintel where multiple pages of data may be fetched. Two styles of
 * iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to
 *       as ResponseIterators, and the methods are suffixed with ResponseIterator. For example:
 *       <i>listUsersResponseIterator</i>
 *   <li>Iterating over the resources/records being listed. These are referred to as
 *       RecordIterators, and the methods are suffixed with RecordIterator. For example:
 *       <i>listUsersRecordIterator</i>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping
 * and using the page tokens. They will automatically fetch more data from the service when
 * required.
 *
 * <p>As an example, if we were using the ListUsers operation in IdentityService, then the {@link
 * java.lang.Iterable} returned by calling a ResponseIterator method would iterate over the
 * ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have
 * to deal with ListUsersResponse objects at all. In either case, pagination will be automatically
 * handled so we can iterate until there are no more responses or no more resources/records
 * available.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ThreatintelPaginators {
    private final Threatintel client;

    public ThreatintelPaginators(Threatintel client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listIndicators
     * operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListIndicatorsResponse> listIndicatorsResponseIterator(
            final ListIndicatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListIndicatorsRequest.Builder, ListIndicatorsRequest, ListIndicatorsResponse>(
                new java.util.function.Supplier<ListIndicatorsRequest.Builder>() {
                    @Override
                    public ListIndicatorsRequest.Builder get() {
                        return ListIndicatorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIndicatorsResponse, String>() {
                    @Override
                    public String apply(ListIndicatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIndicatorsRequest.Builder>,
                        ListIndicatorsRequest>() {
                    @Override
                    public ListIndicatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIndicatorsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListIndicatorsRequest, ListIndicatorsResponse>() {
                    @Override
                    public ListIndicatorsResponse apply(ListIndicatorsRequest request) {
                        return client.listIndicators(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.threatintelligence.model.IndicatorSummary} objects contained in responses from
     * the listIndicators operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.threatintelligence.model.IndicatorSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.threatintelligence.model.IndicatorSummary>
            listIndicatorsRecordIterator(final ListIndicatorsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListIndicatorsRequest.Builder,
                ListIndicatorsRequest,
                ListIndicatorsResponse,
                com.oracle.bmc.threatintelligence.model.IndicatorSummary>(
                new java.util.function.Supplier<ListIndicatorsRequest.Builder>() {
                    @Override
                    public ListIndicatorsRequest.Builder get() {
                        return ListIndicatorsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListIndicatorsResponse, String>() {
                    @Override
                    public String apply(ListIndicatorsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListIndicatorsRequest.Builder>,
                        ListIndicatorsRequest>() {
                    @Override
                    public ListIndicatorsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListIndicatorsRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListIndicatorsRequest, ListIndicatorsResponse>() {
                    @Override
                    public ListIndicatorsResponse apply(ListIndicatorsRequest request) {
                        return client.listIndicators(request);
                    }
                },
                new java.util.function.Function<
                        ListIndicatorsResponse,
                        java.util.List<
                                com.oracle.bmc.threatintelligence.model.IndicatorSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.threatintelligence.model.IndicatorSummary>
                            apply(ListIndicatorsResponse response) {
                        return response.getIndicatorSummaryCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the
     * listThreatTypes operation. This iterable will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses
     *     received from the service.
     */
    public Iterable<ListThreatTypesResponse> listThreatTypesResponseIterator(
            final ListThreatTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListThreatTypesRequest.Builder, ListThreatTypesRequest, ListThreatTypesResponse>(
                new java.util.function.Supplier<ListThreatTypesRequest.Builder>() {
                    @Override
                    public ListThreatTypesRequest.Builder get() {
                        return ListThreatTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListThreatTypesResponse, String>() {
                    @Override
                    public String apply(ListThreatTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListThreatTypesRequest.Builder>,
                        ListThreatTypesRequest>() {
                    @Override
                    public ListThreatTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListThreatTypesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListThreatTypesRequest, ListThreatTypesResponse>() {
                    @Override
                    public ListThreatTypesResponse apply(ListThreatTypesRequest request) {
                        return client.listThreatTypes(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link
     * com.oracle.bmc.threatintelligence.model.ThreatTypeSummary} objects contained in responses
     * from the listThreatTypes operation. This iterable will fetch more data from the server as
     * needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link
     *     com.oracle.bmc.threatintelligence.model.ThreatTypeSummary} objects contained in responses
     *     received from the service.
     */
    public Iterable<com.oracle.bmc.threatintelligence.model.ThreatTypeSummary>
            listThreatTypesRecordIterator(final ListThreatTypesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListThreatTypesRequest.Builder,
                ListThreatTypesRequest,
                ListThreatTypesResponse,
                com.oracle.bmc.threatintelligence.model.ThreatTypeSummary>(
                new java.util.function.Supplier<ListThreatTypesRequest.Builder>() {
                    @Override
                    public ListThreatTypesRequest.Builder get() {
                        return ListThreatTypesRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListThreatTypesResponse, String>() {
                    @Override
                    public String apply(ListThreatTypesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListThreatTypesRequest.Builder>,
                        ListThreatTypesRequest>() {
                    @Override
                    public ListThreatTypesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListThreatTypesRequest.Builder>
                                    input) {
                        if (input.getNextPageToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getNextPageToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<ListThreatTypesRequest, ListThreatTypesResponse>() {
                    @Override
                    public ListThreatTypesResponse apply(ListThreatTypesRequest request) {
                        return client.listThreatTypes(request);
                    }
                },
                new java.util.function.Function<
                        ListThreatTypesResponse,
                        java.util.List<
                                com.oracle.bmc.threatintelligence.model.ThreatTypeSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.threatintelligence.model.ThreatTypeSummary>
                            apply(ListThreatTypesResponse response) {
                        return response.getThreatTypesCollection().getItems();
                    }
                });
    }
}
