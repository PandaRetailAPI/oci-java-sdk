/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of OperatorControl where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class OperatorControlPaginators {
    private final OperatorControl client;

    public OperatorControlPaginators(OperatorControl client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOperatorControls operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOperatorControlsResponse> listOperatorControlsResponseIterator(
            final ListOperatorControlsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOperatorControlsRequest.Builder, ListOperatorControlsRequest,
                ListOperatorControlsResponse>(
                new java.util.function.Supplier<ListOperatorControlsRequest.Builder>() {
                    @Override
                    public ListOperatorControlsRequest.Builder get() {
                        return ListOperatorControlsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOperatorControlsResponse, String>() {
                    @Override
                    public String apply(ListOperatorControlsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperatorControlsRequest.Builder>,
                        ListOperatorControlsRequest>() {
                    @Override
                    public ListOperatorControlsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperatorControlsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListOperatorControlsRequest, ListOperatorControlsResponse>() {
                    @Override
                    public ListOperatorControlsResponse apply(ListOperatorControlsRequest request) {
                        return client.listOperatorControls(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.OperatorControlSummary} objects
     * contained in responses from the listOperatorControls operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.operatoraccesscontrol.model.OperatorControlSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.operatoraccesscontrol.model.OperatorControlSummary>
            listOperatorControlsRecordIterator(final ListOperatorControlsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOperatorControlsRequest.Builder, ListOperatorControlsRequest,
                ListOperatorControlsResponse,
                com.oracle.bmc.operatoraccesscontrol.model.OperatorControlSummary>(
                new java.util.function.Supplier<ListOperatorControlsRequest.Builder>() {
                    @Override
                    public ListOperatorControlsRequest.Builder get() {
                        return ListOperatorControlsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListOperatorControlsResponse, String>() {
                    @Override
                    public String apply(ListOperatorControlsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOperatorControlsRequest.Builder>,
                        ListOperatorControlsRequest>() {
                    @Override
                    public ListOperatorControlsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOperatorControlsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orElse(null))
                                    .build();
                        }
                    }
                },
                new java.util.function.Function<
                        ListOperatorControlsRequest, ListOperatorControlsResponse>() {
                    @Override
                    public ListOperatorControlsResponse apply(ListOperatorControlsRequest request) {
                        return client.listOperatorControls(request);
                    }
                },
                new java.util.function.Function<
                        ListOperatorControlsResponse,
                        java.util.List<
                                com.oracle.bmc.operatoraccesscontrol.model
                                        .OperatorControlSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.operatoraccesscontrol.model
                                            .OperatorControlSummary>
                            apply(ListOperatorControlsResponse response) {
                        return response.getOperatorControlCollection().getItems();
                    }
                });
    }
}
