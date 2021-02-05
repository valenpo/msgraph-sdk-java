// Template Source: BaseMethodRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookFunctionResult;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.requests.WorkbookFunctionsCeiling_MathRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.models.WorkbookFunctionsCeiling_MathParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Ceiling_Math Request.
 */
public class WorkbookFunctionsCeiling_MathRequest extends BaseRequest<WorkbookFunctionResult> {
    /**
     * The request for this WorkbookFunctionsCeiling_Math
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookFunctionsCeiling_MathRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookFunctionResult.class);
    }

	/** The body for the method */
    @Nullable
    public WorkbookFunctionsCeiling_MathParameterSet body;
    /**
     * Invokes the method and returns a future with the result
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookFunctionResult> postAsync() {
        return sendAsync(HttpMethod.POST, body);
    }

    /**
     * Invokes the method and returns the result
     * @return result of the method invocation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookFunctionResult post() throws ClientException {
       return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookFunctionsCeiling_MathRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookFunctionsCeiling_MathRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

}
