/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane;

import com.oracle.bmc.identitydataplane.requests.*;
import com.oracle.bmc.identitydataplane.responses.*;

/**
 * APIs for managing identity data plane services. For example, use this API to create a
 * scoped-access security token. To manage identity domains (for example, creating or deleting an
 * identity domain) or to manage resources (for example, users and groups) within the default
 * identity domain, see [IAM API](https://docs.oracle.com/iaas/api/#/en/identity/). This service
 * client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no
 * circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public interface Dataplane extends AutoCloseable {

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
     * Based on the calling Principal and the input payload, derive the claims, and generate a
     * scoped-access token for specific resources. For example, set scope to
     * urn:oracle:db::id::<compartment-id> for access to a database in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydataplane/GenerateScopedAccessTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateScopedAccessToken API.
     */
    GenerateScopedAccessTokenResponse generateScopedAccessToken(
            GenerateScopedAccessTokenRequest request);

    /**
     * Exchanges a valid user token-based signature (API key and UPST) for a short-lived UPST of the
     * authenticated user principal. When not specified, the user session duration is set to a
     * default of 60 minutes in all realms. Resulting UPSTs are refreshable while the user session
     * has not expired.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydataplane/GenerateUserSecurityTokenExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateUserSecurityToken API.
     */
    GenerateUserSecurityTokenResponse generateUserSecurityToken(
            GenerateUserSecurityTokenRequest request);
}
