/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import com.microsoft.azure.management.resources.DeploymentOperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment operation information.
 */
public class DeploymentOperationInner {
    /**
     * Full deployment operation ID.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Deployment operation ID.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /**
     * Deployment properties.
     */
    private DeploymentOperationProperties properties;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the operationId value.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the properties value.
     *
     * @return the properties value
     */
    public DeploymentOperationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties value.
     *
     * @param properties the properties value to set
     * @return the DeploymentOperationInner object itself.
     */
    public DeploymentOperationInner withProperties(DeploymentOperationProperties properties) {
        this.properties = properties;
        return this;
    }

}
