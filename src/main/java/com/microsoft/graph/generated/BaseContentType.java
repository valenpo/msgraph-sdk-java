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
 * The class for the Base Content Type.
 */
public class BaseContentType extends Entity implements IJsonBackedObject {


    public BaseContentType() {
        oDataType = "microsoft.graph.contentType";
    }

    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Group.
     * 
     */
    @SerializedName("group")
    @Expose
    public String group;

    /**
     * The Hidden.
     * 
     */
    @SerializedName("hidden")
    @Expose
    public Boolean hidden;

    /**
     * The Inherited From.
     * 
     */
    @SerializedName("inheritedFrom")
    @Expose
    public ItemReference inheritedFrom;

    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Order.
     * 
     */
    @SerializedName("order")
    @Expose
    public ContentTypeOrder order;

    /**
     * The Parent Id.
     * 
     */
    @SerializedName("parentId")
    @Expose
    public String parentId;

    /**
     * The Read Only.
     * 
     */
    @SerializedName("readOnly")
    @Expose
    public Boolean readOnly;

    /**
     * The Sealed.
     * 
     */
    @SerializedName("sealed")
    @Expose
    public Boolean sealed;

    /**
     * The Column Links.
     * 
     */
    public ColumnLinkCollectionPage columnLinks;


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


        if (json.has("columnLinks")) {
            final BaseColumnLinkCollectionResponse response = new BaseColumnLinkCollectionResponse();
            if (json.has("columnLinks@odata.nextLink")) {
                response.nextLink = json.get("columnLinks@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("columnLinks").toString(), JsonObject[].class);
            final ColumnLink[] array = new ColumnLink[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ColumnLink.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            columnLinks = new ColumnLinkCollectionPage(response, null);
        }
    }
}
