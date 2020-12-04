// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsHyperlinkRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Hyperlink Request Builder.
 */
public class WorkbookFunctionsHyperlinkRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsHyperlink
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param linkLocation the linkLocation
     * @param friendlyName the friendlyName
     */
    public WorkbookFunctionsHyperlinkRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement linkLocation, @Nullable final com.google.gson.JsonElement friendlyName) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("linkLocation", linkLocation);
        bodyParams.put("friendlyName", friendlyName);
    }

    /**
     * Creates the WorkbookFunctionsHyperlinkRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsHyperlinkRequest instance
     */
    @Nonnull
    public WorkbookFunctionsHyperlinkRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsHyperlinkRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsHyperlinkRequest instance
     */
    @Nonnull
    public WorkbookFunctionsHyperlinkRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsHyperlinkRequest request = new WorkbookFunctionsHyperlinkRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("linkLocation")) {
            request.body.linkLocation = getParameter("linkLocation");
        }

        if (hasParameter("friendlyName")) {
            request.body.friendlyName = getParameter("friendlyName");
        }

        return request;
    }
}
