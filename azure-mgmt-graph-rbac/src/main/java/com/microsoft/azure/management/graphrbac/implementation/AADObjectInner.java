/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import java.util.List;

/**
 * The properties of an Active Directory object.
 */
public class AADObjectInner {
    /**
     * The ID of the object.
     */
    private String objectId;

    /**
     * The type of AAD object.
     */
    private String objectType;

    /**
     * The display name of the object.
     */
    private String displayName;

    /**
     * The principal name of the object.
     */
    private String userPrincipalName;

    /**
     * The primary email address of the object.
     */
    private String mail;

    /**
     * Whether the AAD object is mail-enabled.
     */
    private Boolean mailEnabled;

    /**
     * Whether the AAD object is security-enabled.
     */
    private Boolean securityEnabled;

    /**
     * The sign-in name of the object.
     */
    private String signInName;

    /**
     * A collection of service principal names associated with the object.
     */
    private List<String> servicePrincipalNames;

    /**
     * The user type of the object.
     */
    private String userType;

    /**
     * Get the objectId value.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set the objectId value.
     *
     * @param objectId the objectId value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get the objectType value.
     *
     * @return the objectType value
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType value.
     *
     * @param objectType the objectType value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the userPrincipalName value.
     *
     * @return the userPrincipalName value
     */
    public String userPrincipalName() {
        return this.userPrincipalName;
    }

    /**
     * Set the userPrincipalName value.
     *
     * @param userPrincipalName the userPrincipalName value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * Get the mail value.
     *
     * @return the mail value
     */
    public String mail() {
        return this.mail;
    }

    /**
     * Set the mail value.
     *
     * @param mail the mail value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Get the mailEnabled value.
     *
     * @return the mailEnabled value
     */
    public Boolean mailEnabled() {
        return this.mailEnabled;
    }

    /**
     * Set the mailEnabled value.
     *
     * @param mailEnabled the mailEnabled value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withMailEnabled(Boolean mailEnabled) {
        this.mailEnabled = mailEnabled;
        return this;
    }

    /**
     * Get the securityEnabled value.
     *
     * @return the securityEnabled value
     */
    public Boolean securityEnabled() {
        return this.securityEnabled;
    }

    /**
     * Set the securityEnabled value.
     *
     * @param securityEnabled the securityEnabled value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * Get the signInName value.
     *
     * @return the signInName value
     */
    public String signInName() {
        return this.signInName;
    }

    /**
     * Set the signInName value.
     *
     * @param signInName the signInName value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withSignInName(String signInName) {
        this.signInName = signInName;
        return this;
    }

    /**
     * Get the servicePrincipalNames value.
     *
     * @return the servicePrincipalNames value
     */
    public List<String> servicePrincipalNames() {
        return this.servicePrincipalNames;
    }

    /**
     * Set the servicePrincipalNames value.
     *
     * @param servicePrincipalNames the servicePrincipalNames value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withServicePrincipalNames(List<String> servicePrincipalNames) {
        this.servicePrincipalNames = servicePrincipalNames;
        return this;
    }

    /**
     * Get the userType value.
     *
     * @return the userType value
     */
    public String userType() {
        return this.userType;
    }

    /**
     * Set the userType value.
     *
     * @param userType the userType value to set
     * @return the AADObjectInner object itself.
     */
    public AADObjectInner withUserType(String userType) {
        this.userType = userType;
        return this;
    }

}
