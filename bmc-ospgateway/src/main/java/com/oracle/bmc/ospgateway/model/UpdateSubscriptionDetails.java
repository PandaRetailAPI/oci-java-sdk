/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Request object for updating a subscription <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSubscriptionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateSubscriptionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subscription", "email"})
    public UpdateSubscriptionDetails(Subscription subscription, String email) {
        super();
        this.subscription = subscription;
        this.email = email;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("subscription")
        private Subscription subscription;

        public Builder subscription(Subscription subscription) {
            this.subscription = subscription;
            this.__explicitlySet__.add("subscription");
            return this;
        }
        /** User email */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * User email
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSubscriptionDetails build() {
            UpdateSubscriptionDetails model =
                    new UpdateSubscriptionDetails(this.subscription, this.email);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSubscriptionDetails model) {
            if (model.wasPropertyExplicitlySet("subscription")) {
                this.subscription(model.getSubscription());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
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

    @com.fasterxml.jackson.annotation.JsonProperty("subscription")
    private final Subscription subscription;

    public Subscription getSubscription() {
        return subscription;
    }

    /** User email */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * User email
     *
     * @return the value
     */
    public String getEmail() {
        return email;
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
        sb.append("UpdateSubscriptionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("subscription=").append(String.valueOf(this.subscription));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubscriptionDetails)) {
            return false;
        }

        UpdateSubscriptionDetails other = (UpdateSubscriptionDetails) o;
        return java.util.Objects.equals(this.subscription, other.subscription)
                && java.util.Objects.equals(this.email, other.email)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subscription == null ? 43 : this.subscription.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
