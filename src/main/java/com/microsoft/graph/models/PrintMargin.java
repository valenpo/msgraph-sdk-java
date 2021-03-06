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
 * The class for the Print Margin.
 */
public class PrintMargin implements IJsonBackedObject {

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
     * The Bottom.
     * The margin in microns from the bottom edge.
     */
    @SerializedName(value = "bottom", alternate = {"Bottom"})
    @Expose
	@Nullable
    public Integer bottom;

    /**
     * The Left.
     * The margin in microns from the left edge.
     */
    @SerializedName(value = "left", alternate = {"Left"})
    @Expose
	@Nullable
    public Integer left;

    /**
     * The Right.
     * The margin in microns from the right edge.
     */
    @SerializedName(value = "right", alternate = {"Right"})
    @Expose
	@Nullable
    public Integer right;

    /**
     * The Top.
     * The margin in microns from the top edge.
     */
    @SerializedName(value = "top", alternate = {"Top"})
    @Expose
	@Nullable
    public Integer top;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
