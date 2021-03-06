// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartFill;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Fill Request.
 */
public class WorkbookChartFillRequest extends BaseRequest<WorkbookChartFill> {
	
    /**
     * The request for the WorkbookChartFill
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartFillRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartFill.class);
    }

    /**
     * Gets the WorkbookChartFill from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartFill> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookChartFill from the service
     *
     * @return the WorkbookChartFill from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartFill get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartFill> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookChartFill delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookChartFill with a source
     *
     * @param sourceWorkbookChartFill the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartFill> patchAsync(@Nonnull final WorkbookChartFill sourceWorkbookChartFill) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookChartFill);
    }

    /**
     * Patches this WorkbookChartFill with a source
     *
     * @param sourceWorkbookChartFill the source object with updates
     * @return the updated WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartFill patch(@Nonnull final WorkbookChartFill sourceWorkbookChartFill) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartFill> postAsync(@Nonnull final WorkbookChartFill newWorkbookChartFill) {
        return sendAsync(HttpMethod.POST, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the new object to create
     * @return the created WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartFill post(@Nonnull final WorkbookChartFill newWorkbookChartFill) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookChartFill> putAsync(@Nonnull final WorkbookChartFill newWorkbookChartFill) {
        return sendAsync(HttpMethod.PUT, newWorkbookChartFill);
    }

    /**
     * Creates a WorkbookChartFill with a new object
     *
     * @param newWorkbookChartFill the object to create/update
     * @return the created WorkbookChartFill
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartFill put(@Nonnull final WorkbookChartFill newWorkbookChartFill) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartFill);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartFillRequest select(@Nonnull final String value) {
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
     public WorkbookChartFillRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

