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
 * The class for the Workbook Functions Odd FPrice Parameter Set.
 */
public class WorkbookFunctionsOddFPriceParameterSet {
    /**
     * The settlement.
     * 
     */
    @SerializedName(value = "settlement", alternate = {"Settlement"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName(value = "maturity", alternate = {"Maturity"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement maturity;

    /**
     * The issue.
     * 
     */
    @SerializedName(value = "issue", alternate = {"Issue"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement issue;

    /**
     * The first Coupon.
     * 
     */
    @SerializedName(value = "firstCoupon", alternate = {"FirstCoupon"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement firstCoupon;

    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The yld.
     * 
     */
    @SerializedName(value = "yld", alternate = {"Yld"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement yld;

    /**
     * The redemption.
     * 
     */
    @SerializedName(value = "redemption", alternate = {"Redemption"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement redemption;

    /**
     * The frequency.
     * 
     */
    @SerializedName(value = "frequency", alternate = {"Frequency"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement frequency;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement basis;


    /**
     * Instiaciates a new WorkbookFunctionsOddFPriceParameterSet
     */
    public WorkbookFunctionsOddFPriceParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsOddFPriceParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsOddFPriceParameterSet(@Nonnull final WorkbookFunctionsOddFPriceParameterSetBuilder builder) {
        this.settlement = builder.settlement;
        this.maturity = builder.maturity;
        this.issue = builder.issue;
        this.firstCoupon = builder.firstCoupon;
        this.rate = builder.rate;
        this.yld = builder.yld;
        this.redemption = builder.redemption;
        this.frequency = builder.frequency;
        this.basis = builder.basis;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsOddFPriceParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsOddFPriceParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsOddFPriceParameterSet
     */
    public static final class WorkbookFunctionsOddFPriceParameterSetBuilder {
        /**
         * The settlement parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement settlement;
        /**
         * Sets the Settlement
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
            this.settlement = val;
            return this;
        }
        /**
         * The maturity parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement maturity;
        /**
         * Sets the Maturity
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withMaturity(@Nullable final com.google.gson.JsonElement val) {
            this.maturity = val;
            return this;
        }
        /**
         * The issue parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement issue;
        /**
         * Sets the Issue
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withIssue(@Nullable final com.google.gson.JsonElement val) {
            this.issue = val;
            return this;
        }
        /**
         * The firstCoupon parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement firstCoupon;
        /**
         * Sets the FirstCoupon
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withFirstCoupon(@Nullable final com.google.gson.JsonElement val) {
            this.firstCoupon = val;
            return this;
        }
        /**
         * The rate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The yld parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement yld;
        /**
         * Sets the Yld
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withYld(@Nullable final com.google.gson.JsonElement val) {
            this.yld = val;
            return this;
        }
        /**
         * The redemption parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement redemption;
        /**
         * Sets the Redemption
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withRedemption(@Nullable final com.google.gson.JsonElement val) {
            this.redemption = val;
            return this;
        }
        /**
         * The frequency parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement frequency;
        /**
         * Sets the Frequency
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withFrequency(@Nullable final com.google.gson.JsonElement val) {
            this.frequency = val;
            return this;
        }
        /**
         * The basis parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement basis;
        /**
         * Sets the Basis
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSetBuilder withBasis(@Nullable final com.google.gson.JsonElement val) {
            this.basis = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsOddFPriceParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsOddFPriceParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsOddFPriceParameterSet build() {
            return new WorkbookFunctionsOddFPriceParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.settlement != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("settlement", settlement));
        }
        if(this.maturity != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maturity", maturity));
        }
        if(this.issue != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("issue", issue));
        }
        if(this.firstCoupon != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("firstCoupon", firstCoupon));
        }
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.yld != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("yld", yld));
        }
        if(this.redemption != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("redemption", redemption));
        }
        if(this.frequency != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("frequency", frequency));
        }
        if(this.basis != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("basis", basis));
        }
        return result;
    }
}
