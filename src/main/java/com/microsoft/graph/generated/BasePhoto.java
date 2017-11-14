// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Photo.
 */
public class BasePhoto implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    public BasePhoto() {
        oDataType = "microsoft.graph.photo";
    }

    /**
     * The Camera Make.
     * Camera manufacturer. Read-only.
     */
    @SerializedName("cameraMake")
    @Expose
    public String cameraMake;

    /**
     * The Camera Model.
     * Camera model. Read-only.
     */
    @SerializedName("cameraModel")
    @Expose
    public String cameraModel;

    /**
     * The Exposure Denominator.
     * The denominator for the exposure time fraction from the camera. Read-only.
     */
    @SerializedName("exposureDenominator")
    @Expose
    public Double exposureDenominator;

    /**
     * The Exposure Numerator.
     * The numerator for the exposure time fraction from the camera. Read-only.
     */
    @SerializedName("exposureNumerator")
    @Expose
    public Double exposureNumerator;

    /**
     * The FNumber.
     * The F-stop value from the camera. Read-only.
     */
    @SerializedName("fNumber")
    @Expose
    public Double fNumber;

    /**
     * The Focal Length.
     * The focal length from the camera. Read-only.
     */
    @SerializedName("focalLength")
    @Expose
    public Double focalLength;

    /**
     * The Iso.
     * The ISO value from the camera. Read-only.
     */
    @SerializedName("iso")
    @Expose
    public Integer iso;

    /**
     * The Taken Date Time.
     * Represents the date and time the photo was taken. Read-only.
     */
    @SerializedName("takenDateTime")
    @Expose
    public java.util.Calendar takenDateTime;


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
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
