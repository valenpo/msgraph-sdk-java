// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsDdbRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctions;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Ddb Request Builder.
 */
public class WorkbookFunctionsDdbRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    /**
     * The request builder for this WorkbookFunctionsDdb
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param cost the cost
     * @param salvage the salvage
     * @param life the life
     * @param period the period
     * @param factor the factor
     */
    public WorkbookFunctionsDdbRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement cost, @Nullable final com.google.gson.JsonElement salvage, @Nullable final com.google.gson.JsonElement life, @Nullable final com.google.gson.JsonElement period, @Nullable final com.google.gson.JsonElement factor) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("cost", cost);
        bodyParams.put("salvage", salvage);
        bodyParams.put("life", life);
        bodyParams.put("period", period);
        bodyParams.put("factor", factor);
    }

    /**
     * Creates the WorkbookFunctionsDdbRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDdbRequest instance
     */
    @Nonnull
    public WorkbookFunctionsDdbRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsDdbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsDdbRequest instance
     */
    @Nonnull
    public WorkbookFunctionsDdbRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsDdbRequest request = new WorkbookFunctionsDdbRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("cost")) {
            request.body.cost = getParameter("cost");
        }

        if (hasParameter("salvage")) {
            request.body.salvage = getParameter("salvage");
        }

        if (hasParameter("life")) {
            request.body.life = getParameter("life");
        }

        if (hasParameter("period")) {
            request.body.period = getParameter("period");
        }

        if (hasParameter("factor")) {
            request.body.factor = getParameter("factor");
        }

        return request;
    }
}
