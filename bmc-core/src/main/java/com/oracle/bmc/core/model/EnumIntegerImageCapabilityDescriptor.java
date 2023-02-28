/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Enum Integer type CapabilityDescriptor <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnumIntegerImageCapabilityDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "descriptorType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EnumIntegerImageCapabilityDescriptor extends ImageCapabilitySchemaDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** the list of values for the enum */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<Integer> values;

        /**
         * the list of values for the enum
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<Integer> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /** the default value */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Integer defaultValue;

        /**
         * the default value
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(Integer defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnumIntegerImageCapabilityDescriptor build() {
            EnumIntegerImageCapabilityDescriptor model =
                    new EnumIntegerImageCapabilityDescriptor(
                            this.source, this.values, this.defaultValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnumIntegerImageCapabilityDescriptor model) {
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
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

    @Deprecated
    public EnumIntegerImageCapabilityDescriptor(
            Source source, java.util.List<Integer> values, Integer defaultValue) {
        super(source);
        this.values = values;
        this.defaultValue = defaultValue;
    }

    /** the list of values for the enum */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<Integer> values;

    /**
     * the list of values for the enum
     *
     * @return the value
     */
    public java.util.List<Integer> getValues() {
        return values;
    }

    /** the default value */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Integer defaultValue;

    /**
     * the default value
     *
     * @return the value
     */
    public Integer getDefaultValue() {
        return defaultValue;
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
        sb.append("EnumIntegerImageCapabilityDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnumIntegerImageCapabilityDescriptor)) {
            return false;
        }

        EnumIntegerImageCapabilityDescriptor other = (EnumIntegerImageCapabilityDescriptor) o;
        return java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        return result;
    }
}
