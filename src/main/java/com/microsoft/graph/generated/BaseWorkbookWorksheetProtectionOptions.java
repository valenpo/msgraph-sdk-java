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
 * The class for the Base Workbook Worksheet Protection Options.
 */
public class BaseWorkbookWorksheetProtectionOptions implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    public BaseWorkbookWorksheetProtectionOptions() {
        oDataType = "microsoft.graph.workbookWorksheetProtectionOptions";
    }

    /**
     * The Allow Auto Filter.
     * 
     */
    @SerializedName("allowAutoFilter")
    @Expose
    public Boolean allowAutoFilter;

    /**
     * The Allow Delete Columns.
     * 
     */
    @SerializedName("allowDeleteColumns")
    @Expose
    public Boolean allowDeleteColumns;

    /**
     * The Allow Delete Rows.
     * 
     */
    @SerializedName("allowDeleteRows")
    @Expose
    public Boolean allowDeleteRows;

    /**
     * The Allow Format Cells.
     * 
     */
    @SerializedName("allowFormatCells")
    @Expose
    public Boolean allowFormatCells;

    /**
     * The Allow Format Columns.
     * 
     */
    @SerializedName("allowFormatColumns")
    @Expose
    public Boolean allowFormatColumns;

    /**
     * The Allow Format Rows.
     * 
     */
    @SerializedName("allowFormatRows")
    @Expose
    public Boolean allowFormatRows;

    /**
     * The Allow Insert Columns.
     * 
     */
    @SerializedName("allowInsertColumns")
    @Expose
    public Boolean allowInsertColumns;

    /**
     * The Allow Insert Hyperlinks.
     * 
     */
    @SerializedName("allowInsertHyperlinks")
    @Expose
    public Boolean allowInsertHyperlinks;

    /**
     * The Allow Insert Rows.
     * 
     */
    @SerializedName("allowInsertRows")
    @Expose
    public Boolean allowInsertRows;

    /**
     * The Allow Pivot Tables.
     * 
     */
    @SerializedName("allowPivotTables")
    @Expose
    public Boolean allowPivotTables;

    /**
     * The Allow Sort.
     * 
     */
    @SerializedName("allowSort")
    @Expose
    public Boolean allowSort;


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
