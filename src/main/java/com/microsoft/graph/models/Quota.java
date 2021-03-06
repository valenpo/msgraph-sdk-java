// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.StoragePlanInformation;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Quota.
 */
public class Quota implements IJsonBackedObject {

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
     * The Deleted.
     * Total space consumed by files in the recycle bin, in bytes. Read-only.
     */
    @SerializedName(value = "deleted", alternate = {"Deleted"})
    @Expose
	@Nullable
    public Long deleted;

    /**
     * The Remaining.
     * Total space remaining before reaching the quota limit, in bytes. Read-only.
     */
    @SerializedName(value = "remaining", alternate = {"Remaining"})
    @Expose
	@Nullable
    public Long remaining;

    /**
     * The State.
     * Enumeration value that indicates the state of the storage space. Read-only.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public String state;

    /**
     * The Storage Plan Information.
     * Information about the drive's storage quota plans. Only in Personal OneDrive.
     */
    @SerializedName(value = "storagePlanInformation", alternate = {"StoragePlanInformation"})
    @Expose
	@Nullable
    public StoragePlanInformation storagePlanInformation;

    /**
     * The Total.
     * Total allowed storage space, in bytes. Read-only.
     */
    @SerializedName(value = "total", alternate = {"Total"})
    @Expose
	@Nullable
    public Long total;

    /**
     * The Used.
     * Total space used, in bytes. Read-only.
     */
    @SerializedName(value = "used", alternate = {"Used"})
    @Expose
	@Nullable
    public Long used;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
