/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice;

import com.oracle.bmc.announcementsservice.requests.*;
import com.oracle.bmc.announcementsservice.responses.*;

/**
 * Manage Oracle Cloud Infrastructure console announcements. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public interface AnnouncementsPreferences extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Creates a request that specifies preferences for the tenancy regarding receiving
     * announcements by email.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/CreateAnnouncementsPreferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateAnnouncementsPreference API.
     */
    CreateAnnouncementsPreferenceResponse createAnnouncementsPreference(
            CreateAnnouncementsPreferenceRequest request);

    /**
     * Gets the current preferences of the tenancy regarding receiving announcements by email.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/GetAnnouncementsPreferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAnnouncementsPreference API.
     */
    GetAnnouncementsPreferenceResponse getAnnouncementsPreference(
            GetAnnouncementsPreferenceRequest request);

    /**
     * Gets the current preferences of the tenancy regarding receiving announcements by email.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/ListAnnouncementsPreferencesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAnnouncementsPreferences API.
     */
    ListAnnouncementsPreferencesResponse listAnnouncementsPreferences(
            ListAnnouncementsPreferencesRequest request);

    /**
     * Updates the preferences of the tenancy regarding receiving announcements by email.
     *
     * <p>This call is subject to an Announcements limit that applies to the total number of
     * requests across all read or write operations. Announcements might throttle this call to
     * reject an otherwise valid request when the total rate of operations exceeds 20 requests per
     * second for a given user. The service might also throttle this call to reject an otherwise
     * valid request when the total rate of operations exceeds 100 requests per second for a given
     * tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/UpdateAnnouncementsPreferenceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAnnouncementsPreference API.
     */
    UpdateAnnouncementsPreferenceResponse updateAnnouncementsPreference(
            UpdateAnnouncementsPreferenceRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    AnnouncementsPreferencesPaginators getPaginators();
}
