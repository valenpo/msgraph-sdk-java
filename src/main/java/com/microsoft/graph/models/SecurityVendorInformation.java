// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Vendor Information.
 */
public class SecurityVendorInformation implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Provider.
     * Specific provider (product/service - not vendor company); for example, WindowsDefenderATP.
     */
    @SerializedName(value = "provider", alternate = {"Provider"})
    @Expose
	@Nullable
    public String provider;

    /**
     * The Provider Version.
     * Version of the provider or subprovider, if it exists, that generated the alert. Required
     */
    @SerializedName(value = "providerVersion", alternate = {"ProviderVersion"})
    @Expose
	@Nullable
    public String providerVersion;

    /**
     * The Sub Provider.
     * Specific subprovider (under aggregating provider); for example, WindowsDefenderATP.SmartScreen.
     */
    @SerializedName(value = "subProvider", alternate = {"SubProvider"})
    @Expose
	@Nullable
    public String subProvider;

    /**
     * The Vendor.
     * Name of the alert vendor (for example, Microsoft, Dell, FireEye). Required
     */
    @SerializedName(value = "vendor", alternate = {"Vendor"})
    @Expose
	@Nullable
    public String vendor;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
