// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationSetPriorityRequest;
import com.microsoft.graph.models.extensions.DeviceEnrollmentConfiguration;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Set Priority Request Builder.
 */
public class DeviceEnrollmentConfigurationSetPriorityRequestBuilder extends BaseActionRequestBuilder<DeviceEnrollmentConfiguration> {

    /**
     * The request builder for this DeviceEnrollmentConfigurationSetPriority
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param priority the priority
     */
    public DeviceEnrollmentConfigurationSetPriorityRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final Integer priority) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("priority", priority);
    }

    /**
     * Creates the DeviceEnrollmentConfigurationSetPriorityRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceEnrollmentConfigurationSetPriorityRequest instance
     */
    @Nonnull
    public DeviceEnrollmentConfigurationSetPriorityRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceEnrollmentConfigurationSetPriorityRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceEnrollmentConfigurationSetPriorityRequest instance
     */
    @Nonnull
    public DeviceEnrollmentConfigurationSetPriorityRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceEnrollmentConfigurationSetPriorityRequest request = new DeviceEnrollmentConfigurationSetPriorityRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("priority")) {
            request.body.priority = getParameter("priority");
        }

        return request;
    }
}
