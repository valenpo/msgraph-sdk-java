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
 * The class for the Base Base Item.
 */
public class BaseBaseItem extends Entity implements IJsonBackedObject {


    public BaseBaseItem() {
        oDataType = "microsoft.graph.baseItem";
    }

    /**
     * The Created By.
     * Identity of the user, device, or application which created the item. Read-only.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * Date and time of item creation. Read-only.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The ETag.
     * ETag for the item. Read-only.
     */
    @SerializedName("eTag")
    @Expose
    public String eTag;

    /**
     * The Last Modified By.
     * Identity of the user, device, and application which last modified the item. Read-only.
     */
    @SerializedName("lastModifiedBy")
    @Expose
    public IdentitySet lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * Date and time the item was last modified. Read-only.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Name.
     * The name of the item. Read-write.
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Parent Reference.
     * Parent information, if the item has a parent. Read-write.
     */
    @SerializedName("parentReference")
    @Expose
    public ItemReference parentReference;

    /**
     * The Web Url.
     * URL that displays the resource in the browser. Read-only.
     */
    @SerializedName("webUrl")
    @Expose
    public String webUrl;

    /**
     * The Created By User.
     * 
     */
    @SerializedName("createdByUser")
    @Expose
    public User createdByUser;

    /**
     * The Last Modified By User.
     * 
     */
    @SerializedName("lastModifiedByUser")
    @Expose
    public User lastModifiedByUser;


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
