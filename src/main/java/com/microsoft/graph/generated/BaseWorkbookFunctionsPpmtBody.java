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
import com.google.gson.annotations.*;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Ppmt Body.
 */
public class BaseWorkbookFunctionsPpmtBody {

    /**
     * The rate.
     * 
     */
    @SerializedName("rate")
    @Expose
    public com.google.gson.JsonElement rate;

    /**
     * The per.
     * 
     */
    @SerializedName("per")
    @Expose
    public com.google.gson.JsonElement per;

    /**
     * The nper.
     * 
     */
    @SerializedName("nper")
    @Expose
    public com.google.gson.JsonElement nper;

    /**
     * The pv.
     * 
     */
    @SerializedName("pv")
    @Expose
    public com.google.gson.JsonElement pv;

    /**
     * The fv.
     * 
     */
    @SerializedName("fv")
    @Expose
    public com.google.gson.JsonElement fv;

    /**
     * The type.
     * 
     */
    @SerializedName("type")
    @Expose
    public com.google.gson.JsonElement type;


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
