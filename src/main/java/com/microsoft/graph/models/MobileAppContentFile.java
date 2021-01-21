// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.MobileAppContentFileUploadState;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File.
 */
public class MobileAppContentFile extends Entity implements IJsonBackedObject {


    /**
     * The Azure Storage Uri.
     * The Azure Storage URI.
     */
    @SerializedName(value = "azureStorageUri", alternate = {"AzureStorageUri"})
    @Expose
	@Nullable
    public String azureStorageUri;

    /**
     * The Azure Storage Uri Expiration Date Time.
     * The time the Azure storage Uri expires.
     */
    @SerializedName(value = "azureStorageUriExpirationDateTime", alternate = {"AzureStorageUriExpirationDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime azureStorageUriExpirationDateTime;

    /**
     * The Created Date Time.
     * The time the file was created.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Is Committed.
     * A value indicating whether the file is committed.
     */
    @SerializedName(value = "isCommitted", alternate = {"IsCommitted"})
    @Expose
	@Nullable
    public Boolean isCommitted;

    /**
     * The Manifest.
     * The manifest information.
     */
    @SerializedName(value = "manifest", alternate = {"Manifest"})
    @Expose
	@Nullable
    public byte[] manifest;

    /**
     * The Name.
     * the file name.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Size.
     * The size of the file prior to encryption.
     */
    @SerializedName(value = "size", alternate = {"Size"})
    @Expose
	@Nullable
    public Long size;

    /**
     * The Size Encrypted.
     * The size of the file after encryption.
     */
    @SerializedName(value = "sizeEncrypted", alternate = {"SizeEncrypted"})
    @Expose
	@Nullable
    public Long sizeEncrypted;

    /**
     * The Upload State.
     * The state of the current upload request. Possible values are: success, transientError, error, unknown, azureStorageUriRequestSuccess, azureStorageUriRequestPending, azureStorageUriRequestFailed, azureStorageUriRequestTimedOut, azureStorageUriRenewalSuccess, azureStorageUriRenewalPending, azureStorageUriRenewalFailed, azureStorageUriRenewalTimedOut, commitFileSuccess, commitFilePending, commitFileFailed, commitFileTimedOut.
     */
    @SerializedName(value = "uploadState", alternate = {"UploadState"})
    @Expose
	@Nullable
    public MobileAppContentFileUploadState uploadState;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}