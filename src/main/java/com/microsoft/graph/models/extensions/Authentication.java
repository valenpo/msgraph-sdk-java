// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethod;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.models.extensions.MicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.models.extensions.WindowsHelloForBusinessAuthenticationMethod;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.Fido2AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsHelloForBusinessAuthenticationMethodCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication.
 */
public class Authentication extends Entity implements IJsonBackedObject {


    /**
     * The Fido2Methods.
     * 
     */
    @SerializedName(value = "fido2Methods", alternate = {"Fido2Methods"})
    @Expose
    public Fido2AuthenticationMethodCollectionPage fido2Methods;

    /**
     * The Methods.
     * 
     */
    @SerializedName(value = "methods", alternate = {"Methods"})
    @Expose
    public AuthenticationMethodCollectionPage methods;

    /**
     * The Microsoft Authenticator Methods.
     * 
     */
    @SerializedName(value = "microsoftAuthenticatorMethods", alternate = {"MicrosoftAuthenticatorMethods"})
    @Expose
    public MicrosoftAuthenticatorAuthenticationMethodCollectionPage microsoftAuthenticatorMethods;

    /**
     * The Windows Hello For Business Methods.
     * 
     */
    @SerializedName(value = "windowsHelloForBusinessMethods", alternate = {"WindowsHelloForBusinessMethods"})
    @Expose
    public WindowsHelloForBusinessAuthenticationMethodCollectionPage windowsHelloForBusinessMethods;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("fido2Methods")) {
            fido2Methods = serializer.deserializeObject(json.get("fido2Methods").toString(), Fido2AuthenticationMethodCollectionPage.class);
        }

        if (json.has("methods")) {
            methods = serializer.deserializeObject(json.get("methods").toString(), AuthenticationMethodCollectionPage.class);
        }

        if (json.has("microsoftAuthenticatorMethods")) {
            microsoftAuthenticatorMethods = serializer.deserializeObject(json.get("microsoftAuthenticatorMethods").toString(), MicrosoftAuthenticatorAuthenticationMethodCollectionPage.class);
        }

        if (json.has("windowsHelloForBusinessMethods")) {
            windowsHelloForBusinessMethods = serializer.deserializeObject(json.get("windowsHelloForBusinessMethods").toString(), WindowsHelloForBusinessAuthenticationMethodCollectionPage.class);
        }
    }
}