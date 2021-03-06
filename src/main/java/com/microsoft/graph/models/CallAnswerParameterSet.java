// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.MediaConfig;
import com.microsoft.graph.models.Modality;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Answer Parameter Set.
 */
public class CallAnswerParameterSet {
    /**
     * The callback Uri.
     * 
     */
    @SerializedName(value = "callbackUri", alternate = {"CallbackUri"})
    @Expose
	@Nullable
    public String callbackUri;

    /**
     * The media Config.
     * 
     */
    @SerializedName(value = "mediaConfig", alternate = {"MediaConfig"})
    @Expose
	@Nullable
    public MediaConfig mediaConfig;

    /**
     * The accepted Modalities.
     * 
     */
    @SerializedName(value = "acceptedModalities", alternate = {"AcceptedModalities"})
    @Expose
	@Nullable
    public java.util.List<Modality> acceptedModalities;


    /**
     * Instiaciates a new CallAnswerParameterSet
     */
    public CallAnswerParameterSet() {}
    /**
     * Instiaciates a new CallAnswerParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallAnswerParameterSet(@Nonnull final CallAnswerParameterSetBuilder builder) {
        this.callbackUri = builder.callbackUri;
        this.mediaConfig = builder.mediaConfig;
        this.acceptedModalities = builder.acceptedModalities;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallAnswerParameterSetBuilder newBuilder() {
        return new CallAnswerParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallAnswerParameterSet
     */
    public static final class CallAnswerParameterSetBuilder {
        /**
         * The callbackUri parameter value
         */
        @Nullable
        protected String callbackUri;
        /**
         * Sets the CallbackUri
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallAnswerParameterSetBuilder withCallbackUri(@Nullable final String val) {
            this.callbackUri = val;
            return this;
        }
        /**
         * The mediaConfig parameter value
         */
        @Nullable
        protected MediaConfig mediaConfig;
        /**
         * Sets the MediaConfig
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallAnswerParameterSetBuilder withMediaConfig(@Nullable final MediaConfig val) {
            this.mediaConfig = val;
            return this;
        }
        /**
         * The acceptedModalities parameter value
         */
        @Nullable
        protected java.util.List<Modality> acceptedModalities;
        /**
         * Sets the AcceptedModalities
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallAnswerParameterSetBuilder withAcceptedModalities(@Nullable final java.util.List<Modality> val) {
            this.acceptedModalities = val;
            return this;
        }
        /**
         * Instanciates a new CallAnswerParameterSetBuilder
         */
        @Nullable
        protected CallAnswerParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallAnswerParameterSet build() {
            return new CallAnswerParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.callbackUri != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("callbackUri", callbackUri));
        }
        if(this.mediaConfig != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mediaConfig", mediaConfig));
        }
        if(this.acceptedModalities != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("acceptedModalities", acceptedModalities));
        }
        return result;
    }
}
