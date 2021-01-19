// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
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
 * The class for the Workbook Functions Chi Sq_Dist_RTParameter Set.
 */
public class WorkbookFunctionsChiSq_Dist_RTParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The deg Freedom.
     * 
     */
    @SerializedName(value = "degFreedom", alternate = {"DegFreedom"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement degFreedom;


    /**
     * Instiaciates a new WorkbookFunctionsChiSq_Dist_RTParameterSet
     */
    public WorkbookFunctionsChiSq_Dist_RTParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsChiSq_Dist_RTParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsChiSq_Dist_RTParameterSet(@Nonnull final WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder builder) {
        this.x = builder.x;
        this.degFreedom = builder.degFreedom;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsChiSq_Dist_RTParameterSet
     */
    public static final class WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * The degFreedom parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement degFreedom;
        /**
         * Sets the DegFreedom
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder withDegFreedom(@Nullable final com.google.gson.JsonElement val) {
            this.degFreedom = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsChiSq_Dist_RTParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsChiSq_Dist_RTParameterSet build() {
            return new WorkbookFunctionsChiSq_Dist_RTParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.degFreedom != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("degFreedom", degFreedom));
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