// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootGetOffice365ActivationCountsRequest;
import com.microsoft.graph.models.ReportRoot;
import com.microsoft.graph.models.Report;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activation Counts Request Builder.
 */
public class ReportRootGetOffice365ActivationCountsRequestBuilder extends BaseFunctionRequestBuilder<Report> {

    /**
     * The request builder for this ReportRootGetOffice365ActivationCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ReportRootGetOffice365ActivationCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365ActivationCountsRequest instance
     */
    @Nonnull
    public ReportRootGetOffice365ActivationCountsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetOffice365ActivationCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365ActivationCountsRequest instance
     */
    @Nonnull
    public ReportRootGetOffice365ActivationCountsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365ActivationCountsRequest request = new ReportRootGetOffice365ActivationCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}
