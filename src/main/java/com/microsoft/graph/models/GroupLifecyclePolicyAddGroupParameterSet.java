// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Lifecycle Policy Add Group Parameter Set.
 */
public class GroupLifecyclePolicyAddGroupParameterSet {
    /**
     * The group Id.
     * 
     */
    @SerializedName(value = "groupId", alternate = {"GroupId"})
    @Expose
	@Nullable
    public String groupId;


    /**
     * Instiaciates a new GroupLifecyclePolicyAddGroupParameterSet
     */
    public GroupLifecyclePolicyAddGroupParameterSet() {}
    /**
     * Instiaciates a new GroupLifecyclePolicyAddGroupParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected GroupLifecyclePolicyAddGroupParameterSet(@Nonnull final GroupLifecyclePolicyAddGroupParameterSetBuilder builder) {
        this.groupId = builder.groupId;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static GroupLifecyclePolicyAddGroupParameterSetBuilder newBuilder() {
        return new GroupLifecyclePolicyAddGroupParameterSetBuilder();
    }
    /**
     * Fluent builder for the GroupLifecyclePolicyAddGroupParameterSet
     */
    public static final class GroupLifecyclePolicyAddGroupParameterSetBuilder {
        /**
         * The groupId parameter value
         */
        @Nullable
        protected String groupId;
        /**
         * Sets the GroupId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public GroupLifecyclePolicyAddGroupParameterSetBuilder withGroupId(@Nullable final String val) {
            this.groupId = val;
            return this;
        }
        /**
         * Instanciates a new GroupLifecyclePolicyAddGroupParameterSetBuilder
         */
        @Nullable
        protected GroupLifecyclePolicyAddGroupParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public GroupLifecyclePolicyAddGroupParameterSet build() {
            return new GroupLifecyclePolicyAddGroupParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.groupId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("groupId", groupId));
        }
        return result;
    }
}
