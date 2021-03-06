// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Dec2Oct Parameter Set.
 */
public class WorkbookFunctionsDec2OctParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The places.
     * 
     */
    @SerializedName(value = "places", alternate = {"Places"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement places;


    /**
     * Instiaciates a new WorkbookFunctionsDec2OctParameterSet
     */
    public WorkbookFunctionsDec2OctParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDec2OctParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDec2OctParameterSet(@Nonnull final WorkbookFunctionsDec2OctParameterSetBuilder builder) {
        this.number = builder.number;
        this.places = builder.places;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDec2OctParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDec2OctParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDec2OctParameterSet
     */
    public static final class WorkbookFunctionsDec2OctParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDec2OctParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The places parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement places;
        /**
         * Sets the Places
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDec2OctParameterSetBuilder withPlaces(@Nullable final com.google.gson.JsonElement val) {
            this.places = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDec2OctParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDec2OctParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDec2OctParameterSet build() {
            return new WorkbookFunctionsDec2OctParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.places != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("places", places));
        }
        return result;
    }
}
