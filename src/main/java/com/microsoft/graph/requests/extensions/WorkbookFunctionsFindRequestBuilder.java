// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFindRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Find Request Builder.
 */
public class WorkbookFunctionsFindRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsFind
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param findText the findText
     * @param withinText the withinText
     * @param startNum the startNum
     */
    public WorkbookFunctionsFindRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement findText, @Nullable final com.google.gson.JsonElement withinText, @Nullable final com.google.gson.JsonElement startNum) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("findText", findText);
        bodyParams.put("withinText", withinText);
        bodyParams.put("startNum", startNum);
    }

    /**
     * Creates the WorkbookFunctionsFindRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsFindRequest instance
     */
    @Nonnull
    public WorkbookFunctionsFindRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsFindRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsFindRequest instance
     */
    @Nonnull
    public WorkbookFunctionsFindRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsFindRequest request = new WorkbookFunctionsFindRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("findText")) {
            request.body.findText = getParameter("findText");
        }

        if (hasParameter("withinText")) {
            request.body.withinText = getParameter("withinText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        return request;
    }
}
