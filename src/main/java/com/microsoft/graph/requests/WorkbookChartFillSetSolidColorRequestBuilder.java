// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookChartFillSetSolidColorRequest;
import com.microsoft.graph.models.WorkbookChartFill;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WorkbookChartFillSetSolidColorParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Fill Set Solid Color Request Builder.
 */
public class WorkbookChartFillSetSolidColorRequestBuilder extends BaseActionRequestBuilder<WorkbookChartFill> {

    /**
     * The request builder for this WorkbookChartFillSetSolidColor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartFillSetSolidColorRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private WorkbookChartFillSetSolidColorParameterSet body;
    /**
     * The request builder for this WorkbookChartFillSetSolidColor
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookChartFillSetSolidColorRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookChartFillSetSolidColorParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookChartFillSetSolidColorRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartFillSetSolidColorRequest instance
     */
    @Nonnull
    public WorkbookChartFillSetSolidColorRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookChartFillSetSolidColorRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookChartFillSetSolidColorRequest instance
     */
    @Nonnull
    public WorkbookChartFillSetSolidColorRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookChartFillSetSolidColorRequest request = new WorkbookChartFillSetSolidColorRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}