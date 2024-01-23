/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the request to generate text. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GenerateTextDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenerateTextDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "servingMode", "inferenceRequest"})
    public GenerateTextDetails(
            String compartmentId, ServingMode servingMode, LlmInferenceRequest inferenceRequest) {
        super();
        this.compartmentId = compartmentId;
        this.servingMode = servingMode;
        this.inferenceRequest = inferenceRequest;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of compartment that the user is authorized to use to call into the Generative AI
         * service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of compartment that the user is authorized to use to call into the Generative AI
         * service.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
        private ServingMode servingMode;

        public Builder servingMode(ServingMode servingMode) {
            this.servingMode = servingMode;
            this.__explicitlySet__.add("servingMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inferenceRequest")
        private LlmInferenceRequest inferenceRequest;

        public Builder inferenceRequest(LlmInferenceRequest inferenceRequest) {
            this.inferenceRequest = inferenceRequest;
            this.__explicitlySet__.add("inferenceRequest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateTextDetails build() {
            GenerateTextDetails model =
                    new GenerateTextDetails(
                            this.compartmentId, this.servingMode, this.inferenceRequest);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateTextDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("servingMode")) {
                this.servingMode(model.getServingMode());
            }
            if (model.wasPropertyExplicitlySet("inferenceRequest")) {
                this.inferenceRequest(model.getInferenceRequest());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of compartment that the user is authorized to use to call into the Generative AI
     * service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of compartment that the user is authorized to use to call into the Generative AI
     * service.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
    private final ServingMode servingMode;

    public ServingMode getServingMode() {
        return servingMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inferenceRequest")
    private final LlmInferenceRequest inferenceRequest;

    public LlmInferenceRequest getInferenceRequest() {
        return inferenceRequest;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GenerateTextDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", servingMode=").append(String.valueOf(this.servingMode));
        sb.append(", inferenceRequest=").append(String.valueOf(this.inferenceRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateTextDetails)) {
            return false;
        }

        GenerateTextDetails other = (GenerateTextDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.servingMode, other.servingMode)
                && java.util.Objects.equals(this.inferenceRequest, other.inferenceRequest)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.servingMode == null ? 43 : this.servingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.inferenceRequest == null ? 43 : this.inferenceRequest.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
