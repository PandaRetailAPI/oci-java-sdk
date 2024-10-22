/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Consider Product stack as product.To be provided if the product stack should be considered as a
 * Product also. Allows compliance reporting and patching against the product stack target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProductStackAsProductSubCategoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "subCategory")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProductStackAsProductSubCategoryDetails extends ProductStackSubCategoryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Versions associated with the PRODUCT . */
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<String> versions;

        /**
         * Versions associated with the PRODUCT .
         *
         * @param versions the value to set
         * @return this builder
         */
        public Builder versions(java.util.List<String> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }
        /**
         * OCID for the Credential name to be associated with the Product Stack. These are useful
         * for target discovery or lifecycle management activities, for example, Oracle WebLogic
         * admin credentials for Oracle WebLogic Application server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private java.util.List<ConfigAssociationDetails> credentials;

        /**
         * OCID for the Credential name to be associated with the Product Stack. These are useful
         * for target discovery or lifecycle management activities, for example, Oracle WebLogic
         * admin credentials for Oracle WebLogic Application server.
         *
         * @param credentials the value to set
         * @return this builder
         */
        public Builder credentials(java.util.List<ConfigAssociationDetails> credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }
        /**
         * Various components of the Product. For example:The administration server or node manager
         * can be the components of the Oracle WebLogic Application server. Forms server or
         * concurrent manager can be the components of the Oracle E-Business Suite.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("components")
        private java.util.List<String> components;

        /**
         * Various components of the Product. For example:The administration server or node manager
         * can be the components of the Oracle WebLogic Application server. Forms server or
         * concurrent manager can be the components of the Oracle E-Business Suite.
         *
         * @param components the value to set
         * @return this builder
         */
        public Builder components(java.util.List<String> components) {
            this.components = components;
            this.__explicitlySet__.add("components");
            return this;
        }
        /** Patch Types associated with this Product Stack which will be considered as Product. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchTypes")
        private java.util.List<ConfigAssociationDetails> patchTypes;

        /**
         * Patch Types associated with this Product Stack which will be considered as Product.
         *
         * @param patchTypes the value to set
         * @return this builder
         */
        public Builder patchTypes(java.util.List<ConfigAssociationDetails> patchTypes) {
            this.patchTypes = patchTypes;
            this.__explicitlySet__.add("patchTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductStackAsProductSubCategoryDetails build() {
            ProductStackAsProductSubCategoryDetails model =
                    new ProductStackAsProductSubCategoryDetails(
                            this.versions, this.credentials, this.components, this.patchTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductStackAsProductSubCategoryDetails model) {
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("components")) {
                this.components(model.getComponents());
            }
            if (model.wasPropertyExplicitlySet("patchTypes")) {
                this.patchTypes(model.getPatchTypes());
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
    public ProductStackAsProductSubCategoryDetails(
            java.util.List<String> versions,
            java.util.List<ConfigAssociationDetails> credentials,
            java.util.List<String> components,
            java.util.List<ConfigAssociationDetails> patchTypes) {
        super();
        this.versions = versions;
        this.credentials = credentials;
        this.components = components;
        this.patchTypes = patchTypes;
    }

    /** Versions associated with the PRODUCT . */
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<String> versions;

    /**
     * Versions associated with the PRODUCT .
     *
     * @return the value
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * OCID for the Credential name to be associated with the Product Stack. These are useful for
     * target discovery or lifecycle management activities, for example, Oracle WebLogic admin
     * credentials for Oracle WebLogic Application server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final java.util.List<ConfigAssociationDetails> credentials;

    /**
     * OCID for the Credential name to be associated with the Product Stack. These are useful for
     * target discovery or lifecycle management activities, for example, Oracle WebLogic admin
     * credentials for Oracle WebLogic Application server.
     *
     * @return the value
     */
    public java.util.List<ConfigAssociationDetails> getCredentials() {
        return credentials;
    }

    /**
     * Various components of the Product. For example:The administration server or node manager can
     * be the components of the Oracle WebLogic Application server. Forms server or concurrent
     * manager can be the components of the Oracle E-Business Suite.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("components")
    private final java.util.List<String> components;

    /**
     * Various components of the Product. For example:The administration server or node manager can
     * be the components of the Oracle WebLogic Application server. Forms server or concurrent
     * manager can be the components of the Oracle E-Business Suite.
     *
     * @return the value
     */
    public java.util.List<String> getComponents() {
        return components;
    }

    /** Patch Types associated with this Product Stack which will be considered as Product. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchTypes")
    private final java.util.List<ConfigAssociationDetails> patchTypes;

    /**
     * Patch Types associated with this Product Stack which will be considered as Product.
     *
     * @return the value
     */
    public java.util.List<ConfigAssociationDetails> getPatchTypes() {
        return patchTypes;
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
        sb.append("ProductStackAsProductSubCategoryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(", components=").append(String.valueOf(this.components));
        sb.append(", patchTypes=").append(String.valueOf(this.patchTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductStackAsProductSubCategoryDetails)) {
            return false;
        }

        ProductStackAsProductSubCategoryDetails other = (ProductStackAsProductSubCategoryDetails) o;
        return java.util.Objects.equals(this.versions, other.versions)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.components, other.components)
                && java.util.Objects.equals(this.patchTypes, other.patchTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + (this.components == null ? 43 : this.components.hashCode());
        result = (result * PRIME) + (this.patchTypes == null ? 43 : this.patchTypes.hashCode());
        return result;
    }
}
