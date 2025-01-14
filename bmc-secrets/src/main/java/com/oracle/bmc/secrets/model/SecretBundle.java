/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets.model;

/**
 * The contents of the secret, properties of the secret (and secret version), and user-provided
 * contextual metadata for the secret. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretBundle.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecretBundle extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "secretId",
        "timeCreated",
        "versionNumber",
        "versionName",
        "secretBundleContent",
        "timeOfDeletion",
        "timeOfExpiry",
        "stages",
        "metadata"
    })
    public SecretBundle(
            String secretId,
            java.util.Date timeCreated,
            Long versionNumber,
            String versionName,
            SecretBundleContentDetails secretBundleContent,
            java.util.Date timeOfDeletion,
            java.util.Date timeOfExpiry,
            java.util.List<Stages> stages,
            java.util.Map<String, Object> metadata) {
        super();
        this.secretId = secretId;
        this.timeCreated = timeCreated;
        this.versionNumber = versionNumber;
        this.versionName = versionName;
        this.secretBundleContent = secretBundleContent;
        this.timeOfDeletion = timeOfDeletion;
        this.timeOfExpiry = timeOfExpiry;
        this.stages = stages;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The OCID of the secret.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /** The time when the secret bundle was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the secret bundle was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The version number of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        /**
         * The version number of the secret.
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }
        /**
         * The name of the secret version. Labels are unique across the different versions of a
         * particular secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        /**
         * The name of the secret version. Labels are unique across the different versions of a
         * particular secret.
         *
         * @param versionName the value to set
         * @return this builder
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretBundleContent")
        private SecretBundleContentDetails secretBundleContent;

        public Builder secretBundleContent(SecretBundleContentDetails secretBundleContent) {
            this.secretBundleContent = secretBundleContent;
            this.__explicitlySet__.add("secretBundleContent");
            return this;
        }
        /**
         * An optional property indicating when to delete the secret version, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the secret version, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /**
         * An optional property indicating when the secret version will expire, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
        private java.util.Date timeOfExpiry;

        /**
         * An optional property indicating when the secret version will expire, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfExpiry the value to set
         * @return this builder
         */
        public Builder timeOfExpiry(java.util.Date timeOfExpiry) {
            this.timeOfExpiry = timeOfExpiry;
            this.__explicitlySet__.add("timeOfExpiry");
            return this;
        }
        /** A list of possible rotation states for the secret version. */
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<Stages> stages;

        /**
         * A list of possible rotation states for the secret version.
         *
         * @param stages the value to set
         * @return this builder
         */
        public Builder stages(java.util.List<Stages> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }
        /** Customer-provided contextual metadata for the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, Object> metadata;

        /**
         * Customer-provided contextual metadata for the secret.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretBundle build() {
            SecretBundle model =
                    new SecretBundle(
                            this.secretId,
                            this.timeCreated,
                            this.versionNumber,
                            this.versionName,
                            this.secretBundleContent,
                            this.timeOfDeletion,
                            this.timeOfExpiry,
                            this.stages,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretBundle model) {
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("secretBundleContent")) {
                this.secretBundleContent(model.getSecretBundleContent());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("timeOfExpiry")) {
                this.timeOfExpiry(model.getTimeOfExpiry());
            }
            if (model.wasPropertyExplicitlySet("stages")) {
                this.stages(model.getStages());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /** The OCID of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The OCID of the secret.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /** The time when the secret bundle was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the secret bundle was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The version number of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the secret.
     *
     * @return the value
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * The name of the secret version. Labels are unique across the different versions of a
     * particular secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * The name of the secret version. Labels are unique across the different versions of a
     * particular secret.
     *
     * @return the value
     */
    public String getVersionName() {
        return versionName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretBundleContent")
    private final SecretBundleContentDetails secretBundleContent;

    public SecretBundleContentDetails getSecretBundleContent() {
        return secretBundleContent;
    }

    /**
     * An optional property indicating when to delete the secret version, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the secret version, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * An optional property indicating when the secret version will expire, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
    private final java.util.Date timeOfExpiry;

    /**
     * An optional property indicating when the secret version will expire, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfExpiry() {
        return timeOfExpiry;
    }

    /** */
    public enum Stages implements com.oracle.bmc.http.internal.BmcEnum {
        Current("CURRENT"),
        Pending("PENDING"),
        Latest("LATEST"),
        Previous("PREVIOUS"),
        Deprecated("DEPRECATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Stages.class);

        private final String value;
        private static java.util.Map<String, Stages> map;

        static {
            map = new java.util.HashMap<>();
            for (Stages v : Stages.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Stages(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Stages create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Stages', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** A list of possible rotation states for the secret version. */
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<Stages> stages;

    /**
     * A list of possible rotation states for the secret version.
     *
     * @return the value
     */
    public java.util.List<Stages> getStages() {
        return stages;
    }

    /** Customer-provided contextual metadata for the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, Object> metadata;

    /**
     * Customer-provided contextual metadata for the secret.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getMetadata() {
        return metadata;
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
        sb.append("SecretBundle(");
        sb.append("super=").append(super.toString());
        sb.append("secretId=").append(String.valueOf(this.secretId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", versionName=").append(String.valueOf(this.versionName));
        sb.append(", secretBundleContent=").append(String.valueOf(this.secretBundleContent));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", timeOfExpiry=").append(String.valueOf(this.timeOfExpiry));
        sb.append(", stages=").append(String.valueOf(this.stages));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretBundle)) {
            return false;
        }

        SecretBundle other = (SecretBundle) o;
        return java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.versionName, other.versionName)
                && java.util.Objects.equals(this.secretBundleContent, other.secretBundleContent)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.timeOfExpiry, other.timeOfExpiry)
                && java.util.Objects.equals(this.stages, other.stages)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result =
                (result * PRIME)
                        + (this.secretBundleContent == null
                                ? 43
                                : this.secretBundleContent.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.timeOfExpiry == null ? 43 : this.timeOfExpiry.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
