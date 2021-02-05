// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.TargetedManagedAppConfigurationAssignRequest;
import com.microsoft.graph.models.TargetedManagedAppConfiguration;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.TargetedManagedAppConfigurationAssignParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Assign Request Builder.
 */
public class TargetedManagedAppConfigurationAssignRequestBuilder extends BaseActionRequestBuilder<TargetedManagedAppConfiguration> {

    private TargetedManagedAppConfigurationAssignParameterSet body;
    /**
     * The request builder for this TargetedManagedAppConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TargetedManagedAppConfigurationAssignRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TargetedManagedAppConfigurationAssignParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the TargetedManagedAppConfigurationAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppConfigurationAssignRequest instance
     */
    @Nonnull
    public TargetedManagedAppConfigurationAssignRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TargetedManagedAppConfigurationAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppConfigurationAssignRequest instance
     */
    @Nonnull
    public TargetedManagedAppConfigurationAssignRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TargetedManagedAppConfigurationAssignRequest request = new TargetedManagedAppConfigurationAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
