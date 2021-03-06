// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.DataPolicyOperationStatus;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Policy Operation.
 */
public class DataPolicyOperation extends Entity implements IJsonBackedObject {


    /**
     * The Completed Date Time.
     * Represents when the request for this data policy operation was completed, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Null until the operation completes.
     */
    @SerializedName(value = "completedDateTime", alternate = {"CompletedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime completedDateTime;

    /**
     * The Progress.
     * Specifies the progress of an operation.
     */
    @SerializedName(value = "progress", alternate = {"Progress"})
    @Expose
	@Nullable
    public Double progress;

    /**
     * The Status.
     * Possible values are: notStarted, running, complete, failed, unknownFutureValue.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public DataPolicyOperationStatus status;

    /**
     * The Storage Location.
     * The URL location to where data is being exported for export requests.
     */
    @SerializedName(value = "storageLocation", alternate = {"StorageLocation"})
    @Expose
	@Nullable
    public String storageLocation;

    /**
     * The Submitted Date Time.
     * Represents when the request for this data operation was submitted, in UTC time, using the ISO 8601 format. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
     */
    @SerializedName(value = "submittedDateTime", alternate = {"SubmittedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime submittedDateTime;

    /**
     * The User Id.
     * The id for the user on whom the operation is performed.
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
