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
 * The class for the Workbook Functions Weekday Parameter Set.
 */
public class WorkbookFunctionsWeekdayParameterSet {
    /**
     * The serial Number.
     * 
     */
    @SerializedName(value = "serialNumber", alternate = {"SerialNumber"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement serialNumber;

    /**
     * The return Type.
     * 
     */
    @SerializedName(value = "returnType", alternate = {"ReturnType"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement returnType;


    /**
     * Instiaciates a new WorkbookFunctionsWeekdayParameterSet
     */
    public WorkbookFunctionsWeekdayParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsWeekdayParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsWeekdayParameterSet(@Nonnull final WorkbookFunctionsWeekdayParameterSetBuilder builder) {
        this.serialNumber = builder.serialNumber;
        this.returnType = builder.returnType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsWeekdayParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsWeekdayParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsWeekdayParameterSet
     */
    public static final class WorkbookFunctionsWeekdayParameterSetBuilder {
        /**
         * The serialNumber parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement serialNumber;
        /**
         * Sets the SerialNumber
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWeekdayParameterSetBuilder withSerialNumber(@Nullable final com.google.gson.JsonElement val) {
            this.serialNumber = val;
            return this;
        }
        /**
         * The returnType parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement returnType;
        /**
         * Sets the ReturnType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsWeekdayParameterSetBuilder withReturnType(@Nullable final com.google.gson.JsonElement val) {
            this.returnType = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsWeekdayParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsWeekdayParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsWeekdayParameterSet build() {
            return new WorkbookFunctionsWeekdayParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.serialNumber != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("serialNumber", serialNumber));
        }
        if(this.returnType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("returnType", returnType));
        }
        return result;
    }
}
