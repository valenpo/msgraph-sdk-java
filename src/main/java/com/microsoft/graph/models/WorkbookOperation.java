// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.WorkbookOperationError;
import com.microsoft.graph.models.WorkbookOperationStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Operation.
 */
public class WorkbookOperation extends Entity implements IJsonBackedObject {


    /**
     * The Error.
     * The error returned by the operation.
     */
    @SerializedName(value = "error", alternate = {"Error"})
    @Expose
	@Nullable
    public WorkbookOperationError error;

    /**
     * The Resource Location.
     * The resource URI for the result.
     */
    @SerializedName(value = "resourceLocation", alternate = {"ResourceLocation"})
    @Expose
	@Nullable
    public String resourceLocation;

    /**
     * The Status.
     * The current status of the operation. Possible values are: NotStarted, Running, Completed, Failed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public WorkbookOperationStatus status;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
