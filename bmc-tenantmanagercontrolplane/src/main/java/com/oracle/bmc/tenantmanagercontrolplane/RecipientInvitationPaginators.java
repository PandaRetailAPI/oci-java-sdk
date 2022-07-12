/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of RecipientInvitation where multiple pages of data may be fetched.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class RecipientInvitationPaginators {
    private final RecipientInvitation client;

    public RecipientInvitationPaginators(RecipientInvitation client) {
        this.client = client;
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listRecipientInvitations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListRecipientInvitationsResponse> listRecipientInvitationsResponseIterator(
            final ListRecipientInvitationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListRecipientInvitationsRequest.Builder, ListRecipientInvitationsRequest,
                ListRecipientInvitationsResponse>(
                new java.util.function.Supplier<ListRecipientInvitationsRequest.Builder>() {
                    @Override
                    public ListRecipientInvitationsRequest.Builder get() {
                        return ListRecipientInvitationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecipientInvitationsResponse, String>() {
                    @Override
                    public String apply(ListRecipientInvitationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecipientInvitationsRequest.Builder>,
                        ListRecipientInvitationsRequest>() {
                    @Override
                    public ListRecipientInvitationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecipientInvitationsRequest.Builder>
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
                        ListRecipientInvitationsRequest, ListRecipientInvitationsResponse>() {
                    @Override
                    public ListRecipientInvitationsResponse apply(
                            ListRecipientInvitationsRequest request) {
                        return client.listRecipientInvitations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationSummary} objects
     * contained in responses from the listRecipientInvitations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationSummary>
            listRecipientInvitationsRecordIterator(final ListRecipientInvitationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListRecipientInvitationsRequest.Builder, ListRecipientInvitationsRequest,
                ListRecipientInvitationsResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.RecipientInvitationSummary>(
                new java.util.function.Supplier<ListRecipientInvitationsRequest.Builder>() {
                    @Override
                    public ListRecipientInvitationsRequest.Builder get() {
                        return ListRecipientInvitationsRequest.builder().copy(request);
                    }
                },
                new java.util.function.Function<ListRecipientInvitationsResponse, String>() {
                    @Override
                    public String apply(ListRecipientInvitationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new java.util.function.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListRecipientInvitationsRequest.Builder>,
                        ListRecipientInvitationsRequest>() {
                    @Override
                    public ListRecipientInvitationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListRecipientInvitationsRequest.Builder>
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
                        ListRecipientInvitationsRequest, ListRecipientInvitationsResponse>() {
                    @Override
                    public ListRecipientInvitationsResponse apply(
                            ListRecipientInvitationsRequest request) {
                        return client.listRecipientInvitations(request);
                    }
                },
                new java.util.function.Function<
                        ListRecipientInvitationsResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .RecipientInvitationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .RecipientInvitationSummary>
                            apply(ListRecipientInvitationsResponse response) {
                        return response.getRecipientInvitationCollection().getItems();
                    }
                });
    }
}
