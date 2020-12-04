// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.CallUpdateRecordingStatusRequest;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Update Recording Status Request Builder.
 */
public class CallUpdateRecordingStatusRequestBuilder extends BaseActionRequestBuilder<UpdateRecordingStatusOperation> {

    /**
     * The request builder for this CallUpdateRecordingStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param status the status
     * @param clientContext the clientContext
     */
    public CallUpdateRecordingStatusRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final RecordingStatus status, @Nullable final String clientContext) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("status", status);
        bodyParams.put("clientContext", clientContext);
    }

    /**
     * Creates the CallUpdateRecordingStatusRequest
     *
     * @param requestOptions the options for the request
     * @return the CallUpdateRecordingStatusRequest instance
     */
    @Nonnull
    public CallUpdateRecordingStatusRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallUpdateRecordingStatusRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallUpdateRecordingStatusRequest instance
     */
    @Nonnull
    public CallUpdateRecordingStatusRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CallUpdateRecordingStatusRequest request = new CallUpdateRecordingStatusRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("status")) {
            request.body.status = getParameter("status");
        }

        if (hasParameter("clientContext")) {
            request.body.clientContext = getParameter("clientContext");
        }

        return request;
    }
}
