/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.jmsjavadownloads.requests.*;
import com.oracle.bmc.jmsjavadownloads.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class JavaDownloadClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements JavaDownload {
    /** Service instance for JavaDownload. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("JAVADOWNLOAD")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://javamanagementservice-download.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(JavaDownloadClient.class);

    private final JavaDownloadWaiters waiters;

    private final JavaDownloadPaginators paginators;

    JavaDownloadClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    JavaDownloadClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("JavaDownload-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new JavaDownloadWaiters(executorService, this);

        this.paginators = new JavaDownloadPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "JavaDownloadClient", "getJavaDownloadReportContent"));
        }
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, JavaDownloadClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "jmsjavadownloads";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public JavaDownloadClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new JavaDownloadClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "JavaDownload",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateJavaDownloadReportResponse createJavaDownloadReport(
            CreateJavaDownloadReportRequest request) {
        Objects.requireNonNull(
                request.getCreateJavaDownloadReportDetails(),
                "createJavaDownloadReportDetails is required");

        return clientCall(request, CreateJavaDownloadReportResponse::builder)
                .logger(LOG, "createJavaDownloadReport")
                .serviceDetails(
                        "JavaDownload",
                        "CreateJavaDownloadReport",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadReport/CreateJavaDownloadReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJavaDownloadReportRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadReports")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateJavaDownloadReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJavaDownloadReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateJavaDownloadTokenResponse createJavaDownloadToken(
            CreateJavaDownloadTokenRequest request) {
        Objects.requireNonNull(
                request.getCreateJavaDownloadTokenDetails(),
                "createJavaDownloadTokenDetails is required");

        return clientCall(request, CreateJavaDownloadTokenResponse::builder)
                .logger(LOG, "createJavaDownloadToken")
                .serviceDetails(
                        "JavaDownload",
                        "CreateJavaDownloadToken",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadToken/CreateJavaDownloadToken")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJavaDownloadTokenRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadTokens")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken.class,
                        CreateJavaDownloadTokenResponse.Builder::javaDownloadToken)
                .handleResponseHeaderString("etag", CreateJavaDownloadTokenResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateJavaDownloadTokenResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateJavaDownloadTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateJavaLicenseAcceptanceRecordResponse createJavaLicenseAcceptanceRecord(
            CreateJavaLicenseAcceptanceRecordRequest request) {
        Objects.requireNonNull(
                request.getCreateJavaLicenseAcceptanceRecordDetails(),
                "createJavaLicenseAcceptanceRecordDetails is required");

        return clientCall(request, CreateJavaLicenseAcceptanceRecordResponse::builder)
                .logger(LOG, "createJavaLicenseAcceptanceRecord")
                .serviceDetails(
                        "JavaDownload",
                        "CreateJavaLicenseAcceptanceRecord",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicenseAcceptanceRecord/CreateJavaLicenseAcceptanceRecord")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateJavaLicenseAcceptanceRecordRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenseAcceptanceRecords")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord.class,
                        CreateJavaLicenseAcceptanceRecordResponse.Builder
                                ::javaLicenseAcceptanceRecord)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateJavaLicenseAcceptanceRecordResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateJavaLicenseAcceptanceRecordResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteJavaDownloadReportResponse deleteJavaDownloadReport(
            DeleteJavaDownloadReportRequest request) {

        Validate.notBlank(
                request.getJavaDownloadReportId(), "javaDownloadReportId must not be blank");

        return clientCall(request, DeleteJavaDownloadReportResponse::builder)
                .logger(LOG, "deleteJavaDownloadReport")
                .serviceDetails(
                        "JavaDownload",
                        "DeleteJavaDownloadReport",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadReport/DeleteJavaDownloadReport")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJavaDownloadReportRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadReports")
                .appendPathParam(request.getJavaDownloadReportId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteJavaDownloadReportResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJavaDownloadReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteJavaDownloadTokenResponse deleteJavaDownloadToken(
            DeleteJavaDownloadTokenRequest request) {

        Validate.notBlank(
                request.getJavaDownloadTokenId(), "javaDownloadTokenId must not be blank");

        return clientCall(request, DeleteJavaDownloadTokenResponse::builder)
                .logger(LOG, "deleteJavaDownloadToken")
                .serviceDetails(
                        "JavaDownload",
                        "DeleteJavaDownloadToken",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadToken/DeleteJavaDownloadToken")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJavaDownloadTokenRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadTokens")
                .appendPathParam(request.getJavaDownloadTokenId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteJavaDownloadTokenResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteJavaDownloadTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteJavaLicenseAcceptanceRecordResponse deleteJavaLicenseAcceptanceRecord(
            DeleteJavaLicenseAcceptanceRecordRequest request) {

        Validate.notBlank(
                request.getJavaLicenseAcceptanceRecordId(),
                "javaLicenseAcceptanceRecordId must not be blank");

        return clientCall(request, DeleteJavaLicenseAcceptanceRecordResponse::builder)
                .logger(LOG, "deleteJavaLicenseAcceptanceRecord")
                .serviceDetails(
                        "JavaDownload",
                        "DeleteJavaLicenseAcceptanceRecord",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicenseAcceptanceRecord/DeleteJavaLicenseAcceptanceRecord")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteJavaLicenseAcceptanceRecordRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenseAcceptanceRecords")
                .appendPathParam(request.getJavaLicenseAcceptanceRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteJavaLicenseAcceptanceRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GenerateArtifactDownloadUrlResponse generateArtifactDownloadUrl(
            GenerateArtifactDownloadUrlRequest request) {
        Objects.requireNonNull(
                request.getGenerateArtifactDownloadUrlDetails(),
                "generateArtifactDownloadUrlDetails is required");

        return clientCall(request, GenerateArtifactDownloadUrlResponse::builder)
                .logger(LOG, "generateArtifactDownloadUrl")
                .serviceDetails(
                        "JavaDownload",
                        "GenerateArtifactDownloadUrl",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/DownloadUrl/GenerateArtifactDownloadUrl")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateArtifactDownloadUrlRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("actions")
                .appendPathParam("generateArtifactDownloadUrl")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.DownloadUrl.class,
                        GenerateArtifactDownloadUrlResponse.Builder::downloadUrl)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateArtifactDownloadUrlResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaDownloadReportResponse getJavaDownloadReport(
            GetJavaDownloadReportRequest request) {

        Validate.notBlank(
                request.getJavaDownloadReportId(), "javaDownloadReportId must not be blank");

        return clientCall(request, GetJavaDownloadReportResponse::builder)
                .logger(LOG, "getJavaDownloadReport")
                .serviceDetails(
                        "JavaDownload",
                        "GetJavaDownloadReport",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadReport/GetJavaDownloadReport")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaDownloadReportRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadReports")
                .appendPathParam(request.getJavaDownloadReportId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReport.class,
                        GetJavaDownloadReportResponse.Builder::javaDownloadReport)
                .handleResponseHeaderString("etag", GetJavaDownloadReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJavaDownloadReportResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaDownloadReportContentResponse getJavaDownloadReportContent(
            GetJavaDownloadReportContentRequest request) {

        Validate.notBlank(
                request.getJavaDownloadReportId(), "javaDownloadReportId must not be blank");

        return clientCall(request, GetJavaDownloadReportContentResponse::builder)
                .logger(LOG, "getJavaDownloadReportContent")
                .serviceDetails(
                        "JavaDownload",
                        "GetJavaDownloadReportContent",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadReport/GetJavaDownloadReportContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaDownloadReportContentRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadReports")
                .appendPathParam(request.getJavaDownloadReportId())
                .appendPathParam("content")
                .accept("text/csv")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetJavaDownloadReportContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetJavaDownloadReportContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetJavaDownloadReportContentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaDownloadTokenResponse getJavaDownloadToken(GetJavaDownloadTokenRequest request) {

        Validate.notBlank(
                request.getJavaDownloadTokenId(), "javaDownloadTokenId must not be blank");

        return clientCall(request, GetJavaDownloadTokenResponse::builder)
                .logger(LOG, "getJavaDownloadToken")
                .serviceDetails(
                        "JavaDownload",
                        "GetJavaDownloadToken",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadToken/GetJavaDownloadToken")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaDownloadTokenRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadTokens")
                .appendPathParam(request.getJavaDownloadTokenId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken.class,
                        GetJavaDownloadTokenResponse.Builder::javaDownloadToken)
                .handleResponseHeaderString("etag", GetJavaDownloadTokenResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetJavaDownloadTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaLicenseResponse getJavaLicense(GetJavaLicenseRequest request) {

        Validate.notBlank(request.getLicenseType().getValue(), "licenseType must not be blank");

        return clientCall(request, GetJavaLicenseResponse::builder)
                .logger(LOG, "getJavaLicense")
                .serviceDetails(
                        "JavaDownload",
                        "GetJavaLicense",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicense/GetJavaLicense")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaLicenseRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenses")
                .appendPathParam(request.getLicenseType().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaLicense.class,
                        GetJavaLicenseResponse.Builder::javaLicense)
                .handleResponseHeaderString(
                        "opc-request-id", GetJavaLicenseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetJavaLicenseAcceptanceRecordResponse getJavaLicenseAcceptanceRecord(
            GetJavaLicenseAcceptanceRecordRequest request) {

        Validate.notBlank(
                request.getJavaLicenseAcceptanceRecordId(),
                "javaLicenseAcceptanceRecordId must not be blank");

        return clientCall(request, GetJavaLicenseAcceptanceRecordResponse::builder)
                .logger(LOG, "getJavaLicenseAcceptanceRecord")
                .serviceDetails(
                        "JavaDownload",
                        "GetJavaLicenseAcceptanceRecord",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicenseAcceptanceRecord/GetJavaLicenseAcceptanceRecord")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetJavaLicenseAcceptanceRecordRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenseAcceptanceRecords")
                .appendPathParam(request.getJavaLicenseAcceptanceRecordId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord.class,
                        GetJavaLicenseAcceptanceRecordResponse.Builder::javaLicenseAcceptanceRecord)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetJavaLicenseAcceptanceRecordResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetJavaLicenseAcceptanceRecordResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "JavaDownload",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderLong("retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListJavaDownloadRecordsResponse listJavaDownloadRecords(
            ListJavaDownloadRecordsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJavaDownloadRecordsResponse::builder)
                .logger(LOG, "listJavaDownloadRecords")
                .serviceDetails(
                        "JavaDownload",
                        "ListJavaDownloadRecords",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadRecord/ListJavaDownloadRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaDownloadRecordsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("familyVersion", request.getFamilyVersion())
                .appendQueryParam("releaseVersion", request.getReleaseVersion())
                .appendQueryParam("osFamily", request.getOsFamily())
                .appendQueryParam("architecture", request.getArchitecture())
                .appendQueryParam("packageTypeDetail", request.getPackageTypeDetail())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadRecordCollection.class,
                        ListJavaDownloadRecordsResponse.Builder::javaDownloadRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaDownloadRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaDownloadRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaDownloadReportsResponse listJavaDownloadReports(
            ListJavaDownloadReportsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJavaDownloadReportsResponse::builder)
                .logger(LOG, "listJavaDownloadReports")
                .serviceDetails(
                        "JavaDownload",
                        "ListJavaDownloadReports",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadReport/ListJavaDownloadReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaDownloadReportsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadReports")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("javaDownloadReportId", request.getJavaDownloadReportId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadReportCollection.class,
                        ListJavaDownloadReportsResponse.Builder::javaDownloadReportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaDownloadReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaDownloadReportsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaDownloadTokensResponse listJavaDownloadTokens(
            ListJavaDownloadTokensRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJavaDownloadTokensResponse::builder)
                .logger(LOG, "listJavaDownloadTokens")
                .serviceDetails(
                        "JavaDownload",
                        "ListJavaDownloadTokens",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadToken/ListJavaDownloadTokens")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaDownloadTokensRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadTokens")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("value", request.getValue())
                .appendQueryParam("familyVersion", request.getFamilyVersion())
                .appendQueryParam("searchByUser", request.getSearchByUser())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadTokenCollection.class,
                        ListJavaDownloadTokensResponse.Builder::javaDownloadTokenCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaDownloadTokensResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaDownloadTokensResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaLicenseAcceptanceRecordsResponse listJavaLicenseAcceptanceRecords(
            ListJavaLicenseAcceptanceRecordsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListJavaLicenseAcceptanceRecordsResponse::builder)
                .logger(LOG, "listJavaLicenseAcceptanceRecords")
                .serviceDetails(
                        "JavaDownload",
                        "ListJavaLicenseAcceptanceRecords",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicenseAcceptanceRecord/ListJavaLicenseAcceptanceRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaLicenseAcceptanceRecordsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenseAcceptanceRecords")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("searchByUser", request.getSearchByUser())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("licenseType", request.getLicenseType())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecordCollection
                                .class,
                        ListJavaLicenseAcceptanceRecordsResponse.Builder
                                ::javaLicenseAcceptanceRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListJavaLicenseAcceptanceRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListJavaLicenseAcceptanceRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListJavaLicensesResponse listJavaLicenses(ListJavaLicensesRequest request) {

        return clientCall(request, ListJavaLicensesResponse::builder)
                .logger(LOG, "listJavaLicenses")
                .serviceDetails(
                        "JavaDownload",
                        "ListJavaLicenses",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicense/ListJavaLicenses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListJavaLicensesRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenses")
                .appendEnumQueryParam("licenseType", request.getLicenseType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaLicenseCollection.class,
                        ListJavaLicensesResponse.Builder::javaLicenseCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListJavaLicensesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListJavaLicensesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "JavaDownload",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "JavaDownload",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "JavaDownload",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestSummarizedJavaDownloadCountsResponse requestSummarizedJavaDownloadCounts(
            RequestSummarizedJavaDownloadCountsRequest request) {
        Objects.requireNonNull(
                request.getRequestSummarizedJavaDownloadCountsDetails(),
                "requestSummarizedJavaDownloadCountsDetails is required");

        return clientCall(request, RequestSummarizedJavaDownloadCountsResponse::builder)
                .logger(LOG, "requestSummarizedJavaDownloadCounts")
                .serviceDetails(
                        "JavaDownload",
                        "RequestSummarizedJavaDownloadCounts",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadCountAggregation/RequestSummarizedJavaDownloadCounts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestSummarizedJavaDownloadCountsRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("actions")
                .appendPathParam("requestSummarizedJavaDownloadCounts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaDownloadCountAggregationCollection
                                .class,
                        RequestSummarizedJavaDownloadCountsResponse.Builder
                                ::javaDownloadCountAggregationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RequestSummarizedJavaDownloadCountsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        RequestSummarizedJavaDownloadCountsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateJavaDownloadTokenResponse updateJavaDownloadToken(
            UpdateJavaDownloadTokenRequest request) {

        Validate.notBlank(
                request.getJavaDownloadTokenId(), "javaDownloadTokenId must not be blank");
        Objects.requireNonNull(
                request.getUpdateJavaDownloadTokenDetails(),
                "updateJavaDownloadTokenDetails is required");

        return clientCall(request, UpdateJavaDownloadTokenResponse::builder)
                .logger(LOG, "updateJavaDownloadToken")
                .serviceDetails(
                        "JavaDownload",
                        "UpdateJavaDownloadToken",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaDownloadToken/UpdateJavaDownloadToken")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJavaDownloadTokenRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaDownloadTokens")
                .appendPathParam(request.getJavaDownloadTokenId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateJavaDownloadTokenResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateJavaDownloadTokenResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateJavaLicenseAcceptanceRecordResponse updateJavaLicenseAcceptanceRecord(
            UpdateJavaLicenseAcceptanceRecordRequest request) {

        Validate.notBlank(
                request.getJavaLicenseAcceptanceRecordId(),
                "javaLicenseAcceptanceRecordId must not be blank");
        Objects.requireNonNull(
                request.getUpdateJavaLicenseAcceptanceRecordDetails(),
                "updateJavaLicenseAcceptanceRecordDetails is required");

        return clientCall(request, UpdateJavaLicenseAcceptanceRecordResponse::builder)
                .logger(LOG, "updateJavaLicenseAcceptanceRecord")
                .serviceDetails(
                        "JavaDownload",
                        "UpdateJavaLicenseAcceptanceRecord",
                        "https://docs.oracle.com/iaas/api/#/en/jms-java-download/20230601/JavaLicenseAcceptanceRecord/UpdateJavaLicenseAcceptanceRecord")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateJavaLicenseAcceptanceRecordRequest::builder)
                .basePath("/")
                .appendPathParam("20230601")
                .appendPathParam("javaLicenseAcceptanceRecords")
                .appendPathParam(request.getJavaLicenseAcceptanceRecordId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord.class,
                        UpdateJavaLicenseAcceptanceRecordResponse.Builder
                                ::javaLicenseAcceptanceRecord)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateJavaLicenseAcceptanceRecordResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateJavaLicenseAcceptanceRecordResponse.Builder::etag)
                .callSync();
    }

    @Override
    public JavaDownloadWaiters getWaiters() {
        return waiters;
    }

    @Override
    public JavaDownloadPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public JavaDownloadClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
