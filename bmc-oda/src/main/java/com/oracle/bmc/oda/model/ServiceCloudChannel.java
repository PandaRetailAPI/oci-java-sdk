/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * The configuration for a Service Cloud agent channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceCloudChannel.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ServiceCloudChannel extends Channel {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private ChannelCategory category;

        public Builder category(ChannelCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
        private Long sessionExpiryDurationInMilliseconds;

        public Builder sessionExpiryDurationInMilliseconds(
                Long sessionExpiryDurationInMilliseconds) {
            this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
            this.__explicitlySet__.add("sessionExpiryDurationInMilliseconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostNamePrefix")
        private String hostNamePrefix;

        public Builder hostNamePrefix(String hostNamePrefix) {
            this.hostNamePrefix = hostNamePrefix;
            this.__explicitlySet__.add("hostNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientType")
        private ServiceCloudClientType clientType;

        public Builder clientType(ServiceCloudClientType clientType) {
            this.clientType = clientType;
            this.__explicitlySet__.add("clientType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCloudChannel build() {
            ServiceCloudChannel __instance__ =
                    new ServiceCloudChannel(
                            id,
                            name,
                            description,
                            category,
                            sessionExpiryDurationInMilliseconds,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags,
                            domainName,
                            hostNamePrefix,
                            userName,
                            clientType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCloudChannel o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .category(o.getCategory())
                            .sessionExpiryDurationInMilliseconds(
                                    o.getSessionExpiryDurationInMilliseconds())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .domainName(o.getDomainName())
                            .hostNamePrefix(o.getHostNamePrefix())
                            .userName(o.getUserName())
                            .clientType(o.getClientType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public ServiceCloudChannel(
            String id,
            String name,
            String description,
            ChannelCategory category,
            Long sessionExpiryDurationInMilliseconds,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String domainName,
            String hostNamePrefix,
            String userName,
            ServiceCloudClientType clientType) {
        super(
                id,
                name,
                description,
                category,
                sessionExpiryDurationInMilliseconds,
                lifecycleState,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags);
        this.domainName = domainName;
        this.hostNamePrefix = hostNamePrefix;
        this.userName = userName;
        this.clientType = clientType;
    }

    /**
     * The domain name.
     *
     * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
     * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
     * is sitename and the domain name is exampledomain.com.
     *
     * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
     * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    String domainName;

    /**
     * The host prefix.
     *
     * If you have access to Oracle B2C Service, you can derive this value from the URL that you use to launch the
     * Agent Browser User Interface. For example, if the URL is sitename.exampledomain.com, then the host name prefix
     * is sitename and the domain name is exampledomain.com.
     *
     * If the channel is connecting to Oracle B2C Service version 19A or later, and you have multiple interfaces,
     * then you must include the interface ID in the host (site) name . For example, for the interface that has an ID of 2, you would use something like sitename-2.exampledomain.com.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostNamePrefix")
    String hostNamePrefix;

    /**
     * The user name for an Oracle B2C Service staff member who has the necessary profile permissions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * The type of Service Cloud client.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientType")
    ServiceCloudClientType clientType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
