/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.implementation;

import com.microsoft.azure.management.storage.Sku;
import com.microsoft.azure.management.storage.Kind;
import java.util.Map;
import com.microsoft.azure.management.storage.CustomDomain;
import com.microsoft.azure.management.storage.Encryption;
import com.microsoft.azure.management.storage.AccessTier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The parameters used when creating a storage account.
 */
@JsonFlatten
public class StorageAccountCreateParametersInner {
    /**
     * Required. Gets or sets the sku name.
     */
    @JsonProperty(required = true)
    private Sku sku;

    /**
     * Required. Indicates the type of storage account. Possible values
     * include: 'Storage', 'BlobStorage'.
     */
    @JsonProperty(required = true)
    private Kind kind;

    /**
     * Required. Gets or sets the location of the resource. This will be one of
     * the supported and registered Azure Geo Regions (e.g. West US, East US,
     * Southeast Asia, etc.). The geo region of a resource cannot be changed
     * once it is created, but if an identical geo region is specified on
     * update, the request will succeed.
     */
    @JsonProperty(required = true)
    private String location;

    /**
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used for viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key with a length no greater than 128 characters and a value
     * with a length no greater than 256 characters.
     */
    private Map<String, String> tags;

    /**
     * User domain assigned to the storage account. Name is the CNAME source.
     * Only one custom domain is supported per storage account at this time. To
     * clear the existing custom domain, use an empty string for the custom
     * domain name property.
     */
    @JsonProperty(value = "properties.customDomain")
    private CustomDomain customDomain;

    /**
     * Provides the encryption settings on the account. If left unspecified the
     * account encryption settings will remain the same. The default setting is
     * unencrypted.
     */
    @JsonProperty(value = "properties.encryption")
    private Encryption encryption;

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier
     * used for billing. Possible values include: 'Hot', 'Cool'.
     */
    @JsonProperty(value = "properties.accessTier")
    private AccessTier accessTier;

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the customDomain value.
     *
     * @return the customDomain value
     */
    public CustomDomain customDomain() {
        return this.customDomain;
    }

    /**
     * Set the customDomain value.
     *
     * @param customDomain the customDomain value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withCustomDomain(CustomDomain customDomain) {
        this.customDomain = customDomain;
        return this;
    }

    /**
     * Get the encryption value.
     *
     * @return the encryption value
     */
    public Encryption encryption() {
        return this.encryption;
    }

    /**
     * Set the encryption value.
     *
     * @param encryption the encryption value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withEncryption(Encryption encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get the accessTier value.
     *
     * @return the accessTier value
     */
    public AccessTier accessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier value.
     *
     * @param accessTier the accessTier value to set
     * @return the StorageAccountCreateParametersInner object itself.
     */
    public StorageAccountCreateParametersInner withAccessTier(AccessTier accessTier) {
        this.accessTier = accessTier;
        return this;
    }

}
