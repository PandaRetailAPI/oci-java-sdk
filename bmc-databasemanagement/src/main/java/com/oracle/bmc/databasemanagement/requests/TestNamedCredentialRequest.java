/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/TestNamedCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use TestNamedCredentialRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class TestNamedCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * named credential.
     */
    private String namedCredentialId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * named credential.
     */
    public String getNamedCredentialId() {
        return namedCredentialId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database against which the credential is to be tested.
     */
    private com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails
            testNamedCredentialDetails;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database against which the credential is to be tested.
     */
    public com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails
            getTestNamedCredentialDetails() {
        return testNamedCredentialDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails getBody$() {
        return testNamedCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TestNamedCredentialRequest,
                    com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * named credential.
         */
        private String namedCredentialId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * named credential.
         *
         * @param namedCredentialId the value to set
         * @return this builder instance
         */
        public Builder namedCredentialId(String namedCredentialId) {
            this.namedCredentialId = namedCredentialId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database against which the credential is to be tested.
         */
        private com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails
                testNamedCredentialDetails = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database against which the credential is to be tested.
         *
         * @param testNamedCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder testNamedCredentialDetails(
                com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails
                        testNamedCredentialDetails) {
            this.testNamedCredentialDetails = testNamedCredentialDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(TestNamedCredentialRequest o) {
            namedCredentialId(o.getNamedCredentialId());
            testNamedCredentialDetails(o.getTestNamedCredentialDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TestNamedCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of TestNamedCredentialRequest
         */
        public TestNamedCredentialRequest build() {
            TestNamedCredentialRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.databasemanagement.model.TestNamedCredentialDetails body) {
            testNamedCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of TestNamedCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TestNamedCredentialRequest
         */
        public TestNamedCredentialRequest buildWithoutInvocationCallback() {
            TestNamedCredentialRequest request = new TestNamedCredentialRequest();
            request.namedCredentialId = namedCredentialId;
            request.testNamedCredentialDetails = testNamedCredentialDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new TestNamedCredentialRequest(namedCredentialId, testNamedCredentialDetails,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namedCredentialId(namedCredentialId)
                .testNamedCredentialDetails(testNamedCredentialDetails)
                .opcRequestId(opcRequestId);
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
        sb.append(",namedCredentialId=").append(String.valueOf(this.namedCredentialId));
        sb.append(",testNamedCredentialDetails=")
                .append(String.valueOf(this.testNamedCredentialDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestNamedCredentialRequest)) {
            return false;
        }

        TestNamedCredentialRequest other = (TestNamedCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namedCredentialId, other.namedCredentialId)
                && java.util.Objects.equals(
                        this.testNamedCredentialDetails, other.testNamedCredentialDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namedCredentialId == null ? 43 : this.namedCredentialId.hashCode());
        result =
                (result * PRIME)
                        + (this.testNamedCredentialDetails == null
                                ? 43
                                : this.testNamedCredentialDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
