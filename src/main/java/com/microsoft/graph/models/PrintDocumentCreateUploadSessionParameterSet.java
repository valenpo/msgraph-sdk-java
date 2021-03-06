// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.PrintDocumentUploadProperties;
import com.microsoft.graph.models.UploadSession;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Document Create Upload Session Parameter Set.
 */
public class PrintDocumentCreateUploadSessionParameterSet {
    /**
     * The properties.
     * 
     */
    @SerializedName(value = "properties", alternate = {"Properties"})
    @Expose
	@Nullable
    public PrintDocumentUploadProperties properties;


    /**
     * Instiaciates a new PrintDocumentCreateUploadSessionParameterSet
     */
    public PrintDocumentCreateUploadSessionParameterSet() {}
    /**
     * Instiaciates a new PrintDocumentCreateUploadSessionParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected PrintDocumentCreateUploadSessionParameterSet(@Nonnull final PrintDocumentCreateUploadSessionParameterSetBuilder builder) {
        this.properties = builder.properties;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PrintDocumentCreateUploadSessionParameterSetBuilder newBuilder() {
        return new PrintDocumentCreateUploadSessionParameterSetBuilder();
    }
    /**
     * Fluent builder for the PrintDocumentCreateUploadSessionParameterSet
     */
    public static final class PrintDocumentCreateUploadSessionParameterSetBuilder {
        /**
         * The properties parameter value
         */
        @Nullable
        protected PrintDocumentUploadProperties properties;
        /**
         * Sets the Properties
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PrintDocumentCreateUploadSessionParameterSetBuilder withProperties(@Nullable final PrintDocumentUploadProperties val) {
            this.properties = val;
            return this;
        }
        /**
         * Instanciates a new PrintDocumentCreateUploadSessionParameterSetBuilder
         */
        @Nullable
        protected PrintDocumentCreateUploadSessionParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PrintDocumentCreateUploadSessionParameterSet build() {
            return new PrintDocumentCreateUploadSessionParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.properties != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("properties", properties));
        }
        return result;
    }
}
