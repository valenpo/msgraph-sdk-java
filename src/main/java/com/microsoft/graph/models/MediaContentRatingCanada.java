// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.RatingCanadaMoviesType;
import com.microsoft.graph.models.RatingCanadaTelevisionType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Content Rating Canada.
 */
public class MediaContentRatingCanada implements IJsonBackedObject {

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
     * The Movie Rating.
     * Movies rating selected for Canada. Possible values are: allAllowed, allBlocked, general, parentalGuidance, agesAbove14, agesAbove18, restricted.
     */
    @SerializedName(value = "movieRating", alternate = {"MovieRating"})
    @Expose
	@Nullable
    public RatingCanadaMoviesType movieRating;

    /**
     * The Tv Rating.
     * TV rating selected for Canada. Possible values are: allAllowed, allBlocked, children, childrenAbove8, general, parentalGuidance, agesAbove14, agesAbove18.
     */
    @SerializedName(value = "tvRating", alternate = {"TvRating"})
    @Expose
	@Nullable
    public RatingCanadaTelevisionType tvRating;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
