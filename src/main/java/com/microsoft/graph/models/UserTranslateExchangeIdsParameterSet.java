// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ExchangeIdFormat;
import com.microsoft.graph.models.ConvertIdResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Translate Exchange Ids Parameter Set.
 */
public class UserTranslateExchangeIdsParameterSet {
    /**
     * The input Ids.
     * 
     */
    @SerializedName(value = "inputIds", alternate = {"InputIds"})
    @Expose
	@Nullable
    public java.util.List<String> inputIds;

    /**
     * The target Id Type.
     * 
     */
    @SerializedName(value = "targetIdType", alternate = {"TargetIdType"})
    @Expose
	@Nullable
    public ExchangeIdFormat targetIdType;

    /**
     * The source Id Type.
     * 
     */
    @SerializedName(value = "sourceIdType", alternate = {"SourceIdType"})
    @Expose
	@Nullable
    public ExchangeIdFormat sourceIdType;


    /**
     * Instiaciates a new UserTranslateExchangeIdsParameterSet
     */
    public UserTranslateExchangeIdsParameterSet() {}
    /**
     * Instiaciates a new UserTranslateExchangeIdsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserTranslateExchangeIdsParameterSet(@Nonnull final UserTranslateExchangeIdsParameterSetBuilder builder) {
        this.inputIds = builder.inputIds;
        this.targetIdType = builder.targetIdType;
        this.sourceIdType = builder.sourceIdType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserTranslateExchangeIdsParameterSetBuilder newBuilder() {
        return new UserTranslateExchangeIdsParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserTranslateExchangeIdsParameterSet
     */
    public static final class UserTranslateExchangeIdsParameterSetBuilder {
        /**
         * The inputIds parameter value
         */
        @Nullable
        protected java.util.List<String> inputIds;
        /**
         * Sets the InputIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserTranslateExchangeIdsParameterSetBuilder withInputIds(@Nullable final java.util.List<String> val) {
            this.inputIds = val;
            return this;
        }
        /**
         * The targetIdType parameter value
         */
        @Nullable
        protected ExchangeIdFormat targetIdType;
        /**
         * Sets the TargetIdType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserTranslateExchangeIdsParameterSetBuilder withTargetIdType(@Nullable final ExchangeIdFormat val) {
            this.targetIdType = val;
            return this;
        }
        /**
         * The sourceIdType parameter value
         */
        @Nullable
        protected ExchangeIdFormat sourceIdType;
        /**
         * Sets the SourceIdType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserTranslateExchangeIdsParameterSetBuilder withSourceIdType(@Nullable final ExchangeIdFormat val) {
            this.sourceIdType = val;
            return this;
        }
        /**
         * Instanciates a new UserTranslateExchangeIdsParameterSetBuilder
         */
        @Nullable
        protected UserTranslateExchangeIdsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserTranslateExchangeIdsParameterSet build() {
            return new UserTranslateExchangeIdsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.inputIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inputIds", inputIds));
        }
        if(this.targetIdType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("targetIdType", targetIdType));
        }
        if(this.sourceIdType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sourceIdType", sourceIdType));
        }
        return result;
    }
}
