// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Clear Parameter Set.
 */
public class WorkbookRangeClearParameterSet {
    /**
     * The apply To.
     * 
     */
    @SerializedName(value = "applyTo", alternate = {"ApplyTo"})
    @Expose
	@Nullable
    public String applyTo;


    /**
     * Instiaciates a new WorkbookRangeClearParameterSet
     */
    public WorkbookRangeClearParameterSet() {}
    /**
     * Instiaciates a new WorkbookRangeClearParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookRangeClearParameterSet(@Nonnull final WorkbookRangeClearParameterSetBuilder builder) {
        this.applyTo = builder.applyTo;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookRangeClearParameterSetBuilder newBuilder() {
        return new WorkbookRangeClearParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookRangeClearParameterSet
     */
    public static final class WorkbookRangeClearParameterSetBuilder {
        /**
         * The applyTo parameter value
         */
        @Nullable
        protected String applyTo;
        /**
         * Sets the ApplyTo
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookRangeClearParameterSetBuilder withApplyTo(@Nullable final String val) {
            this.applyTo = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookRangeClearParameterSetBuilder
         */
        @Nullable
        protected WorkbookRangeClearParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookRangeClearParameterSet build() {
            return new WorkbookRangeClearParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.applyTo != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("applyTo", applyTo));
        }
        return result;
    }
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