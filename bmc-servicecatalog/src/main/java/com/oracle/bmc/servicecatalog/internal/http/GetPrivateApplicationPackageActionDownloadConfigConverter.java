/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.internal.http;

import com.oracle.bmc.servicecatalog.model.*;
import com.oracle.bmc.servicecatalog.requests.*;
import com.oracle.bmc.servicecatalog.responses.*;
import com.oracle.bmc.util.internal.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public class GetPrivateApplicationPackageActionDownloadConfigConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    GetPrivateApplicationPackageActionDownloadConfigConverter.class);

    public static com.oracle.bmc.servicecatalog.requests
                    .GetPrivateApplicationPackageActionDownloadConfigRequest
            interceptRequest(
                    com.oracle.bmc.servicecatalog.requests
                                    .GetPrivateApplicationPackageActionDownloadConfigRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.servicecatalog.requests
                            .GetPrivateApplicationPackageActionDownloadConfigRequest
                    request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(
                request.getPrivateApplicationPackageId(),
                "privateApplicationPackageId must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20210527")
                        .path("privateApplicationPackages")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getPrivateApplicationPackageId()))
                        .path("actions")
                        .path("downloadConfig");

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept("application/zip");

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.servicecatalog.responses
                            .GetPrivateApplicationPackageActionDownloadConfigResponse>
            fromResponse() {
        return fromResponse(java.util.Optional.empty());
    }

    public static java.util.function.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.servicecatalog.responses
                            .GetPrivateApplicationPackageActionDownloadConfigResponse>
            fromResponse(java.util.Optional<com.oracle.bmc.ServiceDetails> serviceDetails) {
        final java.util.function.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.servicecatalog.responses
                                .GetPrivateApplicationPackageActionDownloadConfigResponse>
                transformer =
                        new java.util.function.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.servicecatalog.responses
                                        .GetPrivateApplicationPackageActionDownloadConfigResponse>() {
                            @Override
                            public com.oracle.bmc.servicecatalog.responses
                                            .GetPrivateApplicationPackageActionDownloadConfigResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.servicecatalog.responses.GetPrivateApplicationPackageActionDownloadConfigResponse");
                                final java.util.function.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        java.io.InputStream>>
                                        responseFn;
                                if (serviceDetails.isPresent()) {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    java.io.InputStream.class,
                                                    serviceDetails.get());
                                } else {
                                    responseFn =
                                            RESPONSE_CONVERSION_FACTORY.create(
                                                    java.io.InputStream.class);
                                }

                                com.oracle.bmc.http.internal.WithHeaders<java.io.InputStream>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.servicecatalog.responses
                                                .GetPrivateApplicationPackageActionDownloadConfigResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.servicecatalog.responses
                                                        .GetPrivateApplicationPackageActionDownloadConfigResponse
                                                        .builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.inputStream(response.getItem());

                                java.util.Optional<java.util.List<String>> opcRequestIdHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.servicecatalog.responses
                                                .GetPrivateApplicationPackageActionDownloadConfigResponse
                                        responseWrapper = builder.build();

                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
